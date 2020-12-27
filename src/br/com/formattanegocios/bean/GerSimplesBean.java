package br.com.formattanegocios.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import br.com.formattanegocios.dao.DAOFactory;
import br.com.formattanegocios.dao.GerencialDiarioDao;
import br.com.formattanegocios.dao.IDao;
import br.com.formattanegocios.model.GerencialDiario;

@ManagedBean
@SessionScoped
public class GerSimplesBean {

	private Date dtFimGerencial;

	private GerencialDiario ger;

	private String headerDesc;
	private String headerValor;

	@PostConstruct
	public void inicializar() {
		dtFimGerencial = new Date();
		headerDesc = "Descrição";
		headerValor = "Valor";

		ger = new GerencialDiario();

	}

	public void gerarGerencial(ActionEvent evt) {
		IDao<GerencialDiario> dao = DAOFactory.getGerencialDiarioDao();

		ger.setDtAnalise(dtFimGerencial);
		((GerencialDiarioDao) dao).gerencialTudoNaData(ger);

		dao = null;
	}

	public Date getDtFimGerencial() {
		return dtFimGerencial;
	}

	public void setDtFimGerencial(Date dtFimGerencial) {
		this.dtFimGerencial = dtFimGerencial;
	}

	public GerencialDiario getGer() {
		return ger;
	}

	public void setGer(GerencialDiario ger) {
		this.ger = ger;
	}

	public String getHeaderDesc() {
		return headerDesc;
	}

	public void setHeaderDesc(String headerDesc) {
		this.headerDesc = headerDesc;
	}

	public String getHeaderValor() {
		return headerValor;
	}

	public void setHeaderValor(String headerValor) {
		this.headerValor = headerValor;
	}

}
