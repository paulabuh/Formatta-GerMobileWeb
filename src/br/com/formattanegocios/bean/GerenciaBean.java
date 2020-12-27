package br.com.formattanegocios.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import br.com.formattanegocios.dao.DAOFactory;
import br.com.formattanegocios.dao.GerencialDiarioDao;
import br.com.formattanegocios.dao.IDao;
import br.com.formattanegocios.model.GerencialDiario;
import br.com.formattanegocios.model.GrupoGerencial;
import br.com.formattanegocios.model.Loja;
import br.com.formattanegocios.model.TabelaGer;
import br.com.formattanegocios.util.GerencialUtil;

@ManagedBean
@SessionScoped
public class GerenciaBean {

	private Date dtFimGerencial;

	private GerencialDiario ger;

	private List<Loja> lojas;

	private Loja lojaSelecionada;

	private GrupoGerencial grupoSelecionado;

	private List<GrupoGerencial> gruposGer;

	private String headerPer;
	private String headerPerAnt;
	private String headerPerAnAnt;

	private final String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
			"Jul", "Ago", "Set", "Out", "Nov", "Dez" };

	@PostConstruct
	public void inicializar() {
		dtFimGerencial = new Date();

		IDao<Loja> dao = DAOFactory.getLojaDao();
		lojas = dao.getAll("");

		inicializarGruposGer();

		ger = new GerencialDiario();
		ger.setLojas(lojas);

		ger.setTabGrupoII(new TabelaGer());
		GerencialUtil.inicializaTabela(ger.getTabGrupoII());

		lojaSelecionada = lojas.get(1);
	}

	private void inicializarGruposGer() {
		gruposGer = new ArrayList<GrupoGerencial>();

		GrupoGerencial grp1 = new GrupoGerencial("I", "DADOS ESTATÍSTICOS",
				"grupoI");
		gruposGer.add(grp1);
		GrupoGerencial grp2 = new GrupoGerencial("II",
				"CÁLCULO FATURAMENTO BRUTO", "grupoII");
		gruposGer.add(grp2);
		GrupoGerencial grp3 = new GrupoGerencial("III", "INVESTIMENTOS",
				"grupoIII");
		gruposGer.add(grp3);
		GrupoGerencial grp4 = new GrupoGerencial("VI", "INDICADORES", "grupoVI");
		gruposGer.add(grp4);
		GrupoGerencial grp5 = new GrupoGerencial("V", "PERFIL CLIENTES",
				"grupoV");
		gruposGer.add(grp5);
		GrupoGerencial grp6 = new GrupoGerencial("VI", "CONTAS A PAGAR",
				"grupoVI");
		gruposGer.add(grp6);

	}

	public List<GrupoGerencial> getGruposGer() {
		return gruposGer;
	}

	public void setGruposGer(List<GrupoGerencial> gruposGer) {
		this.gruposGer = gruposGer;
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

	public void gerarGerencial(ActionEvent evt) {
		IDao<GerencialDiario> dao = DAOFactory.getGerencialDiarioDao();

		ger.setDtAnalise(dtFimGerencial);
		((GerencialDiarioDao) dao).gerencialByData(ger);

		inicializaHeadersTabelas();
		
		GerencialUtil.geraTabGrupoII(ger);
		
		
		
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	public GrupoGerencial getGrupoSelecionado() {
		return grupoSelecionado;
	}

	public void setGrupoSelecionado(GrupoGerencial grupoSelecionado) {
		this.grupoSelecionado = grupoSelecionado;
	}

	public Loja getLojaSelecionada() {
		return lojaSelecionada;
	}

	public void setLojaSelecionada(Loja lojaSelecionada) {
		this.lojaSelecionada = lojaSelecionada;
	}

	public String getHeaderPerAnAnt() {
		return headerPerAnAnt;
	}

	public void setHeaderPerAnAnt(String headerPerAnAnt) {
		this.headerPerAnAnt = headerPerAnAnt;
	}

	public String getHeaderPerAnt() {
		return headerPerAnt;
	}

	public void setHeaderPerAnt(String headerPerAnt) {
		this.headerPerAnt = headerPerAnt;
	}

	public String getHeaderPer() {
		return headerPer;
	}

	public void setHeaderPer(String headerPer) {
		this.headerPer = headerPer;
	}

	public String[] getMeses() {
		return meses;
	}

	private void inicializaHeadersTabelas() {

		Calendar cPer = Calendar.getInstance();
		Calendar cPerAnt = Calendar.getInstance();
		Calendar cPerAnoAnt = Calendar.getInstance();
		cPer.setTime(dtFimGerencial);
		cPerAnt.setTime(dtFimGerencial);
		cPerAnoAnt.setTime(dtFimGerencial);

		cPerAnt.add(Calendar.MONTH, -1);
		cPerAnoAnt.add(Calendar.YEAR, -1);

		headerPer = meses[cPer.get(Calendar.MONTH)] + "/"
				+ cPer.get(Calendar.YEAR);

		headerPerAnt = meses[cPerAnt.get(Calendar.MONTH)] + "/"
				+ cPerAnt.get(Calendar.YEAR);

		headerPerAnAnt = meses[cPerAnoAnt.get(Calendar.MONTH)] + "/"
				+ cPerAnoAnt.get(Calendar.YEAR);

	}
}
