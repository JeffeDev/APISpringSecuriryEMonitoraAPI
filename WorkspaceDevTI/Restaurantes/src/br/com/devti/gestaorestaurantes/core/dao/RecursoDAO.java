package br.com.devti.gestaorestaurantes.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaorestaurantes.core.entity.RecursoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class RecursoDAO {

	public String salvar(RecursoEntity recurso) throws NegocioException {

		String sql = "INSERT INTO tbl_recurso (NOME_RECURSO, CAMINHO_TELA) VALUES (?,?)";

		PreparedStatement ps = null;

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, recurso.getNomeRecurso());
			ps.setString(2, recurso.getCaminhoTela());

			ps.execute();
			
		} catch (SQLException e) {
			throw new NegocioException("Erro ao tentar gravar recurso no banco");
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "Recurso cadastrado com sucesso";
	}

	public static List<RecursoEntity> listar() throws NegocioException {
		String sql = "SELECT rec.id, rec.nome_recurso, rec.caminho_tela FROM tbl_recurso recurso ";
		
		PreparedStatement ps = null;
		ResultSet rs;
		
		List<RecursoEntity> listagem = new ArrayList<>();
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	RecursoEntity recurso = new RecursoEntity();
            	recurso.setid(rs.getLong("ID"));
            	recurso.setNomeRecurso(rs.getString("nome_recurso"));
            	recurso.setCaminhoTela(rs.getString("caminho_tela"));
            	listagem.add(recurso);
            }
            ps.close(); 
            
        } catch (SQLException ex){
        	throw new NegocioException("Erro ao cadastrar recursouário !" + ex.getMessage());
        }
		return listagem;

	}
}
