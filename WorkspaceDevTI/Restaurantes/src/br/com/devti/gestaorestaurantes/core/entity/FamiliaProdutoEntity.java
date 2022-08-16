package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class FamiliaProdutoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idFamiliaProduto;
	private String descricaoFamiliaProduto;
	private String localizacaoPrateleira;
	
	public FamiliaProdutoEntity() {
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idFamiliaProduto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamiliaProdutoEntity other = (FamiliaProdutoEntity) obj;
		return Objects.equals(idFamiliaProduto, other.idFamiliaProduto);
	}
	
	public String getDescricaoFamiliaProduto() {
		return descricaoFamiliaProduto;
	}
	public void setDescricaoFamiliaProduto(String descricaoFamiliaProduto) {
		this.descricaoFamiliaProduto = descricaoFamiliaProduto;
	}
	public String getLocalizacaoPrateleira() {
		return localizacaoPrateleira;
	}
	public void setLocalizacaoPrateleira(String localizacaoPrateleira) {
		this.localizacaoPrateleira = localizacaoPrateleira;
	}
	
}
