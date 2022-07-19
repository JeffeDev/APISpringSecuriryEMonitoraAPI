package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ProdutosEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idProduto;
	
	private String nomeProduto;
	
	private Long idFamiliaProduto;
	private String codigoDeBarras;
	
	private Long idFornecedor;
	private BigDecimal precoCompra;
	private BigDecimal precoVenda;
	private BigDecimal margemLucro;
	
	private Long idLocalImpressao;
	private LocalDate dtUltimaCompra;
	private LocalDate dtUltimaVenda;
	
	private Long idLoteCompra;

	public ProdutosEntity() {
	}

	public ProdutosEntity(String nomeProduto, Long idFamiliaProduto, String codigoDeBarras, Long idFornecedor,
			BigDecimal precoCompra, BigDecimal precoVenda, BigDecimal margemLucro, Long idLocalImpressao,
			LocalDate dtUltimaCompra, LocalDate dtUltimaVenda, Long idLoteCompra) {
		this.nomeProduto = nomeProduto;
		this.idFamiliaProduto = idFamiliaProduto;
		this.codigoDeBarras = codigoDeBarras;
		this.idFornecedor = idFornecedor;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
		this.idLocalImpressao = idLocalImpressao;
		this.dtUltimaCompra = dtUltimaCompra;
		this.dtUltimaVenda = dtUltimaVenda;
		this.idLoteCompra = idLoteCompra;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutosEntity other = (ProdutosEntity) obj;
		return Objects.equals(idProduto, other.idProduto);
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Long getIdFamiliaProduto() {
		return idFamiliaProduto;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public Long getIdLocalImpressao() {
		return idLocalImpressao;
	}

	public LocalDate getDtUltimaCompra() {
		return dtUltimaCompra;
	}

	public LocalDate getDtUltimaVenda() {
		return dtUltimaVenda;
	}

	public Long getIdLoteCompra() {
		return idLoteCompra;
	}
	
}
