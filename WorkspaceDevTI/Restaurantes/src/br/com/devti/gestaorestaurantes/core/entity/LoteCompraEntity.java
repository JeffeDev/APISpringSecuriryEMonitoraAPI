package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class LoteCompraEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idLote;
	private String numeroLote;
	private String numeroNFe;
	private LocalDate dtFabricacao;
	private LocalDate dtValidade;
	private LocalDate dtCompra;
	
	public LoteCompraEntity() {
	}

	public LoteCompraEntity(String numeroLote, String numeroNFe, LocalDate dataFabricacao, LocalDate dataValidade,
			LocalDate dataCompra) {
		this.numeroLote = numeroLote;
		this.numeroNFe = numeroNFe;
		this.dtFabricacao = dataFabricacao;
		this.dtValidade = dataValidade;
		this.dtCompra = dataCompra;
	}

	public Long getIdLote() {
		return idLote;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public String getNumeroNFe() {
		return numeroNFe;
	}

	public LocalDate getDataFabricacao() {
		return dtFabricacao;
	}

	public LocalDate getDataValidade() {
		return dtValidade;
	}

	public LocalDate getDataCompra() {
		return dtCompra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLote);
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
		return Objects.equals(idLote, other.idLote);
	}
	

}
