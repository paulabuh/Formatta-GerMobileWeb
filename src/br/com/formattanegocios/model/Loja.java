package br.com.formattanegocios.model;

public class Loja {
	private int id;
	private String codLoja;
	private String cnpj;
	private String descricao;
	private String telefone;
	private String apelido;
	private boolean selecionada;

	public int getId() {
		return id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(String codLoja) {
		this.codLoja = codLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isSelecionada() {
		return selecionada;
	}

	public void setSelecionada(boolean selecionado) {
		this.selecionada = selecionado;
	}

	

}
