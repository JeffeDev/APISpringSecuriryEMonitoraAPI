package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class GrupoUsuarioDAO {

	public String salvarUsuario(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
 		String sql = "INSERT INTO GRUPO_USUARIO (NOME_GRUPO) VALUES (?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, grupoUsuario.getNomeGrupo());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
//			e.printStackTrace();
			throw new NegocioException("Erro ao cadastrar GrupoUsuario");
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	
		return "GrupoUsuario cadastrado com sucesso no banco de dados";

	}

}
