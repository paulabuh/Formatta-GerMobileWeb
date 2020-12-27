package br.com.formattanegocios.model;

import java.util.Date;
import java.util.List;

public class GerencialDiario {

	private Double id;
	private int qtdeGerencial;
	private int idloja;
	private Date dtAnalise;
	private int totCtrRealizados;
	private int totCtrEnvolvidos;
	private int totCtrCancelados;
	private int totCrCanceladas;
	private int diasTrabalhados;
	private Double mediaContratos;
	private Double ticketMedio;
	private int clientes;
	private int clientesNovos;
	private int clientesAtivo;
	private Double ticketMedioFunc;
	private int qtdeFunc;
	private int mesaTotCtrRealizados;
	private int mesaTotCtrEnvolvidos;
	private int mesaTotCtrCancelados;
	private int mesaTotCrCanceladas;
	private int mesaDiasTrabalhados;
	private Double mesaMediaContratos;
	private Double mesaTicketMedio;
	private int mesaClientes;
	private int mesaClientesNovos;
	private int mesaClientesAtivo;
	private Double mesaTicketMedioFunc;
	private int mesaQtdeFunc;
	private int anoaTotCtrRealizados;
	private int anoaTotCtrEnvolvidos;
	private int anoaTotCtrCancelados;
	private int anoaTotCrCanceladas;
	private int anoaDiasTrabalhados;
	private Double anoaMediaContratos;
	private Double anoaTicketMedio;
	private int anoaClientes;
	private int anoaClientesNovos;
	private int anoaClientesAtivo;
	private Double anoaTicketMedioFunc;
	private Double faturamentoFunc;
	private Double mesaFaturamentoFunc;
	private Double anoaFaturamentoFunc;
	private int anoaQtdeFunc;
	private Double investimentos;
	private Double investimentosCustoat;
	private Double equipPerdidos;
	private Double equipPerdidosCustoat;
	private Double inventario;
	private Double inventarioCustoatual;
	private Double Locacoes;
	private Double adicional;
	private Double bolocador;
	private Double bolocatario;
	private Double vendasAcessorio;
	private Double vendasEquipamentos;
	private Double manutencao;
	private Double bolocadorTot;
	private Double bolocatarioTot;
	private Double descontoctrencer;
	private Double royalLocacoes;
	private Double royalAdicional;
	private Double royalBolocador;
	private Double royalBolocatario;
	private Double royalVendasAcessorio;
	private Double royalVendasEquipamen;
	private Double royalManutencao;
	private Double royalDescontoctrence;
	private Double faturamentoTotal;
	private Double faturamentoTotalBase;
	private Double roayltiesTotal;
	private Double totalReinvestimento;
	private Double totalRecebimento;
	private Double totalDespesas;
	private Double finanEquiptos;
	private Double finanUtensilios;
	private Double devAporteCapital;
	private Double devEmprestimos;
	private Double cpAVencer;
	private Double cpAtraso30;
	private Double cpAtraso60;
	private Double cpAtraso90;
	private Double cpAtrasoMais90;
	private Double crPotEmitir;
	private Double crEmitidas;
	private Double crAEmitir;
	private Double crInadimp91120;
	private Double funcdoPerdAcm;
	private int ctrZeradosDev;
	private int mesaCtrZeradosDev;
	private int anoaCtrZeradosDev;
	private List<Loja> lojas;
	private TabelaGer tabGrupoII;

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public int getIdloja() {
		return idloja;
	}

	public void setIdloja(int idloja) {
		this.idloja = idloja;
	}

	public Date getDtAnalise() {
		return dtAnalise;
	}

	public void setDtAnalise(Date dtAnalise) {
		this.dtAnalise = dtAnalise;
	}

	public int getTotCtrRealizados() {
		return totCtrRealizados;
	}

	public void setTotCtrRealizados(int totCtrRealizados) {
		this.totCtrRealizados = totCtrRealizados;
	}

	public int getTotCtrEnvolvidos() {
		return totCtrEnvolvidos;
	}

	public void setTotCtrEnvolvidos(int totCtrEnvolvidos) {
		this.totCtrEnvolvidos = totCtrEnvolvidos;
	}

	public int getTotCtrCancelados() {
		return totCtrCancelados;
	}

	public void setTotCtrCancelados(int totCtrCancelados) {
		this.totCtrCancelados = totCtrCancelados;
	}

