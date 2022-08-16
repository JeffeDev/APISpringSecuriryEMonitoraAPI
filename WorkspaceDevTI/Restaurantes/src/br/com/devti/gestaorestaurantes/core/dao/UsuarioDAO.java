package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class UsuarioDAO {

	public String salvar(UsuarioEntity usuario) throws NegocioException{
						
 		String sql = "INSERT INTO usuario (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getEmail());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar usuario : " + e.getMessage());
			
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

	public static List<UsuarioEntity> listar() throws NegocioException {
		String sql = "SELECT us.id, us.nome, us.login, us.email, us.celular, us.cpf, us.dt_Nascimento, us.cidade_Nascimento FROM usuario us ";
		PreparedStatement ps = null;
		ResultSet rs;
		List<UsuarioEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	UsuarioEntity usuario = new UsuarioEntity();
            	usuario.setId(rs.getLong("ID"));
            	usuario.setNome(rs.getString("NOME"));
            	usuario.setLogin(rs.getString("login"));
            	usuario.setEmail(rs.getString("email"));
            	listagem.add(usuario);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar usuário !" + ex.getMessage());
        }
		return listagem;
	}
	
}








