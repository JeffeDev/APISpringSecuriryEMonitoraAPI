package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.AcessoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class AcessoDAO {

	public boolean verificarAcessoUsuario(AcessoEntity acessoUsuario) throws NegocioException {
 		String sql = "SELECT LOGIN, SENHA "
 				+ "FROM tbl_usuarios WHERE LOGIN = ? AND SENHA = ?";
 		boolean autenticado = false;
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, acessoUsuario.getLogin());
			ps.setString(2, acessoUsuario.getSenha());
			
			ResultSet rs;
            rs = ps.executeQuery();
			
            if (rs.next()) {                
                autenticado = true;
            } else {
            	autenticado = false;
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro Acesso !" + ex.getMessage());
        }
 		
 		return autenticado;
	}
}
