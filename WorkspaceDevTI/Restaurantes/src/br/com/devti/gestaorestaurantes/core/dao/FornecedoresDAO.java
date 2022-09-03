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

	public static FornecedoresEntity buscaPorId(Long Id) throws NegocioException {
		String sql = "SELECT fo.id, fo.nome, fo.login, fo.celular, fo.telefone,  fo.cep, "
				+ "fo.endereco, fo.numero, fo.bairro, fo.cidade,  fo.estado, fo.complemento, "
				+ "fo.cpf, fo.data_abertura, fo.email, fo.gps, fo.obs fo.senha " + "FROM tbl_fornecs us WHERE id = ? ";

		PreparedStatement ps = null;
		ResultSet rs = null;

		FornecedoresEntity fornec = null;

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setLong(1, Id);

			rs = ps.executeQuery();

			if (rs.next()) {

				fornec = new FornecedoresEntity();

				fornec.setId(rs.getLong("id"));
				fornec.setRazao(rs.getString("razao"));
				fornec.setEmail(rs.getString("email"));
				fornec.setCelular(rs.getString("celular"));
				fornec.setTelefone(rs.getString("telefone"));
				fornec.setCep(rs.getString("cep"));
				fornec.setCnpj(rs.getString("cnpj"));
				fornec.setDataAbertura(rs.getString("data_abertura"));
				fornec.setEmail(rs.getString("email"));
				fornec.setGps(rs.getString("gps"));
				fornec.setObs(rs.getString("obs"));
			}

			return fornec;

		} catch (SQLException ex) {
			throw new NegocioException("Erro ao consultar Usuário por id !" + ex.getMessage());
		} finally {
			try {
				ps.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public String excluir(Long id) throws NegocioException {
		String sql = "DELETE FROM tbl_fornecedores " + "    WHERE id = ?";

		PreparedStatement ps = null;

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setLong(1, id);

			ps.execute();

		} catch (SQLException e) {
			throw new NegocioException("Não foi possível excluir: ERRO -> " + e.getMessage());
		} finally {
			try {
				ps.close();
			} catch (Exception erroAoFechar) {
				erroAoFechar.printStackTrace();
			}
		}
		return "Registro excluído com sucesso!";
	}

	public String salvarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
		String sql = "INSERT INTO tbl_fornecedores (razao, cnpj, celular, telefone,  cep, endereco, numero, bairro, cidade, "
				+ "estado, complemento,  data_abertura, email, gps, obs ) "
				+ "VALUES  (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement ps = null;

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, fornec.getRazao());
			ps.setString(2, fornec.getCnpj());
			ps.setString(3, fornec.getCelular());
			ps.setString(4, fornec.getTelefone());
			ps.setString(5, fornec.getCep());
			ps.setString(6, fornec.getEndereco());
			ps.setString(7, fornec.getNumero());
			ps.setString(8, fornec.getBairro());
			ps.setString(9, fornec.getCidade());
			ps.setString(10, fornec.getEstado());
			ps.setString(11, fornec.getComplemento());
			ps.setString(12, fornec.getDataAbertura());
			ps.setString(13, fornec.getEmail());
			ps.setString(14, fornec.getGps());
			ps.setString(15, fornec.getObs());
			ps.execute();

		} catch (SQLException e) {
			throw new NegocioException("Erro ao cadastrar dados completos do fornecedor : " + e.getMessage());

		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return "Usuario cadastrado com sucesso no banco de dados";
	}

	public String alterarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
		PreparedStatement ps = null;

		String sql = "UPDATE  tbl_fornecedores set " + "razao=?, " + "celular=?, " + "telefone=?,  " + "cep=?, "
				+ "endereco=?, " + "numero=?, " + "bairro=?, " + "cidade=?, " + "estado=?, " + "complemento=?, "
				+ "cnpj=?, " + "data_abertura=?, " + "email=?, " + "gps=?, " + "obs=? " + "WHERE id = ?";

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);

			ps.setString(1, fornec.getRazao());
			ps.setString(2, fornec.getCelular());
			ps.setString(3, fornec.getTelefone());
			ps.setString(4, fornec.getCep());
			ps.setString(5, fornec.getEndereco());
			ps.setString(6, fornec.getNumero());
			ps.setString(7, fornec.getBairro());
			ps.setString(8, fornec.getCidade());
			ps.setString(9, fornec.getEstado());
			ps.setString(10, fornec.getComplemento());
			ps.setString(11, fornec.getCnpj());
			ps.setString(12, fornec.getDataAbertura());
			ps.setString(13, fornec.getEmail());
			ps.setString(14, fornec.getGps());
			ps.setString(15, fornec.getObs());

			ps.setLong(16, fornec.getId());

			ps.execute();

		} catch (SQLException e) {
			throw new NegocioException("Erro ao alterar dados completos do fornecedor : " + e.getMessage());

		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Registro gravado com suecesso!";
	}

	public static List<FornecedoresEntity> listarDadosFornecedores() throws NegocioException {
		String sql = "SELECT fo.id, fo.razao, fo.celular, fo.telefone,  fo.cep, fo.endereco, fo.numero, fo.bairro, fo.cidade, "
				+ "fo.estado, fo.complemento, fo.cnpj, fo.data_abertura, fo.email, fo.gps, fo.obs "
				+ "FROM tbl_fornecedores fo ";
		PreparedStatement ps = null;
		ResultSet rs;
		List<FornecedoresEntity> listagem = new ArrayList<>();

		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				FornecedoresEntity fornec = new FornecedoresEntity();

				fornec.setId(rs.getLong("ID"));
				fornec.setRazao(rs.getString("RAZAO"));
				fornec.setCelular(rs.getString("CELULAR"));
				fornec.setTelefone(rs.getString("TELEFONE"));
				fornec.setCep(rs.getString("CEP"));
				fornec.setEndereco(rs.getString("ENDERECO"));
				fornec.setNumero(rs.getString("NUMERO"));
				fornec.setBairro(rs.getString("BAIRRO"));
				fornec.setCidade(rs.getString("CIDADE"));
				fornec.setEstado(rs.getString("ESTADO"));
				fornec.setComplemento(rs.getString("COMPLEMENTO"));
				fornec.setCnpj(rs.getString("CNPJ"));
				fornec.setDataAbertura(rs.getString("DATA_ABERTURA"));
				fornec.setEmail(rs.getString("email"));
				fornec.setGps(rs.getString("GPS"));
				fornec.setObs(rs.getString("OBS"));

				listagem.add(fornec);

				System.out.println(fornec);
			}
			ps.close();

		} catch (SQLException ex) {
			throw new NegocioException("Erro ao listar fornecedores !" + ex.getMessage());
		}
		return listagem;
	}

}
