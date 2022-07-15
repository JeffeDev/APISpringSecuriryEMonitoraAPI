package br.com.jeffedev.restaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaPagamentoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOPagamento;
	private String TipoPagamento;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idOPagamento);
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
		return Objects.equals(idOPagamento, other.idOPagamento);
	}
	public FormaPagamentoEntity() {
	}
	public FormaPagamentoEntity(String tipoPagamento) {
		TipoPagamento = tipoPagamento;
	}
	public Long getIdOPagamento() {
		return idOPagamento;
	}
	public String getTipoPagamento() {
		return TipoPagamento;
	}
	
	
}
