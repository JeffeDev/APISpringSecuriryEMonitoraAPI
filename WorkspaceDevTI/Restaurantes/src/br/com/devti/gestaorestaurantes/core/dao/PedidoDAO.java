package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.PedidoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PedidoDAO {

	public String salvar(PedidoEntity pedido) throws NegocioException{
		
 		String sql = "INSERT INTO tbl_pedidos (data_compra, id_cliente, valor_total_pedido) "
 				+ "   VALUES (?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, pedido.getDataCompra());
			ps.setLong(2, pedido.getIdCliente());
			ps.setBigDecimal(3, pedido.getValorTotalPedido());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar pedido : " + e.getMessage());
			
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

	public static List<PedidoEntity> listar() throws NegocioException {
		String sql = "SELECT ped.id, ped.data_compra, ped.id_cliente, ped.valor_total_pedido "
				+ "   FROM tbl_pedidos ped";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<PedidoEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	PedidoEntity pedido = new PedidoEntity();
            	
            	pedido.setId(rs.getLong("ID"));
            	pedido.setDataCompra(rs.getString("data_compra"));
            	pedido.setIdCliente(rs.getLong("id_cliente"));
            	pedido.setValorTotalPedido(rs.getBigDecimal("valor_total_pedido"));
            	
            	listagem.add(pedido);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar Pedido !" + ex.getMessage());
        }
		return listagem;
	}

}
