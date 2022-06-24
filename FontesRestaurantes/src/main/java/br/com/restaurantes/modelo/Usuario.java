package br.com.restaurantes.modelo;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String celular;
	private String cpf;
	private LocalDate dataNascimento;
	private Time horaNascimento;
	private String cidadeNasceuUF; // Formatação Cidade-UF

	@OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
	private List<UsuarioEndereco> enderecos = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();

	public Usuario() {
	}

	public Usuario(String nome, String email, String senha, String celular, String cpf, LocalDate dataNascimento,
			Time horaNascimento, String cidadeNasceuUF, List<UsuarioEndereco> enderecos,
			List<Perfil> perfis) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.celular = celular;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.horaNascimento = horaNascimento;
		this.cidadeNasceuUF = cidadeNasceuUF;
		this.enderecos = enderecos;
		this.perfis = perfis;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Time getHoraNascimento() {
		return horaNascimento;
	}

	public void setHoraNascimento(Time horaNascimento) {
		this.horaNascimento = horaNascimento;
	}

	public String getCidadeNasceuUF() {
		return cidadeNasceuUF;
	}

	public void setCidadeNasceuUF(String cidadeNasceuUF) {
		this.cidadeNasceuUF = cidadeNasceuUF;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public List<UsuarioEndereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<UsuarioEndereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getCpf() {
		return cpf;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
