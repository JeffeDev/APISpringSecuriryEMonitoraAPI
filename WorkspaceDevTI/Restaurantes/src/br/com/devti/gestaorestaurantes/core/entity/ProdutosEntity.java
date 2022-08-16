package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;

public class ProdutosEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nomeProduto;
	private String codigoDeBarras;
	private BigDecimal precoCompra;
	private BigDecimal precoVenda;
	private BigDecimal margemLucro;
	
	private String dtUltimaCompra;
	private String dtUltimaVenda;
	
	private Long idFamiliaProduto;
	private Long idFornecedor;
	private Long idLoteCompra;
	private Long idLocalImpressao;

	public ProdutosEntity() {
	}
	

	public ProdutosEntity(String nomeProduto, String codigoDeBarras, BigDecimal precoCompra, BigDecimal precoVenda,
			BigDecimal margemLucro, String dtUltimaCompra, String dtUltimaVenda, Long idFamiliaProduto,
			Long idLoteCompra, Long idLocalImpressao, Long idFornecedor) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoDeBarras = codigoDeBarras;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
		this.dtUltimaCompra = dtUltimaCompra;
		this.dtUltimaVenda = dtUltimaVenda;
		this.idFamiliaProduto = idFamiliaProduto;
		this.idLoteCompra = idLoteCompra;
		this.idLocalImpressao = idLocalImpressao;
		this.idFornecedor = idFornecedor;
	}


	public Long getId() {
		return id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
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

	public String getDtUltimaCompra() {
		return dtUltimaCompra;
	}

	public String getDtUltimaVenda() {
		return dtUltimaVenda;
	}

	public Long getIdFamiliaProduto() {
		return idFamiliaProduto;
	}

	public Long getIdLoteCompra() {
		return idLoteCompra;
	}

	public Long getIdLocalImpressao() {
		return idLocalImpressao;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}


	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}


	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}


	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}


	public void setDtUltimaCompra(String dtUltimaCompra) {
		this.dtUltimaCompra = dtUltimaCompra;
	}


	public void setDtUltimaVenda(String dtUltimaVenda) {
		this.dtUltimaVenda = dtUltimaVenda;
	}


	public void setIdFamiliaProduto(Long idFamiliaProduto) {
		this.idFamiliaProduto = idFamiliaProduto;
	}


	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}


	public void setIdLoteCompra(Long idLoteCompra) {
		this.idLoteCompra = idLoteCompra;
	}


	public void setIdLocalImpressao(Long idLocalImpressao) {
		this.idLocalImpressao = idLocalImpressao;
	}
	

}
