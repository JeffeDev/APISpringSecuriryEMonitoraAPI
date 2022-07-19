package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class PedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idPedido;	
	private Long idCliente;
	
	private LocalDate dataCompra;
	private BigDecimal valorTotalPedido;
	
	public PedidoEntity() {
	}

	public PedidoEntity(Long idCliente, LocalDate dataCompra, BigDecimal valorTotalPedido) {
		this.idCliente = idCliente;
		this.dataCompra = dataCompra;
		this.valorTotalPedido = valorTotalPedido;
	}
	
	public Long getIdCliente() {
		return idCliente;
	}
	public Long getIdPedido() {
		return idPedido;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public BigDecimal getValorTotalPedido() {
		return valorTotalPedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoEntity other = (PedidoEntity) obj;
		return Objects.equals(idPedido, other.idPedido);
	}
	
}
