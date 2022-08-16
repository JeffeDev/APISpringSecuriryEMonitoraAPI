package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.LoteCompraEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LoteCompraDAO {

	public String salvar(LoteCompraEntity loteCompra) throws NegocioException {
 		String sql = "INSERT INTO tbl_lotes_compra "
 				+ "(lote.id, lote.dt_compra, lote.dt_fabricacao, lote.dt_validade, "
 				+ "lote.numero_lote, lote.numeronfe) "
 				+ "   VALUES (?,?,?,?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
		    
			ps.setLong(1, loteCompra.getId());
			ps.setString(2, loteCompra.getDataCompra());
			ps.setString(3, loteCompra.getDataFabricacao());
			ps.setString(4, loteCompra.getDataValidade());
			ps.setString(5, loteCompra.getNumeroLote());
			ps.setString(6, loteCompra.getNumeroNFe());
			ps.execute();
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar loteCompra : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "LoteCompra cadastrado com sucesso no banco de dados";

	}

	public static List<LoteCompraEntity> listar() throws NegocioException {
		String sql = "SELECT lote.id, lote.dt_compra, lote.dt_fabricacao, lote.dt_validade, "
				+ "lote.numero_lote, lote.numeronfe "
				+ "FROM tbl_lotes_compra lote;";
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<LoteCompraEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
            	LoteCompraEntity loteCompra = new LoteCompraEntity();
            	loteCompra.setId(rs.getLong("ID"));
            	loteCompra.setDtCompra(rs.getString("dt_compra"));
            	loteCompra.setDtFabricacao(rs.getString("dt_fabricacao"));
            	loteCompra.setDtValidade(rs.getString("dt_validade"));
            	loteCompra.setNumeroLote(rs.getString("numero_lote"));
            	loteCompra.setNumeroNFe(rs.getString("numeronfe"));
            	
            	listagem.add(loteCompra);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar Lote !" + ex.getMessage());
        }
		return listagem;

	}

}