	public int getTotCrCanceladas() {
		return totCrCanceladas;
	}

	public void setTotCrCanceladas(int totCrCanceladas) {
		this.totCrCanceladas = totCrCanceladas;
	}

	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getMediaContratos() {
		return mediaContratos;
	}

	public void setMediaContratos(Double mediaContratos) {
		this.mediaContratos = mediaContratos;
	}

	public Double getTicketMedio() {
		return ticketMedio;
	}

	public void setTicketMedio(Double ticketMedio) {
		this.ticketMedio = ticketMedio;
	}

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

	public int getClientesNovos() {
		return clientesNovos;
	}

	public void setClientesNovos(int clientesNovos) {
		this.clientesNovos = clientesNovos;
	}

	public int getClientesAtivo() {
		return clientesAtivo;
	}

	public void setClientesAtivo(int clientesAtivo) {
		this.clientesAtivo = clientesAtivo;
	}

	public Double getTicketMedioFunc() {
		return ticketMedioFunc;
	}

	public void setTicketMedioFunc(Double ticketMedioFunc) {
		this.ticketMedioFunc = ticketMedioFunc;
	}

	public int getQtdeFunc() {
		return qtdeFunc;
	}

	public void setQtdeFunc(int qtdeFunc) {
		this.qtdeFunc = qtdeFunc;
	}

	public int getMesaTotCtrRealizados() {
		return mesaTotCtrRealizados;
	}

	public void setMesaTotCtrRealizados(int mesaTotCtrRealizados) {
		this.mesaTotCtrRealizados = mesaTotCtrRealizados;
	}

	public int getMesaTotCtrEnvolvidos() {
		return mesaTotCtrEnvolvidos;
	}

	public void setMesaTotCtrEnvolvidos(int mesaTotCtrEnvolvidos) {
		this.mesaTotCtrEnvolvidos = mesaTotCtrEnvolvidos;
	}

	public int getMesaTotCtrCancelados() {
		return mesaTotCtrCancelados;
	}

	public void setMesaTotCtrCancelados(int mesaTotCtrCancelados) {
		this.mesaTotCtrCancelados = mesaTotCtrCancelados;
	}

	public int getMesaTotCrCanceladas() {
		return mesaTotCrCanceladas;
	}

	public void setMesaTotCrCanceladas(int mesaTotCrCanceladas) {
		this.mesaTotCrCanceladas = mesaTotCrCanceladas;
	}

	public int getMesaDiasTrabalhados() {
		return mesaDiasTrabalhados;
	}

	public void setMesaDiasTrabalhados(int mesaDiasTrabalhados) {
		this.mesaDiasTrabalhados = mesaDiasTrabalhados;
	}

	public Double getMesaMediaContratos() {
		return mesaMediaContratos;
	}

	public void setMesaMediaContratos(Double mesaMediaContratos) {
		this.mesaMediaContratos = mesaMediaContratos;
	}

	public Double getMesaTicketMedio() {
		return mesaTicketMedio;
	}

	public void setMesaTicketMedio(Double mesaTicketMedio) {
		this.mesaTicketMedio = mesaTicketMedio;
	}

	public int getMesaClientes() {
		return mesaClientes;
	}

	public void setMesaClientes(int mesaClientes) {
		this.mesaClientes = mesaClientes;
	}

	public int getMesaClientesNovos() {
		return mesaClientesNovos;
	}

	public void setMesaClientesNovos(int mesaClientesNovos) {
		this.mesaClientesNovos = mesaClientesNovos;
	}

	public int getMesaClientesAtivo() {
		return mesaClientesAtivo;
	}

	public void setMesaClientesAtivo(int mesaClientesAtivo) {
		this.mesaClientesAtivo = mesaClientesAtivo;
	}

	public Double getMesaTicketMedioFunc() {
		return mesaTicketMedioFunc;
	}

	public void setMesaTicketMedioFunc(Double mesaTicketMedioFunc) {
		this.mesaTicketMedioFunc = mesaTicketMedioFunc;
	}

	public int getMesaQtdeFunc() {
		return mesaQtdeFunc;
	}

	public void setMesaQtdeFunc(int mesaQtdeFunc) {
		this.mesaQtdeFunc = mesaQtdeFunc;
	}

	public int getAnoaTotCtrRealizados() {
		return anoaTotCtrRealizados;
	}

