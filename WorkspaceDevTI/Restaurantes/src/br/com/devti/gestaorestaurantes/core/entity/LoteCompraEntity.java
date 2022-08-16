package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.util.Objects;

public class LoteCompraEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numeroLote;
	private String numeroNFe;
	private String dtFabricacao;
	private String dtValidade;
	private String dtCompra;
	
	public LoteCompraEntity() {
	}

	public LoteCompraEntity(String numeroLote, String numeroNFe, String dataFabricacao, String dataValidade,
			String dataCompra) {
		this.numeroLote = numeroLote;
		this.numeroNFe = numeroNFe;
		this.dtFabricacao = dataFabricacao;
		this.dtValidade = dataValidade;
		this.dtCompra = dataCompra;
	}

	public Long getId() {
		return id;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public String getNumeroNFe() {
		return numeroNFe;
	}

	public String getDataFabricacao() {
		return dtFabricacao;
	}

	public String getDataValidade() {
		return dtValidade;
	}

	public String getDataCompra() {
		return dtCompra;
	}
	

	public String getDtFabricacao() {
		return dtFabricacao;
	}

	public String getDtValidade() {
		return dtValidade;
	}

	public String getDtCompra() {
		return dtCompra;
	}

	public void setId(Long idLote) {
		this.id = idLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public void setNumeroNFe(String numeroNFe) {
		this.numeroNFe = numeroNFe;
	}

	public void setDtFabricacao(String dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}

	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}

	public void setDtCompra(String dtCompra) {
		this.dtCompra = dtCompra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoteCompraEntity other = (LoteCompraEntity) obj;
		return Objects.equals(id, other.id);
	}
	

}
