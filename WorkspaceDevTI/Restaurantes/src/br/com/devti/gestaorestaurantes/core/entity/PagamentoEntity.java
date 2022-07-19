package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class PagamentoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idPagamento;
	private Long idPedido;
	private Long idFormaPagto;
	
	private BigDecimal valorRecebido;
	private BigDecimal valorPago;
	private BigDecimal troco;
	private LocalDateTime dtPagto;
	
	public PagamentoEntity() {
	}

	public PagamentoEntity(Long idPedido, Long idFormaPagto, BigDecimal valorRecebido, BigDecimal valorPago, BigDecimal troco,
			LocalDateTime dataPagto) {
		this.idPedido = idPedido;
		this.idFormaPagto = idFormaPagto;
		this.valorRecebido = valorRecebido;
		this.valorPago = valorPago;
		this.troco = troco;
		this.dtPagto = dataPagto;
	}

	public Long getIdPagamento() {
		return idPagamento;
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

	public LocalDateTime getDataPagto() {
		return dtPagto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dtPagto, idFormaPagto, idPagamento, idPedido);
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
				&& Objects.equals(idPagamento, other.idPagamento) && Objects.equals(idPedido, other.idPedido);
	}
	
	
	
}
