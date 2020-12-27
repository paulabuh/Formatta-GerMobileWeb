package br.com.formattanegocios.teste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Teste implements Serializable{
	
	private List<Grupo> groups = new ArrayList<Grupo>();
	
	private Grupo selectedGrupo;	
	
	private String nome = "aquikio";
	
	private Date dtFimGerencial;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public List<Grupo> getGroups() {
		groups = new ArrayList<Grupo>();
		Grupo gp = new Grupo();
		gp.setTitle("rio claro");
		groups.add( gp);
		Grupo gp2 = new Grupo();
		gp2.setTitle("sorocaba");
		groups.add(gp2);
		Grupo gp3 = new Grupo();
		gp3.setTitle("piracicaba");
		groups.add(gp3);
		Grupo gp4 = new Grupo();
		gp4.setTitle("PaginaSimple.jsf");
		groups.add(gp4);
		return groups;
	}

	public void setGroups(List<Grupo> groups) {
		this.groups = groups;
	}

	public Grupo getSelectedGrupo() {
		return selectedGrupo;
	}

	public void setSelectedGrupo(Grupo selectedGrupo) {
		this.selectedGrupo = selectedGrupo;
	}

	public Date getDtFimGerencial() {
		return dtFimGerencial;
	}

	public void setDtFimGerencial(Date dtFimGerencial) {
		this.dtFimGerencial = dtFimGerencial;
	}
	
	
	
	

}
