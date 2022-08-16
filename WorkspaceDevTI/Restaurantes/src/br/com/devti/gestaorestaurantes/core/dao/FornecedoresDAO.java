package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.FornecedoresEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FornecedoresDAO {

	public String salvar(FornecedoresEntity fornecedores) throws NegocioException {
 		String sql = "INSERT INTO tbl_fornecedores (dt_inicio_parceria, nome_fornecedor) "
 				+ "VALUES (?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, fornecedores.getDtInicioParceria());
			ps.setString(2, fornecedores.getNomeFornecedor());
			
			ps.execute();
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar fornecedores");
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
		return "Fornecedor cadastrado com sucesso no banco de dados";

	}

	public static List<FornecedoresEntity> listar() throws NegocioException {
		String sql = "SELECT fornec.id, fornec.dt_inicio_parceria, fornec.nome_fornecedor "
				+ "FROM tbl_fornecedores fornec";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<FornecedoresEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	FornecedoresEntity fornecedores = new FornecedoresEntity();
            	
            	fornecedores.setId(rs.getLong("ID"));
            	fornecedores.setDtInicioParceria(rs.getString("dt_inicio_parceria"));
            	fornecedores.setNomeFornecedor(rs.getString("nome_fornecedor"));
            	
            	listagem.add(fornecedores);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar Fornecedor !" + ex.getMessage());
        }
		return listagem;
	}



}