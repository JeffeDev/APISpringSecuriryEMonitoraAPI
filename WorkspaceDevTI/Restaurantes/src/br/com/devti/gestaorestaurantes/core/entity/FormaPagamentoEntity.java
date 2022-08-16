package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class FormaPagamentoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String TipoPagamento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoPagamento() {
		return TipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		TipoPagamento = tipoPagamento;
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
		FormaPagamentoEntity other = (FormaPagamentoEntity) obj;
		return Objects.equals(id, other.id);
	}

}
