package br.com.jeffedev.restaurantes.core.entity.herdam;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.jeffedev.restaurantes.core.entity.enumerator.TipoEndereco;

@Entity
public class UsuarioEnderecoCore {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuarioEndereco;
	
	private Long usuario_id;
	private Long endereco_id;
	
	private String numero;
	private String coordenadasGpsMoradia;
	private Enum<TipoEndereco> tipoEndereco;
	private boolean localEntrega;
	private String complemento;
	
	public UsuarioEnderecoCore() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco_id, usuario_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEnderecoCore other = (UsuarioEnderecoCore) obj;
		return Objects.equals(endereco_id, other.endereco_id) && Objects.equals(usuario_id, other.usuario_id);
	}

	public UsuarioEnderecoCore(Long usuario_id, Long endereco_id, String numero, String coordenadasGpsMoradia,
			Enum<TipoEndereco> tipoEndereco, boolean localEntrega, String complemento) {
		this.usuario_id = usuario_id;
		this.endereco_id = endereco_id;
		this.numero = numero;
		this.coordenadasGpsMoradia = coordenadasGpsMoradia;
		this.tipoEndereco = tipoEndereco;
		this.localEntrega = localEntrega;
		this.complemento = complemento;
	}
	
	public Long getUsuario_id() {
		return usuario_id;
	}
	public Long getEndereco_id() {
		return endereco_id;
	}
	public String getNumero() {
		return numero;
	}
	public String getCoordenadasGpsMoradia() {
		return coordenadasGpsMoradia;
	}
	public Enum<TipoEndereco> getTipoEndereco() {
		return tipoEndereco;
	}
	public boolean isLocalEntrega() {
		return localEntrega;
	}
	public String getComplemento() {
		return complemento;
	}
	
	
	
}
