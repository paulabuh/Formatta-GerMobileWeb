package br.com.formattanegocios.model;

import java.util.List;

public class TabelaGer {

	private HeaderTab header;
	private List<ItemTab> itens;
	private HeaderTab footer;

	public HeaderTab getHeader() {
		return header;
	}

	public void setHeader(HeaderTab header) {
		this.header = header;
	}

	public List<ItemTab> getItens() {
		return itens;
	}

	public void setItens(List<ItemTab> itens) {
		this.itens = itens;
	}

	public HeaderTab getFooter() {
		return footer;
	}

	public void setFooter(HeaderTab footer) {
		this.footer = footer;
	}

}
