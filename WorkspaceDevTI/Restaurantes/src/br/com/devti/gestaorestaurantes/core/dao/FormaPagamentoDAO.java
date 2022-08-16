package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.FormaPagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FormaPagamentoDAO {

	public static List<FormaPagamentoEntity> listar() throws NegocioException {
		String sql = "SELECT pg.id, pg.tipo_pagamento FROM tbl_formas_pagto pg";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<FormaPagamentoEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	FormaPagamentoEntity formaPagto = new FormaPagamentoEntity();
            	
            	formaPagto.setId(rs.getLong("ID"));
            	formaPagto.setTipoPagamento(rs.getString("tipo_pagamento"));
            	
            	listagem.add(formaPagto);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar Forma Pagto !" + ex.getMessage());
        }
		return listagem;
	}


	public static String salvar(FormaPagamentoEntity formaPagamentoDao) throws NegocioException {
 		String sql = "INSERT INTO tbl_formaPagto (dt_inicio_parceria, nome_fornecedor) "
 				+ "VALUES (?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, formaPagamentoDao.getTipoPagamento());
			
			ps.execute();
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar formaPagto");
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
 		return "Forma de pagamento gravado com sucesso!";
	}
}
