package br.com.restaurantes.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_endereco")
public class UsuarioEndereco {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name = "endereco_id")
	private Endereco endereco;		
	
	private String numeroCasa;
	private String coordenadasGpsMoradia;
	
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco = TipoEndereco.RESIDENCIAL;
	
	private boolean localEntrega = false;
	
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public boolean isLocalEntrega() {
		return localEntrega;
	}

	public void setLocalEntrega(boolean localEntrega) {
		this.localEntrega = localEntrega;
	}

	public Usuario getUsuarios() {
		return usuario;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuario = usuarios;
	}

	public Endereco getEnderecos() {
		return endereco;
	}

	public void setEnderecos(Endereco enderecos) {
		this.endereco = enderecos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco enderecos) {
		this.endereco = enderecos;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}
	
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCoordenadasGpsMoradia() {
		return coordenadasGpsMoradia;
	}
	
	public void setCoordenadasGpsMoradia(String coordenadasGpsMoradia) {
		this.coordenadasGpsMoradia = coordenadasGpsMoradia;
	}

}
