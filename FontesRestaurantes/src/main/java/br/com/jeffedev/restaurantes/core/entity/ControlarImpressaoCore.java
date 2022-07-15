package br.com.jeffedev.restaurantes.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ControlarImpressaoCore {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idImpressao;
	
	private String nomeImpressora;
	private String caminhoImpressao;
	
	public ControlarImpressaoCore() {
	}
	
	public ControlarImpressaoCore(String nomeImpressora, String localImpressao) {
		this.nomeImpressora = nomeImpressora;
		this.caminhoImpressao = localImpressao;
	}
	public Long getIdImpressao() {
		return idImpressao;
	}
	public String getLocalImpressao() {
		return caminhoImpressao;
	}

	public String getNomeImpressora() {
		return nomeImpressora;
	}

}
