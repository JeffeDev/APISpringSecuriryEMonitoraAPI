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

	public String salvarDadosAcesso(UsuarioEntity usuario) throws NegocioException{
						
 		String sql = "INSERT INTO tbl_usuarios (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
 		
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
		String sql = "SELECT us.id, us.nome, us.login, us.email, us.celular "
				+ "FROM tbl_usuarios us ";
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

	public static UsuarioEntity buscaPorId(Long Id) throws NegocioException {
		String sql = "SELECT us.id, us.nome, us.login, us.celular, us.telefone,  us.cep, "
				+ "us.endereco, us.numero, us.bairro, us.cidade,  us.estado, us.complemento, "
				+ "us.cpf, us.data_nascimento, us.email, us.gps, us.obs us.senha "
				+ "FROM tbl_usuarios us WHERE id = ? ";
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		UsuarioEntity usuario = null;
		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
		    ps.setLong(1, Id);
		    
            rs = ps.executeQuery();
            
            if (rs.next()) {
            	
            	usuario = new UsuarioEntity();
            	
	            usuario.setId(rs.getLong("id"));
	            usuario.setNome(rs.getString("nome"));
	            usuario.setLogin(rs.getString("login"));
	            usuario.setEmail(rs.getString("email"));
	            usuario.setCelular(rs.getString("celular"));
	            usuario.setTelefone(rs.getString("telefone"));
	            usuario.setCep(rs.getString("cep"));
	            usuario.setCpf(rs.getString("cpf"));
	            usuario.setDataNascimento(rs.getString("data_nascimento"));
	            usuario.setEmail(rs.getString("email"));
	            usuario.setGps(rs.getString("gps"));
	            usuario.setObs(rs.getString("obs"));
	            usuario.setSenha(rs.getString("senha"));
            }
            
            return usuario; 
            
        } catch (SQLException ex){
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
		String sql = "DELETE FROM tbl_usuarios "
				+ "    WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setLong(1, id);
			
			ps.execute();
			
		} catch (SQLException e) {
			throw new NegocioException("Não foi possível excluir: ERRO -> " +  e.getMessage());
		} finally {
			try {
				ps.close();
			} catch (Exception erroAoFechar) {
				erroAoFechar.printStackTrace();
			}
		}
		return "Registro excluído com sucesso!";
	}

	public String salvarDados(UsuarioEntity usuario) throws NegocioException {
		String sql = "INSERT INTO tbl_usuarios (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
 		
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

	public String salvarDadosCliente(UsuarioEntity usuario) throws NegocioException {
 		String sql = "INSERT INTO tbl_usuarios (nome, login, celular, telefone,  cep, endereco, numero, bairro, cidade, "
 				+ "estado, complemento, cpf, data_nascimento, email, gps, obs, senha ) "
 				+ "VALUES  (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getCelular());
			ps.setString(4, usuario.getTelefone());
			ps.setString(5, usuario.getCep());
			ps.setString(6, usuario.getEndereco());
			ps.setString(7, usuario.getNumero());
			ps.setString(8, usuario.getBairro());
			ps.setString(9, usuario.getCidade());
			ps.setString(10, usuario.getEstado());
			ps.setString(11, usuario.getComplemento());
			ps.setString(12, usuario.getCpf());
			ps.setString(13, usuario.getDataNascimento());
			ps.setString(14, usuario.getEmail());
			ps.setString(15, usuario.getGps());
			ps.setString(16, usuario.getObs());
			ps.setString(17, usuario.getSenha());
			ps.execute();
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao cadastrar dados completos do usuario : " + e.getMessage());
			
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

	public String alterarDadosCliente(UsuarioEntity usuario) throws NegocioException {
		PreparedStatement ps = null;
		
		if(usuario.getSenha().equals("")){
			String sql = "UPDATE  tbl_usuarios set "
					+ "nome=?, "
					+ "login=?, "
					+ "celular=?, "
					+ "telefone=?,  "
					+ "cep=?, "
					+ "endereco=?, "
					+ "numero=?, "
					+ "bairro=?, "
					+ "cidade=?, "
					+ "estado=?, "
					+ "complemento=?, "
					+ "cpf=?, "
					+ "data_nascimento=?, "
					+ "email=?, "
					+ "gps=?, "
					+ "obs=? "
					+ "WHERE id = ?";			
	 		try {
			    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			    
				ps.setString(1, usuario.getNome());
				ps.setString(2, usuario.getLogin());
				ps.setString(3, usuario.getCelular());
				ps.setString(4, usuario.getTelefone());
				ps.setString(5, usuario.getCep());
				ps.setString(6, usuario.getEndereco());
				ps.setString(7, usuario.getNumero());
				ps.setString(8, usuario.getBairro());
				ps.setString(9, usuario.getCidade());
				ps.setString(10, usuario.getEstado());
				ps.setString(11, usuario.getComplemento());
				ps.setString(12, usuario.getCpf());
				ps.setString(13, usuario.getDataNascimento());
				ps.setString(14, usuario.getEmail());
				ps.setString(15, usuario.getGps());
				ps.setString(16, usuario.getObs());
				
				ps.setLong(17, usuario.getId());
				
				ps.execute();
				
			} catch (SQLException e) {	
				throw new NegocioException("Erro ao alterar dados completos do usuario : " + e.getMessage());
				
			} finally {
				if(ps != null) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}else {
		String sql = "UPDATE  tbl_usuarios set "
				+ "nome=?, "
				+ "login=?, "
				+ "celular=?, "
				+ "telefone=?,  "
				+ "cep=?, "
				+ "endereco=?, "
				+ "numero=?, "
				+ "bairro=?, "
				+ "cidade=?, "
				+ "estado=?, "
				+ "complemento=?, "
				+ "cpf=?, "
				+ "data_nascimento=?, "
				+ "email=?, "
				+ "gps=?, "
				+ "obs=?, "
				+ "senha = ?"
				+ "WHERE id = ?";
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
		    
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getCelular());
			ps.setString(4, usuario.getTelefone());
			ps.setString(5, usuario.getCep());
			ps.setString(6, usuario.getEndereco());
			ps.setString(7, usuario.getNumero());
			ps.setString(8, usuario.getBairro());
			ps.setString(9, usuario.getCidade());
			ps.setString(10, usuario.getEstado());
			ps.setString(11, usuario.getComplemento());
			ps.setString(12, usuario.getCpf());
			ps.setString(13, usuario.getDataNascimento());
			ps.setString(14, usuario.getEmail());
			ps.setString(15, usuario.getGps());
			ps.setString(16, usuario.getObs());
			ps.setString(17, usuario.getSenha());
			
			ps.setLong(18, usuario.getId());
			
			ps.execute();
			
		} catch (SQLException e) {	
			throw new NegocioException("Erro ao alterar dados completos do usuario : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		}
		
		return "Usuario foi gravado com sucesso no banco de dados";
	}

	public static List<UsuarioEntity> listarDadosClientes()  throws NegocioException {
			String sql = "SELECT us.id, us.nome, us.login, us.celular, us.telefone,  us.cep, us.endereco, us.numero, us.bairro, us.cidade, "
					+ "us.estado, us.complemento, us.cpf, us.data_nascimento, us.email, us.gps, us.obs "
					+ "FROM tbl_usuarios us ";
			PreparedStatement ps = null;
			ResultSet rs;
			List<UsuarioEntity> listagem = new ArrayList<>();
			
			try {
			    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
	            rs = ps.executeQuery();
	            
	            while (rs.next()) {
	            	UsuarioEntity usuario = new UsuarioEntity();
	            	
	            	usuario.setId(rs.getLong("ID"));
	            	usuario.setNome(rs.getString("NOME"));
	            	usuario.setLogin(rs.getString("login"));
	            	usuario.setCelular(rs.getString("CELULAR"));
	            	usuario.setTelefone(rs.getString("TELEFONE"));
	            	usuario.setCep(rs.getString("CEP"));
	            	usuario.setEndereco(rs.getString("ENDERECO"));
	            	usuario.setNumero(rs.getString("NUMERO"));
	            	usuario.setBairro(rs.getString("BAIRRO"));
	            	usuario.setCidade(rs.getString("CIDADE"));
	            	usuario.setEstado(rs.getString("ESTADO"));
	            	usuario.setComplemento(rs.getString("COMPLEMENTO"));
	            	usuario.setCpf(rs.getString("CPF"));
	            	usuario.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
	            	usuario.setEmail(rs.getString("email"));
	            	usuario.setGps(rs.getString("GPS"));
	            	usuario.setObs(rs.getString("OBS"));
	            	
	            	listagem.add(usuario);
	            	
	            	System.out.println(usuario);
	            }
	            ps.close(); 
	            
	        } catch (SQLException ex){
	        	throw new NegocioException("Erro ao cadastrar usuário !" + ex.getMessage());
	        }
			return listagem;
		}
	
}








