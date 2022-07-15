package br.com.jeffedev.restaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idCliente;
	@Id
	private Long idPedido;
	
	private LocalDate dataCompra;
	private Time horaCompra;
	private BigDecimal valorTotalPedido;
	
	public PedidoEntity() {
	}

	public PedidoEntity(Long idCliente, LocalDate dataCompra, Time horaCompra, BigDecimal valorTotalPedido) {
		this.idCliente = idCliente;
		this.dataCompra = dataCompra;
		this.horaCompra = horaCompra;
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
	public Time getHoraCompra() {
		return horaCompra;
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
