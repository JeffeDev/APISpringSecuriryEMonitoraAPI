package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Usuario
 *
 */
public class PedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;	
	private Long idCliente;
	
	private String dataCompra;
	private BigDecimal valorTotalPedido;
	
	public PedidoEntity() {
	}

	public PedidoEntity(Long idCliente, String dataCompra, BigDecimal valorTotalPedido) {
		this.idCliente = idCliente;
		this.dataCompra = dataCompra;
		this.valorTotalPedido = valorTotalPedido;
	}
	
	public Long getIdCliente() {
		return idCliente;
	}
	public Long getId() {
		return id;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public BigDecimal getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setId(Long idPedido) {
		this.id = idPedido;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public void setValorTotalPedido(BigDecimal valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
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
		PedidoEntity other = (PedidoEntity) obj;
		return Objects.equals(id, other.id);
	}
	
}
