package br.com.formattanegocios.teste;

import java.io.Serializable;

public class Grupo implements Serializable {
	private String title;
	private boolean selecionada;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isSelecionada() {
		return selecionada;
	}

	public void setSelecionada(boolean selecionada) {
		this.selecionada = selecionada;
	}
	
}
