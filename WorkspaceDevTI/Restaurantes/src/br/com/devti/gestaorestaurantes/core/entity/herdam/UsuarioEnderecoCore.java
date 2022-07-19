package br.com.devti.gestaorestaurantes.core.entity.herdam;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.devti.gestaorestaurantes.core.entity.enumerator.TipoEndereco;

public class UsuarioEnderecoCore implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idUsuarioEndereco;
	
	private Long usuarioId;
	private Long enderecoId;
	
	private List<EnderecoCore> enderecos = new ArrayList<>();
	
	private String numero;
	private String coordenadasGpsMoradia;
	private Enum<TipoEndereco> tipoEndereco;
	
	private boolean localEntrega;
	private String complemento;
	private String obs;
	
	public UsuarioEnderecoCore() {
	}

	public UsuarioEnderecoCore(Long usuarioId, Long enderecoId, List<EnderecoCore> enderecos, String numero,
			String coordenadasGpsMoradia, Enum<TipoEndereco> tipoEndereco, boolean localEntrega, String complemento,
			String obs) {
		this.usuarioId = usuarioId;
		this.enderecoId = enderecoId;
		this.enderecos = enderecos;
		this.numero = numero;
		this.coordenadasGpsMoradia = coordenadasGpsMoradia;
		this.tipoEndereco = tipoEndereco;
		this.localEntrega = localEntrega;
		this.complemento = complemento;
		this.obs = obs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enderecoId, usuarioId);
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
		return Objects.equals(enderecoId, other.enderecoId) && Objects.equals(usuarioId, other.usuarioId);
	}

	public Long getUsuario_id() {
		return usuarioId;
	}
	public Long getEndereco_id() {
		return enderecoId;
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

	public List<EnderecoCore> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoCore> enderecos) {
		this.enderecos = enderecos;
	}

	public Long getIdUsuarioEndereco() {
		return idUsuarioEndereco;
	}

	public void setIdUsuarioEndereco(Long idUsuarioEndereco) {
		this.idUsuarioEndereco = idUsuarioEndereco;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
}
