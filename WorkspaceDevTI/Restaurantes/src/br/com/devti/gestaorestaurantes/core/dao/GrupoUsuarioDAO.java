package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class GrupoUsuarioDAO {

	public String salvar(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
 		String sql = "INSERT INTO GRUPO_USUARIO (NOME_GRUPO) VALUES (?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, grupoUsuario.getNomeGrupo());
			
			ps.execute();
			
		} catch (SQLException e) {	
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

	public static List<GrupoUsuarioEntity> listar() throws NegocioException {
		String sql = "SELECT grupo.id, grupo.nome_grupo "
				+ "   FROM tbl_grupo_usuarios grupo";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<GrupoUsuarioEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	GrupoUsuarioEntity grupoUsuarios = new GrupoUsuarioEntity();
            	
            	grupoUsuarios.setId(rs.getLong("ID"));
            	grupoUsuarios.setNomeGrupo(rs.getString("nome_grupo"));
            	
            	listagem.add(grupoUsuarios);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar GrupoUsuario !" + ex.getMessage());
        }
		return listagem;
	}

}
