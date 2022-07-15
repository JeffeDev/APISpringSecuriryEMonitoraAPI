package br.com.jeffedev.restaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PagamentoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPagamento;
	@Id
	private Long idPedido;
	@Id
	private Long idFormaPagto;
	
	private BigDecimal valorRecebido;
	private BigDecimal valorPago;
	private BigDecimal troco;
	private LocalDateTime dataPagto;
	
	public PagamentoEntity() {
	}

	public PagamentoEntity(Long idPedido, Long idFormaPagto, BigDecimal valorRecebido, BigDecimal valorPago, BigDecimal troco,
			LocalDateTime dataPagto) {
		this.idPedido = idPedido;
		this.idFormaPagto = idFormaPagto;
		this.valorRecebido = valorRecebido;
		this.valorPago = valorPago;
		this.troco = troco;
		this.dataPagto = dataPagto;
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
		return dataPagto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataPagto, idFormaPagto, idPagamento, idPedido);
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
		return Objects.equals(dataPagto, other.dataPagto) && Objects.equals(idFormaPagto, other.idFormaPagto)
				&& Objects.equals(idPagamento, other.idPagamento) && Objects.equals(idPedido, other.idPedido);
	}
	
	
	
}
