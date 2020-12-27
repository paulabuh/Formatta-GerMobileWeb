package br.com.formattanegocios.model;

public class GrupoGerencial {
	private String numGrupo;
	private String descGrupo;
	private String linkPg;

	public GrupoGerencial(String pNumGrupo, String pDescGrupo, String pLinkPg) {
		numGrupo = pNumGrupo;
		descGrupo = pDescGrupo;
		linkPg = pLinkPg;
	}

	public String getNumGrupo() {
		return numGrupo;
	}

	public void setNumGrupo(String numGrupo) {
		this.numGrupo = numGrupo;
	}

	public String getDescGrupo() {
		return descGrupo;
	}

	public void setDescGrupo(String descGrupo) {
		this.descGrupo = descGrupo;
	}

	public String getLinkPg() {
		return linkPg;
	}

	public void setLinkPg(String linkPg) {
		this.linkPg = linkPg;
	}

}
