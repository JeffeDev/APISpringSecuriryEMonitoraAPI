package br.com.jeffedev.restaurantes.core.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoteCompraEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLote;
	private String numeroLote;
	private String numeroNFe;
	private LocalDate dataFabricacao;
	private LocalDate dataValidade;
	private LocalDate dataCompra;
	
	public LoteCompraEntity() {
	}

	public LoteCompraEntity(String numeroLote, String numeroNFe, LocalDate dataFabricacao, LocalDate dataValidade,
			LocalDate dataCompra) {
		this.numeroLote = numeroLote;
		this.numeroNFe = numeroNFe;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
		this.dataCompra = dataCompra;
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
		return dataFabricacao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
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
