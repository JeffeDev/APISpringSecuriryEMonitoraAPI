package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class FormaPagamentoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idFormaPagamento;
	private String TipoPagamento;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idFormaPagamento);
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
		return Objects.equals(idFormaPagamento, other.idFormaPagamento);
	}
	public FormaPagamentoEntity() {
	}
	public FormaPagamentoEntity(String tipoPagamento) {
		TipoPagamento = tipoPagamento;
	}
	public Long getIdOPagamento() {
		return idFormaPagamento;
	}
	public String getTipoPagamento() {
		return TipoPagamento;
	}
	
	
}