	public void setAnoaTotCtrRealizados(int anoaTotCtrRealizados) {
		this.anoaTotCtrRealizados = anoaTotCtrRealizados;
	}

	public int getAnoaTotCtrEnvolvidos() {
		return anoaTotCtrEnvolvidos;
	}

	public void setAnoaTotCtrEnvolvidos(int anoaTotCtrEnvolvidos) {
		this.anoaTotCtrEnvolvidos = anoaTotCtrEnvolvidos;
	}

	public int getAnoaTotCtrCancelados() {
		return anoaTotCtrCancelados;
	}

	public void setAnoaTotCtrCancelados(int anoaTotCtrCancelados) {
		this.anoaTotCtrCancelados = anoaTotCtrCancelados;
	}

	public int getAnoaTotCrCanceladas() {
		return anoaTotCrCanceladas;
	}

	public void setAnoaTotCrCanceladas(int anoaTotCrCanceladas) {
		this.anoaTotCrCanceladas = anoaTotCrCanceladas;
	}

	public int getAnoaDiasTrabalhados() {
		return anoaDiasTrabalhados;
	}

	public void setAnoaDiasTrabalhados(int anoaDiasTrabalhados) {
		this.anoaDiasTrabalhados = anoaDiasTrabalhados;
	}

	public Double getAnoaMediaContratos() {
		return anoaMediaContratos;
	}

	public void setAnoaMediaContratos(Double anoaMediaContratos) {
		this.anoaMediaContratos = anoaMediaContratos;
	}

	public Double getAnoaTicketMedio() {
		return anoaTicketMedio;
	}

	public void setAnoaTicketMedio(Double anoaTicketMedio) {
		this.anoaTicketMedio = anoaTicketMedio;
	}

	public int getAnoaClientes() {
		return anoaClientes;
	}

	public void setAnoaClientes(int anoaClientes) {
		this.anoaClientes = anoaClientes;
	}

	public int getAnoaClientesNovos() {
		return anoaClientesNovos;
	}

	public void setAnoaClientesNovos(int anoaClientesNovos) {
		this.anoaClientesNovos = anoaClientesNovos;
	}

	public int getAnoaClientesAtivo() {
		return anoaClientesAtivo;
	}

	public void setAnoaClientesAtivo(int anoaClientesAtivo) {
		this.anoaClientesAtivo = anoaClientesAtivo;
	}

	public Double getAnoaTicketMedioFunc() {
		return anoaTicketMedioFunc;
	}

	public void setAnoaTicketMedioFunc(Double anoaTicketMedioFunc) {
		this.anoaTicketMedioFunc = anoaTicketMedioFunc;
	}

	public Double getFaturamentoFunc() {
		return faturamentoFunc;
	}

	public void setFaturamentoFunc(Double faturamentoFunc) {
		this.faturamentoFunc = faturamentoFunc;
	}

	public Double getMesaFaturamentoFunc() {
		return mesaFaturamentoFunc;
	}

	public void setMesaFaturamentoFunc(Double mesaFaturamentoFunc) {
		this.mesaFaturamentoFunc = mesaFaturamentoFunc;
	}

	public Double getAnoaFaturamentoFunc() {
		return anoaFaturamentoFunc;
	}

	public void setAnoaFaturamentoFunc(Double anoaFaturamentoFunc) {
		this.anoaFaturamentoFunc = anoaFaturamentoFunc;
	}

	public int getAnoaQtdeFunc() {
		return anoaQtdeFunc;
	}

	public void setAnoaQtdeFunc(int anoaQtdeFunc) {
		this.anoaQtdeFunc = anoaQtdeFunc;
	}

	public Double getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(Double investimentos) {
		this.investimentos = investimentos;
	}

	public Double getInvestimentosCustoat() {
		return investimentosCustoat;
	}

	public void setInvestimentosCustoat(Double investimentosCustoat) {
		this.investimentosCustoat = investimentosCustoat;
	}

	public Double getEquipPerdidos() {
		return equipPerdidos;
	}

	public void setEquipPerdidos(Double equipPerdidos) {
		this.equipPerdidos = equipPerdidos;
	}

	public Double getEquipPerdidosCustoat() {
		return equipPerdidosCustoat;
	}

	public void setEquipPerdidosCustoat(Double equipPerdidosCustoat) {
		this.equipPerdidosCustoat = equipPerdidosCustoat;
	}

	public Double getInventario() {
		return inventario;
	}

