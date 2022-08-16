package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class PagamentoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idPedido;
	private Long idFormaPagto;
	
	private BigDecimal valorRecebido;
	private BigDecimal valorPago;
	private BigDecimal troco;
	private String dtPagto;
	
	public PagamentoEntity() {
	}

	public PagamentoEntity(Long idPedido, Long idFormaPagto, BigDecimal valorRecebido, BigDecimal valorPago, BigDecimal troco,
			String dataPagto) {
		this.idPedido = idPedido;
		this.idFormaPagto = idFormaPagto;
		this.valorRecebido = valorRecebido;
		this.valorPago = valorPago;
		this.troco = troco;
		this.dtPagto = dataPagto;
	}

	public Long getId() {
		return id;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public Long getIdFormaPagto() {
		return idFormaPagto;
	}

	public BigDecimal getValorRecebido() {
		return valorRecebido;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public BigDecimal getTroco() {
		return troco;
	}

	public String getDataPagto() {
		return dtPagto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dtPagto, idFormaPagto, id, idPedido);
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public void setIdFormaPagto(Long idFormaPagto) {
		this.idFormaPagto = idFormaPagto;
	}

	public void setValorRecebido(BigDecimal valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public void setTroco(BigDecimal troco) {
		this.troco = troco;
	}

	public void setDtPagto(String dtPagto) {
		this.dtPagto = dtPagto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagamentoEntity other = (PagamentoEntity) obj;
		return Objects.equals(dtPagto, other.dtPagto) && Objects.equals(idFormaPagto, other.idFormaPagto)
				&& Objects.equals(id, other.id) && Objects.equals(idPedido, other.idPedido);
	}
	
	
	
}
