package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;

public class ControlarImpressaoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long idImpressora;
	
	private String nomeImpressora;
	private String caminhoImpressora;
	
	public ControlarImpressaoEntity() {
	}
	
	public ControlarImpressaoEntity(String nomeImpressora, String localImpressao) {
		this.nomeImpressora = nomeImpressora;
		this.caminhoImpressora = localImpressao;
	}
	public Long getIdImpressao() {
		return idImpressora;
	}
	public String getLocalImpressao() {
		return caminhoImpressora;
	}

	public String getNomeImpressora() {
		return nomeImpressora;
	}

}
