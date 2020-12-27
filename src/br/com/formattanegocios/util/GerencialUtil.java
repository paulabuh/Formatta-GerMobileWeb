package br.com.formattanegocios.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.formattanegocios.model.GerencialDiario;
import br.com.formattanegocios.model.HeaderTab;
import br.com.formattanegocios.model.ItemTab;
import br.com.formattanegocios.model.TabelaGer;

public class GerencialUtil {

	public static void geraTabGrupoII(GerencialDiario pGer) {

		TabelaGer tab = pGer.getTabGrupoII();

		tab.getHeader().setHeader1("Descrição");
		tab.getHeader().setHeader2("Total");
		tab.getHeader().setHeader3("Base");
		tab.getHeader().setHeader4("%");
		tab.getHeader().setHeader5("Valor");

		List<ItemTab> itens = tab.getItens();

		ItemTab i1 = new ItemTab();
		i1.setDescricao("Locações");
		i1.setValor1(pGer.getLocacoes());
		i1.setValor2(pGer.getLocacoes());
		i1.setValor3(8);
		i1.setValor4(pGer.getRoyalLocacoes());
		itens.add(i1);

		ItemTab i2 = new ItemTab();
		i2.setDescricao("Deslocamento");
		i2.setValor1(pGer.getAdicional());
		i2.setValor2(pGer.getAdicional());
		i2.setValor3(8);
		i2.setValor4(pGer.getRoyalAdicional());
		itens.add(i2);

		ItemTab i3 = new ItemTab();
		i3.setDescricao("BOF Locador");
		i3.setValor1(pGer.getBolocador());
		i3.setValor2(pGer.getBolocador());
		i3.setValor3(8);
		i3.setValor4(pGer.getRoyalBolocador());
		itens.add(i3);

		ItemTab i4 = new ItemTab();
		i4.setDescricao("BOF Locatário");
		i4.setValor1(pGer.getBolocatarioTot());
		i4.setValor2(pGer.getBolocatario());
		i4.setValor3(8);
		i4.setValor4(pGer.getRoyalBolocatario());
		itens.add(i4);

		ItemTab i5 = new ItemTab();
		i5.setDescricao("Partes Móveis");
		i5.setValor1(pGer.getVendasAcessorio());
		i5.setValor2(pGer.getVendasAcessorio());
		i5.setValor3(1);
		i5.setValor4(pGer.getRoyalVendasAcessorio());
		itens.add(i5);

		ItemTab i6 = new ItemTab();
		i6.setDescricao("Vendas Equipamentos");
		i6.setValor1(pGer.getVendasEquipamentos());
		i6.setValor2(pGer.getVendasEquipamentos());
		i6.setValor3(1);
		i6.setValor4(pGer.getRoyalVendasEquipamen());
		itens.add(i6);

		ItemTab i7 = new ItemTab();
		i7.setDescricao("Manutenção");
		i7.setValor1(pGer.getManutencao());
		i7.setValor2(pGer.getManutencao());
		i7.setValor3(10);
		i7.setValor4(pGer.getRoyalManutencao());
		itens.add(i7);

		ItemTab i8 = new ItemTab();
		i8.setDescricao("Descto Ctr Encerrado");
		i8.setValor1(pGer.getDescontoctrencer());
		i8.setValor2(pGer.getDescontoctrencer());
		i8.setValor3(10);
		i8.setValor4(pGer.getRoyalDescontoctrence());
		itens.add(i8);

		// rodape
		DecimalFormat f = new DecimalFormat("##.00");
		Double totFatBase = (pGer.getFaturamentoTotal()
				- pGer.getBolocadorTot() + pGer.getBolocatario());
		tab.getFooter().setHeader1("Total");
		tab.getFooter().setHeader2(f.format(pGer.getFaturamentoTotal()));
		tab.getFooter().setHeader3(f.format(totFatBase));
		tab.getFooter().setHeader4("");
		tab.getFooter().setHeader5(f.format(pGer.getRoayltiesTotal()));

		ItemTab i9 = new ItemTab();
		i9.setDescricao("Total");
		i9.setValor1(pGer.getFaturamentoTotal());
		i9.setValor2(totFatBase);
		i9.setValor3(0);
		i9.setValor4(pGer.getRoayltiesTotal());
		itens.add(i9);
	}

	public static void inicializaTabela(TabelaGer pTab) {

		pTab.setHeader(new HeaderTab());
		pTab.setItens(new ArrayList<ItemTab>());
		pTab.setFooter(new HeaderTab());

	}
}