	public void setInventario(Double inventario) {
		this.inventario = inventario;
	}

	public Double getInventarioCustoatual() {
		return inventarioCustoatual;
	}

	public void setInventarioCustoatual(Double inventarioCustoatual) {
		this.inventarioCustoatual = inventarioCustoatual;
	}

	public Double getLocacoes() {
		return Locacoes;
	}

	public void setLocacoes(Double locacoes) {
		Locacoes = locacoes;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	public Double getBolocador() {
		return bolocador;
	}

	public void setBolocador(Double bolocador) {
		this.bolocador = bolocador;
	}

	public Double getBolocatario() {
		return bolocatario;
	}

	public void setBolocatario(Double bolocatario) {
		this.bolocatario = bolocatario;
	}

	public Double getVendasAcessorio() {
		return vendasAcessorio;
	}

	public void setVendasAcessorio(Double vendasAcessorio) {
		this.vendasAcessorio = vendasAcessorio;
	}

	public Double getVendasEquipamentos() {
		return vendasEquipamentos;
	}

	public void setVendasEquipamentos(Double vendasEquipamentos) {
		this.vendasEquipamentos = vendasEquipamentos;
	}

	public Double getManutencao() {
		return manutencao;
	}

	public void setManutencao(Double manutencao) {
		this.manutencao = manutencao;
	}

	public Double getBolocadorTot() {
		return bolocadorTot;
	}

	public void setBolocadorTot(Double bolocadorTot) {
		this.bolocadorTot = bolocadorTot;
	}

	public Double getBolocatarioTot() {
		return bolocatarioTot;
	}

	public void setBolocatarioTot(Double bolocatarioTot) {
		this.bolocatarioTot = bolocatarioTot;
	}

	public Double getDescontoctrencer() {
		return descontoctrencer;
	}

	public void setDescontoctrencer(Double descontoctrencer) {
		this.descontoctrencer = descontoctrencer;
	}

	public Double getRoyalLocacoes() {
		return royalLocacoes;
	}

	public void setRoyalLocacoes(Double royalLocacoes) {
		this.royalLocacoes = royalLocacoes;
	}

	public Double getRoyalAdicional() {
		return royalAdicional;
	}

	public void setRoyalAdicional(Double royalAdicional) {
		this.royalAdicional = royalAdicional;
	}

	public Double getRoyalBolocador() {
		return royalBolocador;
	}

	public void setRoyalBolocador(Double royalBolocador) {
		this.royalBolocador = royalBolocador;
	}

	public Double getRoyalBolocatario() {
		return royalBolocatario;
	}

	public void setRoyalBolocatario(Double royalBolocatario) {
		this.royalBolocatario = royalBolocatario;
	}

	public Double getRoyalVendasAcessorio() {
		return royalVendasAcessorio;
	}

	public void setRoyalVendasAcessorio(Double royalVendasAcessorio) {
		this.royalVendasAcessorio = royalVendasAcessorio;
	}

	public Double getRoyalVendasEquipamen() {
		return royalVendasEquipamen;
	}

	public void setRoyalVendasEquipamen(Double royalVendasEquipamen) {
		this.royalVendasEquipamen = royalVendasEquipamen;
	}

	public Double getRoyalManutencao() {
		return royalManutencao;
	}

	public void setRoyalManutencao(Double royalManutencao) {
		this.royalManutencao = royalManutencao;
	}

	public Double getRoyalDescontoctrence() {
		return royalDescontoctrence;
	}

	public void setRoyalDescontoctrence(Double royalDescontoctrence) {
		this.royalDescontoctrence = royalDescontoctrence;
	}

	public Double getFaturamentoTotal() {
		return faturamentoTotal;
	}

	public void setFaturamentoTotal(Double faturamentoTotal) {
		this.faturamentoTotal = faturamentoTotal;
	}

	public Double getRoayltiesTotal() {
		return roayltiesTotal;
	}

	public void setRoayltiesTotal(Double roayltiesTotal) {
		this.roayltiesTotal = roayltiesTotal;
	}

	public Double getTotalReinvestimento() {
		return totalReinvestimento;
	}

	public void setTotalReinvestimento(Double totalReinvestimento) {
		this.totalReinvestimento = totalReinvestimento;
	}

	public Double getTotalRecebimento() {
		return totalRecebimento;
	}

	public void setTotalRecebimento(Double totalRecebimento) {
		this.totalRecebimento = totalRecebimento;
	}

	public Double getTotalDespesas() {
		return totalDespesas;
	}

	public void setTotalDespesas(Double totalDespesas) {
		this.totalDespesas = totalDespesas;
	}

	public Double getFinanEquiptos() {
		return finanEquiptos;
	}

	public void setFinanEquiptos(Double finanEquiptos) {
		this.finanEquiptos = finanEquiptos;
	}

	public Double getFinanUtensilios() {
		return finanUtensilios;
	}

	public void setFinanUtensilios(Double finanUtensilios) {
		this.finanUtensilios = finanUtensilios;
	}

	public Double getDevAporteCapital() {
		return devAporteCapital;
	}

	public void setDevAporteCapital(Double devAporteCapital) {
		this.devAporteCapital = devAporteCapital;
	}

	public Double getDevEmprestimos() {
		return devEmprestimos;
	}

	public void setDevEmprestimos(Double devEmprestimos) {
		this.devEmprestimos = devEmprestimos;
	}

	public Double getCpAVencer() {
		return cpAVencer;
	}

	public void setCpAVencer(Double cpAVencer) {
		this.cpAVencer = cpAVencer;
	}

	public Double getCpAtraso30() {
		return cpAtraso30;
	}

	public void setCpAtraso30(Double cpAtraso30) {
		this.cpAtraso30 = cpAtraso30;
	}

	public Double getCpAtraso60() {
		return cpAtraso60;
	}

	public void setCpAtraso60(Double cpAtraso60) {
		this.cpAtraso60 = cpAtraso60;
	}

	public Double getCpAtraso90() {
		return cpAtraso90;
	}

	public void setCpAtraso90(Double cpAtraso90) {
		this.cpAtraso90 = cpAtraso90;
	}

	public Double getCpAtrasoMais90() {
		return cpAtrasoMais90;
	}

	public void setCpAtrasoMais90(Double cpAtrasoMais90) {
		this.cpAtrasoMais90 = cpAtrasoMais90;
	}

	public Double getCrPotEmitir() {
		return crPotEmitir;
	}

	public void setCrPotEmitir(Double crPotEmitir) {
		this.crPotEmitir = crPotEmitir;
	}

	public Double getCrEmitidas() {
		return crEmitidas;
	}

	public void setCrEmitidas(Double crEmitidas) {
		this.crEmitidas = crEmitidas;
	}

	public Double getCrAEmitir() {
		return crAEmitir;
	}

	public void setCrAEmitir(Double crAEmitir) {
		this.crAEmitir = crAEmitir;
	}

	public Double getCrInadimp91120() {
		return crInadimp91120;
	}

	public void setCrInadimp91120(Double crInadimp91120) {
		this.crInadimp91120 = crInadimp91120;
	}

	public Double getFuncdoPerdAcm() {
		return funcdoPerdAcm;
	}

	public void setFuncdoPerdAcm(Double funcdoPerdAcm) {
		this.funcdoPerdAcm = funcdoPerdAcm;
	}

	public int getCtrZeradosDev() {
		return ctrZeradosDev;
	}

	public void setCtrZeradosDev(int ctrZeradosDev) {
		this.ctrZeradosDev = ctrZeradosDev;
	}

	public int getMesaCtrZeradosDev() {
		return mesaCtrZeradosDev;
	}

	public void setMesaCtrZeradosDev(int mesaCtrZeradosDev) {
		this.mesaCtrZeradosDev = mesaCtrZeradosDev;
	}

	public int getAnoaCtrZeradosDev() {
		return anoaCtrZeradosDev;
	}

	public void setAnoaCtrZeradosDev(int anoaCtrZeradosDev) {
		this.anoaCtrZeradosDev = anoaCtrZeradosDev;
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	public int getQtdeGerencial() {
		return qtdeGerencial;
	}

	public void setQtdeGerencial(int qtdeGerencial) {
		this.qtdeGerencial = qtdeGerencial;
	}

	public TabelaGer getTabGrupoII() {
		return tabGrupoII;
	}

	public void setTabGrupoII(TabelaGer tabGrupoII) {
		this.tabGrupoII = tabGrupoII;
	}

	public Double getFaturamentoTotalBase() {
		return faturamentoTotalBase;
	}

	public void setFaturamentoTotalBase(Double faturamentoTotalBase) {
		this.faturamentoTotalBase = faturamentoTotalBase;
	}

}
