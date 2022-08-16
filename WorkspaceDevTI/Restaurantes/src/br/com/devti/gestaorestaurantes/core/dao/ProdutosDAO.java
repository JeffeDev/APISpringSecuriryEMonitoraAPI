package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.ProdutosEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class ProdutosDAO {
		
	public String salvar(ProdutosEntity produto) throws NegocioException {
 		String sql = "INSERT INTO tbl_produtos "
 				+ "(nome_produto, codigo_de_barras, dt_ultima_compra, dt_ultima_venda,"
 				+ "id_familia_produto, id_fornecedor, id_local_impressao, "
 				+ "id_lote_compra, margem_lucro,  "
 				+ "preco_compra, preco_venda) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, produto.getNomeProduto());
			ps.setString(2, produto.getCodigoDeBarras());
			ps.setString(3, produto.getDtUltimaCompra());
			ps.setString(4, produto.getDtUltimaVenda());
			ps.setLong(5, produto.getIdFamiliaProduto());
			ps.setLong(6, produto.getIdFornecedor());
			ps.setLong(7, produto.getIdLocalImpressao());
			ps.setLong(8, produto.getIdLoteCompra());
			ps.setBigDecimal(9, produto.getMargemLucro());
			ps.setBigDecimal(10, produto.getPrecoCompra());
			ps.setBigDecimal(11, produto.getPrecoVenda());
			ps.execute();
			
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar produto : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	
		return "produto cadastrado com sucesso no banco de dados";

	}

	public static List<ProdutosEntity> listar() throws NegocioException {
		String sql = "SELECT prod.id, prod.nome_produto, prod.codigo_de_barras, "
				+ "prod.dt_ultima_compra, prod.dt_ultima_venda,"
				+ "prod.id_familia_produto, prod.id_fornecedor, prod.id_local_impressao, "
				+ "prod.id_lote_compra, prod.margem_lucro, "
				+ "prod.preco_compra, prod.preco_venda "
				+ "FROM tbl_produto prod ";
		
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<ProdutosEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	ProdutosEntity produto = new ProdutosEntity();
            	
            	produto.setId(rs.getLong("ID"));
            	produto.setNomeProduto(rs.getString("nome_produto"));
            	produto.setCodigoDeBarras(rs.getString("codigo_de_barras"));
            	produto.setDtUltimaCompra(rs.getString("dt_ultima_compra"));
            	produto.setDtUltimaVenda(rs.getString("dt_ultima_venda"));
            	produto.setIdFamiliaProduto(rs.getLong("id_familia_produto"));
            	produto.setIdFornecedor(rs.getLong("id_fornecedor"));
            	produto.setIdLocalImpressao(rs.getLong("id_local_impressao"));
            	produto.setIdLoteCompra(rs.getLong("id_lote_compra"));
            	produto.setMargemLucro(rs.getBigDecimal("margem_lucro"));
            	produto.setPrecoCompra(rs.getBigDecimal("preco_compra"));
            	produto.setPrecoVenda(rs.getBigDecimal("preco_venda"));
            	listagem.add(produto);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao listar produto !" + ex.getMessage());
        }
		return listagem;

	}

}
