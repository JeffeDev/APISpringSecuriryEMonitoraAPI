package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.LiberacaoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LiberacaoDAO {

	public String salvar(LiberacaoUsuarioEntity liberacaoUsuario) throws NegocioException{
		
 		String sql = "INSERT INTO tbl_liberacaoUsuario (id_grupo_usuario, id_recurso, id_usuario) "
 				+ "   VALUES (?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setLong(1, liberacaoUsuario.getIdGrupoUsuario());
			ps.setLong(2, liberacaoUsuario.getIdRecurso());
			ps.setLong(3, liberacaoUsuario.getIdUsuario());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar liberacaoUsuario : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	
		return "Usuario cadastrado com sucesso no banco de dados";
	}

	public static List<LiberacaoUsuarioEntity> listar() throws NegocioException {
		String sql = "SELECT lib.id, lib.id_grupo_usuario, lib.id_recurso, lib.id_usuario "
				+ "   FROM tbl_liberacaoUsuario lib";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<LiberacaoUsuarioEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	LiberacaoUsuarioEntity liberacaoUsuario = new LiberacaoUsuarioEntity();
            	
            	liberacaoUsuario.setId(rs.getLong("ID"));
            	liberacaoUsuario.setIdGrupoUsuario(rs.getLong("id_grupo_usuario"));
            	liberacaoUsuario.setIdRecurso(rs.getLong("id_recurso"));
            	liberacaoUsuario.setIdUsuario(rs.getLong("id_usuario"));
            	
            	listagem.add(liberacaoUsuario);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar LiberacaoUsuario !" + ex.getMessage());
        }
		return listagem;
	}

}
