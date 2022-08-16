package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.PagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PagamentoDAO {

	public String salvar(PagamentoEntity pagamento) throws NegocioException {
 		String sql = "INSERT INTO tbl_pagamentos_efetuados "
 				+ "(dt_pagto, id_forma_pagto, troco, valor_pago, valor_recebido) "
 				+ "   VALUES (?,?,?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, pagamento.getDataPagto());
			ps.setLong(2, pagamento.getIdFormaPagto());
			ps.setBigDecimal(3, pagamento.getTroco());
			ps.setBigDecimal(4, pagamento.getValorPago());
			ps.setBigDecimal(5, pagamento.getValorRecebido());
			ps.execute();
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar pagamento : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Pagamento cadastrado com sucesso no banco de dados";

	}

	public static List<PagamentoEntity> listar() throws NegocioException {
		String sql = "SELECT pagto.id, pagto.dt_pagto, pagto.id_forma_pagto, pagto.id_pedido, "
			  		+ "pagto.troco, pagto.valor_pago, pagto.valor_recebido "
			  		+ "FROM tbl_pagamentos_efetuados pagto";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<PagamentoEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	PagamentoEntity pagamento = new PagamentoEntity();
            	
            	pagamento.setId(rs.getLong("ID"));
            	pagamento.setDtPagto(rs.getString("dt_pagto"));
            	pagamento.setIdFormaPagto(rs.getLong("id_forma_pagto"));
            	pagamento.setIdPedido(rs.getLong("id_pedido"));
            	pagamento.setTroco(rs.getBigDecimal("troco"));
            	pagamento.setValorPago(rs.getBigDecimal("valor_pago"));
            	pagamento.setValorRecebido(rs.getBigDecimal("valor_pago"));
            	
            	listagem.add(pagamento);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar Pedido !" + ex.getMessage());
        }
		return listagem;

	}

}
