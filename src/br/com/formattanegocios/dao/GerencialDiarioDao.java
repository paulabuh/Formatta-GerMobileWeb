package br.com.formattanegocios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.formattanegocios.jdbc.ConnectionFactory;
import br.com.formattanegocios.model.GerencialDiario;
import br.com.formattanegocios.util.LojasUtil;
import br.com.formattanegocios.util.Util;

public class GerencialDiarioDao implements IDao<GerencialDiario> {

	public void gerencialByData(GerencialDiario pModel) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;

		try {

			connection = ConnectionFactory.getPoolConnection();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			StringBuilder sql = new StringBuilder();

			sql.append(" select count(id) qtdegerencial, ");
			sql.append("sum( TOT_CTR_REALIZADOS) TOT_CTR_REALIZADOS, ");
			sql.append(" sum( TOT_CTR_ENVOLVIDOS) TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( TOT_CTR_CANCELADOS) TOT_CTR_CANCELADOS, ");
			sql.append(" sum( TOT_CR_CANCELADAS) TOT_CR_CANCELADAS, ");
			sql.append(" sum( DIAS_TRABALHADOS)/ count(*) DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  TICKET_MEDIO, ");
			sql.append(" sum( CLIENTES)  CLIENTES, ");
			sql.append(" sum( CLIENTES_NOVOS)  CLIENTES_NOVOS, ");
			sql.append(" sum( CLIENTES_ATIVO) CLIENTES_ATIVO , ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  TICKET_MEDIO_FUN, ");
			sql.append(" sum(QTDE_FUN) QTDE_FUN, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  FATURAMENTO_FUN, ");

			sql.append(" sum( MESA_TOT_CTR_REALIZADOS) MESA_TOT_CTR_REALIZADOS, ");
			sql.append(" sum( MESA_TOT_CTR_ENVOLVIDOS) MESA_TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( MESA_TOT_CTR_CANCELADOS) MESA_TOT_CTR_CANCELADOS, ");
			sql.append(" sum( MESA_TOT_CR_CANCELADAS), ");
			sql.append(" sum( MESA_DIAS_TRABALHADOS)/ count(*) MESA_DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_TICKET_MEDIO, ");
			sql.append(" sum( MESA_CLIENTES) MESA_CLIENTES, ");
			sql.append(" sum( MESA_CLIENTES_NOVOS) MESA_CLIENTES_NOVOS, ");
			sql.append(" sum( MESA_CLIENTES_ATIVO) MESA_CLIENTES_ATIVO, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_TICKET_MEDIO_FUN, ");
			sql.append(" sum( MESA_QTDE_FUNC) MESA_QTDE_FUNC, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_FATURAMENTO_FUN, ");

			sql.append(" sum( ANOA_TOT_CTR_REALIZADOS) ANOA_TOT_CTR_REALIZADOS, ");
			sql.append(" sum( ANOA_TOT_CTR_ENVOLVIDOS) ANOA_TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( ANOA_TOT_CTR_CANCELADOS) ANOA_TOT_CTR_CANCELADOS, ");
			sql.append(" sum( ANOA_TOT_CR_CANCELADAS) ANOA_TOT_CR_CANCELADAS, ");
			sql.append(" sum( ANOA_DIAS_TRABALHADOS)/count(*)  ANOA_DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  ANOA_MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ ANOA_TICKET_MEDIO, ");
			sql.append(" sum( ANOA_CLIENTES)  ANOA_CLIENTES, ");
			sql.append(" sum( ANOA_CLIENTES_NOVOS) ANOA_CLIENTES_NOVOS, ");
			sql.append(" sum( ANOA_CLIENTES_ATIVO)  ANOA_CLIENTES_ATIVO, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  ANOA_TICKET_MEDIO_FUN, ");
			sql.append(" sum( ANOA_QTDE_FUNC) ANOA_QTDE_FUNC, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ ANOA_FATURAMENTO_FUN, ");

			sql.append(" sum( INVESTIMENTOS) INVESTIMENTOS, ");
			sql.append(" sum( INVESTIMENTOS_CUSTOATUAL) INVESTIMENTOS_CUSTOATUAL, ");
			sql.append(" sum( EQUIP_PERDIDOS) EQUIP_PERDIDOS, ");
			sql.append(" sum( EQUIP_PERDIDOS_CUSTOATUAL) EQUIP_PERDIDOS_CUSTOATUAL, ");
			sql.append(" sum( INVENTARIO) INVENTARIO, ");
			sql.append(" sum( INVENTARIO_CUSTOATUAL) INVENTARIO_CUSTOATUAL, ");

			sql.append(" sum( LOCACOES) LOCACOES, ");
			sql.append(" sum( ADICIONAL) ADICIONAL, ");
			sql.append(" sum( BOLOCADOR) BOLOCADOR, ");
			sql.append(" sum( BOLOCATARIO) BOLOCATARIO, ");
			sql.append(" sum( VENDAS_ACESSORIO) VENDAS_ACESSORIO, ");
			sql.append(" sum( VENDAS_EQUIPAMENTOS) VENDAS_EQUIPAMENTOS, ");
			sql.append(" sum( MANUTENCAO) MANUTENCAO, ");
			sql.append(" sum( BOLOCADOR_TOT) BOLOCADOR_TOT, ");
			sql.append(" sum( BOLOCATARIO_TOT) BOLOCATARIO_TOT, ");
			sql.append(" sum( DESCONTOCTRENCER) DESCONTOCTRENCER, ");
			sql.append(" sum( ROYAL_LOCACOES) ROYAL_LOCACOES, ");
			sql.append(" sum( ROYAL_ADICIONAL) ROYAL_ADICIONAL, ");
			sql.append(" sum( ROYAL_BOLOCADOR) ROYAL_BOLOCADOR, ");
			sql.append(" sum( ROYAL_BOLOCATARIO) ROYAL_BOLOCATARIO, ");
			sql.append(" sum( ROYAL_VENDAS_ACESSORIO) ROYAL_VENDAS_ACESSORIO, ");
			sql.append(" sum( ROYAL_VENDAS_EQUIPAMENTOS) ROYAL_VENDAS_EQUIPAMENTOS, ");
			sql.append(" sum( ROYAL_MANUTENCAO) ROYAL_MANUTENCAO, ");
			sql.append(" sum( ROYAL_DESCONTOCTRENCER) ROYAL_DESCONTOCTRENCER, ");
			sql.append(" sum( FATURAMENTO_TOTAL) FATURAMENTO_TOTAL, ");
			sql.append(" sum( ROAYLTIES_TOTAL) ROAYLTIES_TOTAL, ");

			sql.append(" sum( TOTAL_REINVESTIMENTO) TOTAL_REINVESTIMENTO, ");
			sql.append(" sum( TOTAL_RECEBIMENTO) TOTAL_RECEBIMENTO, ");
			sql.append(" sum( TOTAL_DESPESAS) TOTAL_DESPESAS, ");

			sql.append(" sum( FINAN_EQUIPTOS) FINAN_EQUIPTOS, ");
			sql.append(" sum( FINAN_UTENSILIOS) FINAN_UTENSILIOS, ");
			sql.append(" sum( DEV_APORTE_CAPITAL) DEV_APORTE_CAPITAL, ");
			sql.append(" sum( DEV_EMPRESTIMOS) DEV_EMPRESTIMOS, ");
			sql.append(" sum( CP_A_VENCER) CP_A_VENCER, ");
			sql.append(" sum( CP_ATRASO_30) CP_ATRASO_30, ");
			sql.append(" sum( CP_ATRASO_60) CP_ATRASO_60, ");
			sql.append(" sum( CP_ATRASO_90) CP_ATRASO_90, ");
			sql.append(" sum( CP_ATRASO_MAIS_90) CP_ATRASO_MAIS_90, ");

			sql.append(" sum( CR_POT_EMITIR) CR_POT_EMITIR, ");
			sql.append(" sum( CR_EMITIDAS) CR_EMITIDAS, ");
			sql.append(" sum( CR_A_EMITIR) CR_A_EMITIR, ");
			sql.append(" sum( CR_INADIMP_91_120) CR_INADIMP_91_120, ");
			sql.append(" sum( FUNDO_PERD_ACM) FUNDO_PERD_ACM, ");

			sql.append(" sum( CTR_ZERADOS_DEV) CTR_ZERADOS_DEV, ");
			sql.append(" sum( MESA_CTR_ZERADOS_DEV) MESA_CTR_ZERADOS_DEV, ");
			sql.append(" sum(  ANOA_CTR_ZERADOS_DEV ) ANOA_CTR_ZERADOS_DEV ");
			sql.append(" from TB_GERENCIAL_DIARIO ");
			sql.append(" where   dt_analise = '"
					+ sd.format(pModel.getDtAnalise()) + "'");
			sql.append("  and idloja in ("
					+ LojasUtil.lojasSelecionadas(pModel.getLojas()) + ")");

			pstmt = connection.prepareStatement(sql.toString());
			rst = pstmt.executeQuery();

			if (rst.next()) {
				pModel.setQtdeGerencial(rst.getInt("qtdegerencial"));
				pModel.setFaturamentoTotal(rst.getDouble("FATURAMENTO_TOTAL"));

				pModel.setTotCtrRealizados(rst.getInt("TOT_CTR_REALIZADOS"));
				pModel.setTotCtrEnvolvidos(rst.getInt("TOT_CTR_ENVOLVIDOS"));
				pModel.setTotCtrCancelados(rst.getInt("TOT_CTR_CANCELADOS"));
				pModel.setTotCrCanceladas(rst.getInt("TOT_CR_CANCELADAS"));
				pModel.setDiasTrabalhados(rst.getInt("DIAS_TRABALHADOS"));

				if (pModel.getDiasTrabalhados() > 0) {
					pModel.setMediaContratos((double) (pModel
							.getTotCtrRealizados() / pModel
							.getDiasTrabalhados()));
				} else {
					pModel.setMediaContratos((double) pModel
							.getTotCtrRealizados());
				}

				if (pModel.getTotCtrEnvolvidos() > 0) {
					pModel.setTicketMedio((double) (pModel
							.getFaturamentoTotal() / pModel
							.getTotCtrEnvolvidos()));
				} else {
					pModel.setTicketMedio(pModel.getFaturamentoTotal());
				}

				pModel.setClientes(rst.getInt("CLIENTES"));
				pModel.setClientesNovos(rst.getInt("CLIENTES_NOVOS"));
				pModel.setClientesAtivo(rst.getInt("CLIENTES_ATIVO"));
				pModel.setQtdeFunc(rst.getInt("QTDE_FUN"));

				if (pModel.getQtdeFunc() > 0) {
					pModel.setTicketMedioFunc((double) (pModel.getTicketMedio() / pModel
							.getQtdeFunc()));
				} else {
					pModel.setTicketMedioFunc(pModel.getTicketMedio());
				}

				if (pModel.getQtdeFunc() > 0) {
					pModel.setFaturamentoFunc((double) (pModel
							.getFaturamentoTotal() / pModel.getQtdeFunc()));
				} else {
					pModel.setFaturamentoFunc(pModel.getFaturamentoTotal());
				}

				pModel.setLocacoes(rst.getDouble("LOCACOES"));
				pModel.setAdicional(rst.getDouble("ADICIONAL"));
				pModel.setBolocador(rst.getDouble("BOLOCADOR"));
				pModel.setBolocatario(rst.getDouble("BOLOCATARIO"));
				pModel.setVendasAcessorio(rst.getDouble("VENDAS_ACESSORIO"));
				pModel.setVendasEquipamentos(rst
						.getDouble("VENDAS_EQUIPAMENTOS"));
				pModel.setManutencao(rst.getDouble("MANUTENCAO"));
				pModel.setBolocadorTot(rst.getDouble("BOLOCADOR_TOT"));
				pModel.setBolocatarioTot(rst.getDouble("BOLOCATARIO_TOT"));
				pModel.setDescontoctrencer(rst.getDouble("DESCONTOCTRENCER"));

				pModel.setFaturamentoTotalBase(pModel.getFaturamentoTotal()
						- pModel.getBolocatarioTot() + pModel.getBolocatario());

				pModel.setRoyalLocacoes(rst.getDouble("ROYAL_LOCACOES"));
				pModel.setRoyalAdicional(rst.getDouble("ROYAL_ADICIONAL"));
				pModel.setRoyalBolocador(rst.getDouble("ROYAL_BOLOCADOR"));
				pModel.setRoyalBolocatario(rst.getDouble("ROYAL_BOLOCATARIO"));
				pModel.setRoyalVendasAcessorio(rst
						.getDouble("ROYAL_VENDAS_ACESSORIO"));
				pModel.setRoyalVendasEquipamen(rst
						.getDouble("ROYAL_VENDAS_EQUIPAMENTOS"));
				pModel.setRoyalManutencao(rst.getDouble("ROYAL_MANUTENCAO"));
				pModel.setRoyalDescontoctrence(rst
						.getDouble("ROYAL_DESCONTOCTRENCER"));
				pModel.setRoayltiesTotal(rst.getDouble("ROAYLTIES_TOTAL"));

				pModel.setTotalReinvestimento(rst
						.getDouble("TOTAL_REINVESTIMENTO"));
				pModel.setTotalRecebimento(rst.getDouble("TOTAL_RECEBIMENTO"));
				pModel.setTotalDespesas(rst.getDouble("TOTAL_DESPESAS"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Util.close(rst, pstmt, connection);

			rst = null;
			pstmt = null;
			connection = null;
		}

	}

	
	public void gerencialTudoNaData(GerencialDiario pModel) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;

		try {

			connection = ConnectionFactory.getPoolConnection();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			StringBuilder sql = new StringBuilder();

			sql.append(" select count(id) qtdegerencial, ");
			sql.append("sum( TOT_CTR_REALIZADOS) TOT_CTR_REALIZADOS, ");
			sql.append(" sum( TOT_CTR_ENVOLVIDOS) TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( TOT_CTR_CANCELADOS) TOT_CTR_CANCELADOS, ");
			sql.append(" sum( TOT_CR_CANCELADAS) TOT_CR_CANCELADAS, ");
			sql.append(" sum( DIAS_TRABALHADOS)/ count(*) DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  TICKET_MEDIO, ");
			sql.append(" sum( CLIENTES)  CLIENTES, ");
			sql.append(" sum( CLIENTES_NOVOS)  CLIENTES_NOVOS, ");
			sql.append(" sum( CLIENTES_ATIVO) CLIENTES_ATIVO , ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  TICKET_MEDIO_FUN, ");
			sql.append(" sum(QTDE_FUN) QTDE_FUN, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  FATURAMENTO_FUN, ");

			sql.append(" sum( MESA_TOT_CTR_REALIZADOS) MESA_TOT_CTR_REALIZADOS, ");
			sql.append(" sum( MESA_TOT_CTR_ENVOLVIDOS) MESA_TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( MESA_TOT_CTR_CANCELADOS) MESA_TOT_CTR_CANCELADOS, ");
			sql.append(" sum( MESA_TOT_CR_CANCELADAS), ");
			sql.append(" sum( MESA_DIAS_TRABALHADOS)/ count(*) MESA_DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_TICKET_MEDIO, ");
			sql.append(" sum( MESA_CLIENTES) MESA_CLIENTES, ");
			sql.append(" sum( MESA_CLIENTES_NOVOS) MESA_CLIENTES_NOVOS, ");
			sql.append(" sum( MESA_CLIENTES_ATIVO) MESA_CLIENTES_ATIVO, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_TICKET_MEDIO_FUN, ");
			sql.append(" sum( MESA_QTDE_FUNC) MESA_QTDE_FUNC, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ MESA_FATURAMENTO_FUN, ");

			sql.append(" sum( ANOA_TOT_CTR_REALIZADOS) ANOA_TOT_CTR_REALIZADOS, ");
			sql.append(" sum( ANOA_TOT_CTR_ENVOLVIDOS) ANOA_TOT_CTR_ENVOLVIDOS, ");
			sql.append(" sum( ANOA_TOT_CTR_CANCELADOS) ANOA_TOT_CTR_CANCELADOS, ");
			sql.append(" sum( ANOA_TOT_CR_CANCELADAS) ANOA_TOT_CR_CANCELADAS, ");
			sql.append(" sum( ANOA_DIAS_TRABALHADOS)/count(*)  ANOA_DIAS_TRABALHADOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  ANOA_MEDIA_CONTRATOS, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ ANOA_TICKET_MEDIO, ");
			sql.append(" sum( ANOA_CLIENTES) ANOA_CLIENTES, ");
			sql.append(" sum( ANOA_CLIENTES_NOVOS) ANOA_CLIENTES_NOVOS, ");
			sql.append(" sum( ANOA_CLIENTES_ATIVO)  ANOA_CLIENTES_ATIVO, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/  ANOA_TICKET_MEDIO_FUN, ");
			sql.append(" sum( ANOA_QTDE_FUNC) ANOA_QTDE_FUNC, ");
			// sql.append(" 0/*calcluar na dao TOT_CTR_REALIZADOS/DIAS_TRABALHADOS*/ ANOA_FATURAMENTO_FUN, ");

			sql.append(" sum( INVESTIMENTOS) INVESTIMENTOS, ");
			sql.append(" sum( INVESTIMENTOS_CUSTOATUAL) INVESTIMENTOS_CUSTOATUAL, ");
			sql.append(" sum( EQUIP_PERDIDOS) EQUIP_PERDIDOS, ");
			sql.append(" sum( EQUIP_PERDIDOS_CUSTOATUAL) EQUIP_PERDIDOS_CUSTOATUAL, ");
			sql.append(" sum( INVENTARIO) INVENTARIO, ");
			sql.append(" sum( INVENTARIO_CUSTOATUAL) INVENTARIO_CUSTOATUAL, ");

			sql.append(" sum( LOCACOES) LOCACOES, ");
			sql.append(" sum( ADICIONAL) ADICIONAL, ");
			sql.append(" sum( BOLOCADOR) BOLOCADOR, ");
			sql.append(" sum( BOLOCATARIO) BOLOCATARIO, ");
			sql.append(" sum( VENDAS_ACESSORIO) VENDAS_ACESSORIO, ");
			sql.append(" sum( VENDAS_EQUIPAMENTOS) VENDAS_EQUIPAMENTOS, ");
			sql.append(" sum( MANUTENCAO) MANUTENCAO, ");
			sql.append(" sum( BOLOCADOR_TOT) BOLOCADOR_TOT, ");
			sql.append(" sum( BOLOCATARIO_TOT) BOLOCATARIO_TOT, ");
			sql.append(" sum( DESCONTOCTRENCER) DESCONTOCTRENCER, ");
			sql.append(" sum( ROYAL_LOCACOES) ROYAL_LOCACOES, ");
			sql.append(" sum( ROYAL_ADICIONAL) ROYAL_ADICIONAL, ");
			sql.append(" sum( ROYAL_BOLOCADOR) ROYAL_BOLOCADOR, ");
			sql.append(" sum( ROYAL_BOLOCATARIO) ROYAL_BOLOCATARIO, ");
			sql.append(" sum( ROYAL_VENDAS_ACESSORIO) ROYAL_VENDAS_ACESSORIO, ");
			sql.append(" sum( ROYAL_VENDAS_EQUIPAMENTOS) ROYAL_VENDAS_EQUIPAMENTOS, ");
			sql.append(" sum( ROYAL_MANUTENCAO) ROYAL_MANUTENCAO, ");
			sql.append(" sum( ROYAL_DESCONTOCTRENCER) ROYAL_DESCONTOCTRENCER, ");
			sql.append(" sum( FATURAMENTO_TOTAL) FATURAMENTO_TOTAL, ");
			sql.append(" sum( ROAYLTIES_TOTAL) ROAYLTIES_TOTAL, ");

			sql.append(" sum( TOTAL_REINVESTIMENTO) TOTAL_REINVESTIMENTO, ");
			sql.append(" sum( TOTAL_RECEBIMENTO) TOTAL_RECEBIMENTO, ");
			sql.append(" sum( TOTAL_DESPESAS) TOTAL_DESPESAS, ");

			sql.append(" sum( FINAN_EQUIPTOS) FINAN_EQUIPTOS, ");
			sql.append(" sum( FINAN_UTENSILIOS) FINAN_UTENSILIOS, ");
			sql.append(" sum( DEV_APORTE_CAPITAL) DEV_APORTE_CAPITAL, ");
			sql.append(" sum( DEV_EMPRESTIMOS) DEV_EMPRESTIMOS, ");
			sql.append(" sum( CP_A_VENCER) CP_A_VENCER, ");
			sql.append(" sum( CP_ATRASO_30) CP_ATRASO_30, ");
			sql.append(" sum( CP_ATRASO_60) CP_ATRASO_60, ");
			sql.append(" sum( CP_ATRASO_90) CP_ATRASO_90, ");
			sql.append(" sum( CP_ATRASO_MAIS_90) CP_ATRASO_MAIS_90, ");

			sql.append(" sum( CR_POT_EMITIR) CR_POT_EMITIR, ");
			sql.append(" sum( CR_EMITIDAS) CR_EMITIDAS, ");
			sql.append(" sum( CR_A_EMITIR) CR_A_EMITIR, ");
			sql.append(" sum( CR_INADIMP_91_120) CR_INADIMP_91_120, ");
			sql.append(" sum( FUNDO_PERD_ACM) FUNDO_PERD_ACM, ");

			sql.append(" sum( CTR_ZERADOS_DEV) CTR_ZERADOS_DEV, ");
			sql.append(" sum( MESA_CTR_ZERADOS_DEV) MESA_CTR_ZERADOS_DEV, ");
			sql.append(" sum(  ANOA_CTR_ZERADOS_DEV ) ANOA_CTR_ZERADOS_DEV ");
			sql.append(" from TB_GERENCIAL_DIARIO ");
			sql.append(" where   dt_analise = '"
					+ sd.format(pModel.getDtAnalise()) + "'");
			

			pstmt = connection.prepareStatement(sql.toString());
			rst = pstmt.executeQuery();

			if (rst.next()) {
				pModel.setQtdeGerencial(rst.getInt("qtdegerencial"));
				pModel.setFaturamentoTotal(rst.getDouble("FATURAMENTO_TOTAL"));

				pModel.setTotCtrRealizados(rst.getInt("TOT_CTR_REALIZADOS"));
				pModel.setTotCtrEnvolvidos(rst.getInt("TOT_CTR_ENVOLVIDOS"));
				pModel.setTotCtrCancelados(rst.getInt("TOT_CTR_CANCELADOS"));
				pModel.setTotCrCanceladas(rst.getInt("TOT_CR_CANCELADAS"));
				pModel.setDiasTrabalhados(rst.getInt("DIAS_TRABALHADOS"));

				if (pModel.getDiasTrabalhados() > 0) {
					pModel.setMediaContratos((double) (pModel
							.getTotCtrRealizados() / pModel
							.getDiasTrabalhados()));
				} else {
					pModel.setMediaContratos((double) pModel
							.getTotCtrRealizados());
				}

				if (pModel.getTotCtrEnvolvidos() > 0) {
					pModel.setTicketMedio((double) (pModel
							.getFaturamentoTotal() / pModel
							.getTotCtrEnvolvidos()));
				} else {
					pModel.setTicketMedio(pModel.getFaturamentoTotal());
				}

				pModel.setClientes(rst.getInt("CLIENTES"));
				pModel.setClientesNovos(rst.getInt("CLIENTES_NOVOS"));
				pModel.setClientesAtivo(rst.getInt("CLIENTES_ATIVO"));
				pModel.setQtdeFunc(rst.getInt("QTDE_FUN"));

				if (pModel.getQtdeFunc() > 0) {
					pModel.setTicketMedioFunc((double) (pModel.getTicketMedio() / pModel
							.getQtdeFunc()));
				} else {
					pModel.setTicketMedioFunc(pModel.getTicketMedio());
				}

				if (pModel.getQtdeFunc() > 0) {
					pModel.setFaturamentoFunc((double) (pModel
							.getFaturamentoTotal() / pModel.getQtdeFunc()));
				} else {
					pModel.setFaturamentoFunc(pModel.getFaturamentoTotal());
				}

				pModel.setLocacoes(rst.getDouble("LOCACOES"));
				pModel.setAdicional(rst.getDouble("ADICIONAL"));
				pModel.setBolocador(rst.getDouble("BOLOCADOR"));
				pModel.setBolocatario(rst.getDouble("BOLOCATARIO"));
				pModel.setVendasAcessorio(rst.getDouble("VENDAS_ACESSORIO"));
				pModel.setVendasEquipamentos(rst
						.getDouble("VENDAS_EQUIPAMENTOS"));
				pModel.setManutencao(rst.getDouble("MANUTENCAO"));
				pModel.setBolocadorTot(rst.getDouble("BOLOCADOR_TOT"));
				pModel.setBolocatarioTot(rst.getDouble("BOLOCATARIO_TOT"));
				pModel.setDescontoctrencer(rst.getDouble("DESCONTOCTRENCER"));

				pModel.setFaturamentoTotalBase(pModel.getFaturamentoTotal()
						- pModel.getBolocatarioTot() + pModel.getBolocatario());

				pModel.setRoyalLocacoes(rst.getDouble("ROYAL_LOCACOES"));
				pModel.setRoyalAdicional(rst.getDouble("ROYAL_ADICIONAL"));
				pModel.setRoyalBolocador(rst.getDouble("ROYAL_BOLOCADOR"));
				pModel.setRoyalBolocatario(rst.getDouble("ROYAL_BOLOCATARIO"));
				pModel.setRoyalVendasAcessorio(rst
						.getDouble("ROYAL_VENDAS_ACESSORIO"));
				pModel.setRoyalVendasEquipamen(rst
						.getDouble("ROYAL_VENDAS_EQUIPAMENTOS"));
				pModel.setRoyalManutencao(rst.getDouble("ROYAL_MANUTENCAO"));
				pModel.setRoyalDescontoctrence(rst
						.getDouble("ROYAL_DESCONTOCTRENCER"));
				pModel.setRoayltiesTotal(rst.getDouble("ROAYLTIES_TOTAL"));

				pModel.setTotalReinvestimento(rst
						.getDouble("TOTAL_REINVESTIMENTO"));
				pModel.setTotalRecebimento(rst.getDouble("TOTAL_RECEBIMENTO"));
				pModel.setTotalDespesas(rst.getDouble("TOTAL_DESPESAS"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Util.close(rst, pstmt, connection);

			rst = null;
			pstmt = null;
			connection = null;
		}

	}

	@Override
	public GerencialDiario getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GerencialDiario> getAll(String pCondicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(GerencialDiario pModel) {

		Connection connection;
		PreparedStatement pstmt;
		pstmt = null;
		connection = null;
		boolean resultado = false;

		try {

			// connection = ConnectionFactory.getInstance().getConnection();
			connection = ConnectionFactory.getPoolConnection();
			StringBuilder sql = new StringBuilder();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

			sql.append("update or insert into TB_GERENCIAL_DIARIO ");
			sql.append("( IDLOJA, DT_ANALISE, TOT_CTR_REALIZADOS, TOT_CTR_ENVOLVIDOS,");
			sql.append("TOT_CTR_CANCELADOS, TOT_CR_CANCELADAS, DIAS_TRABALHADOS, MEDIA_CONTRATOS,");
			sql.append("TICKET_MEDIO, CLIENTES, CLIENTES_NOVOS, CLIENTES_ATIVO, TICKET_MEDIO_FUN,");
			sql.append("QTDE_FUN, MESA_TOT_CTR_REALIZADOS, MESA_TOT_CTR_ENVOLVIDOS,");
			sql.append("MESA_TOT_CTR_CANCELADOS, MESA_TOT_CR_CANCELADAS, MESA_DIAS_TRABALHADOS,");
			sql.append("MESA_MEDIA_CONTRATOS, MESA_TICKET_MEDIO, MESA_CLIENTES, MESA_CLIENTES_NOVOS,");
			sql.append("MESA_CLIENTES_ATIVO, MESA_TICKET_MEDIO_FUN, MESA_QTDE_FUNC,");
			sql.append("ANOA_TOT_CTR_REALIZADOS, ANOA_TOT_CTR_ENVOLVIDOS, ANOA_TOT_CTR_CANCELADOS,");
			sql.append("ANOA_TOT_CR_CANCELADAS, ANOA_DIAS_TRABALHADOS, ANOA_MEDIA_CONTRATOS,");
			sql.append("ANOA_TICKET_MEDIO, ANOA_CLIENTES, ANOA_CLIENTES_NOVOS, ANOA_CLIENTES_ATIVO,");
			sql.append("ANOA_TICKET_MEDIO_FUN, FATURAMENTO_FUN, MESA_FATURAMENTO_FUN,");
			sql.append("ANOA_FATURAMENTO_FUN, ANOA_QTDE_FUNC, INVESTIMENTOS,");
			sql.append("INVESTIMENTOS_CUSTOATUAL, EQUIP_PERDIDOS, EQUIP_PERDIDOS_CUSTOATUAL,");
			sql.append("INVENTARIO, INVENTARIO_CUSTOATUAL, LOCACOES, ADICIONAL, BOLOCADOR,");
			sql.append("BOLOCATARIO, VENDAS_ACESSORIO, VENDAS_EQUIPAMENTOS, MANUTENCAO,");
			sql.append("BOLOCADOR_TOT, BOLOCATARIO_TOT, DESCONTOCTRENCER, ROYAL_LOCACOES,");
			sql.append("ROYAL_ADICIONAL, ROYAL_BOLOCADOR, ROYAL_BOLOCATARIO, ROYAL_VENDAS_ACESSORIO,");
			sql.append("ROYAL_VENDAS_EQUIPAMENTOS, ROYAL_MANUTENCAO, ROYAL_DESCONTOCTRENCER,");
			sql.append("FATURAMENTO_TOTAL, ROAYLTIES_TOTAL, TOTAL_REINVESTIMENTO, TOTAL_RECEBIMENTO,");
			sql.append("TOTAL_DESPESAS, FINAN_EQUIPTOS, FINAN_UTENSILIOS, DEV_APORTE_CAPITAL,");
			sql.append("DEV_EMPRESTIMOS, CP_A_VENCER, CP_ATRASO_30, CP_ATRASO_60, CP_ATRASO_90,");
			sql.append("CP_ATRASO_MAIS_90, CR_POT_EMITIR, CR_EMITIDAS, CR_A_EMITIR,");
			sql.append("CR_INADIMP_91_120, FUNDO_PERD_ACM, CTR_ZERADOS_DEV, MESA_CTR_ZERADOS_DEV,");
			sql.append("ANOA_CTR_ZERADOS_DEV) ");
			sql.append(" values ( ?, ?, ? , ? , ? , ? ,");
			sql.append("  ?  , ? , ? , ? ,?  , ? , ? , ? ,");
			sql.append("  ?  , ? , ?  , ? , ?  , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ?  , ? , ?  , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? ,  ?  , ? ,");
			sql.append("  ?  , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? ,");
			sql.append("  ?  , ? , ? , ? ,  ?  , ? , ? , ? ,");
			sql.append("  ?  , ? , ? , ?  , ? , ? )");
			sql.append(" matching (IDLOJA, DT_ANALISE)");

			pstmt = connection.prepareStatement(sql.toString());

			pstmt.setDouble(1, pModel.getIdloja());
			pstmt.setString(2, sd.format(pModel.getDtAnalise()));

			pstmt.setDouble(3, pModel.getTotCtrRealizados());

			pstmt.setDouble(4, pModel.getTotCtrEnvolvidos());

			pstmt.setDouble(5, pModel.getTotCtrCancelados());

			pstmt.setDouble(6, pModel.getTotCrCanceladas());

			pstmt.setDouble(7, pModel.getMesaDiasTrabalhados());

			pstmt.setDouble(8, pModel.getMediaContratos());

			pstmt.setDouble(9, pModel.getTicketMedio());

			pstmt.setDouble(10, pModel.getClientes());

			pstmt.setDouble(11, pModel.getClientesNovos());

			pstmt.setDouble(12, pModel.getClientesAtivo());

			pstmt.setDouble(13, pModel.getTicketMedioFunc());

			pstmt.setDouble(14, pModel.getQtdeFunc());

			pstmt.setDouble(15, pModel.getMesaTotCtrRealizados());

			pstmt.setDouble(16, pModel.getMesaTotCtrEnvolvidos());

			pstmt.setDouble(17, pModel.getMesaTotCtrCancelados());

			pstmt.setDouble(18, pModel.getMesaTotCrCanceladas());

			pstmt.setDouble(19, pModel.getMesaDiasTrabalhados());

			pstmt.setDouble(20, pModel.getMesaMediaContratos());

			pstmt.setDouble(21, pModel.getMesaTicketMedio());

			pstmt.setDouble(22, pModel.getMesaClientes());

			pstmt.setDouble(23, pModel.getMesaClientesNovos());

			pstmt.setDouble(24, pModel.getMesaClientesAtivo());

			pstmt.setDouble(25, pModel.getMesaTicketMedioFunc());

			pstmt.setDouble(26, pModel.getMesaQtdeFunc());

			pstmt.setDouble(27, pModel.getAnoaTotCtrRealizados());

			pstmt.setDouble(28, pModel.getAnoaTotCtrEnvolvidos());

			pstmt.setDouble(29, pModel.getAnoaTotCtrCancelados());

			pstmt.setDouble(30, pModel.getAnoaTotCrCanceladas());

			pstmt.setDouble(31, pModel.getAnoaDiasTrabalhados());

			pstmt.setDouble(32, pModel.getAnoaMediaContratos());

			pstmt.setDouble(33, pModel.getAnoaTicketMedio());

			pstmt.setDouble(34, pModel.getAnoaClientes());

			pstmt.setDouble(35, pModel.getAnoaClientesNovos());

			pstmt.setDouble(36, pModel.getAnoaClientesAtivo());

			pstmt.setDouble(37, pModel.getAnoaTicketMedioFunc());

			pstmt.setDouble(38, pModel.getFaturamentoFunc());

			pstmt.setDouble(39, pModel.getMesaFaturamentoFunc());

			pstmt.setDouble(40, pModel.getAnoaFaturamentoFunc());

			pstmt.setDouble(41, pModel.getAnoaQtdeFunc());

			pstmt.setDouble(42, pModel.getInvestimentos());

			pstmt.setDouble(43, pModel.getInvestimentosCustoat());

			pstmt.setDouble(44, pModel.getEquipPerdidos());

			pstmt.setDouble(45, pModel.getEquipPerdidosCustoat());

			pstmt.setDouble(46, pModel.getInventario());

			pstmt.setDouble(47, pModel.getInventarioCustoatual());

			pstmt.setDouble(48, pModel.getLocacoes());

			pstmt.setDouble(49, pModel.getAdicional());

			pstmt.setDouble(50, pModel.getBolocador());

			pstmt.setDouble(51, pModel.getBolocatario());

			pstmt.setDouble(52, pModel.getVendasAcessorio());

			pstmt.setDouble(53, pModel.getVendasEquipamentos());

			pstmt.setDouble(54, pModel.getManutencao());

			pstmt.setDouble(55, pModel.getBolocadorTot());

			pstmt.setDouble(56, pModel.getBolocatarioTot());

			pstmt.setDouble(57, pModel.getDescontoctrencer());

			pstmt.setDouble(58, pModel.getRoyalLocacoes());

			pstmt.setDouble(59, pModel.getRoyalAdicional());

			pstmt.setDouble(60, pModel.getRoyalBolocador());

			pstmt.setDouble(61, pModel.getRoyalBolocatario());

			pstmt.setDouble(62, pModel.getRoyalVendasAcessorio());

			pstmt.setDouble(63, pModel.getRoyalVendasEquipamen());

			pstmt.setDouble(64, pModel.getRoyalManutencao());

			pstmt.setDouble(65, pModel.getRoyalDescontoctrence());

			pstmt.setDouble(66, pModel.getFaturamentoTotal());

			pstmt.setDouble(67, pModel.getRoayltiesTotal());

			pstmt.setDouble(68, pModel.getTotalReinvestimento());

			pstmt.setDouble(69, pModel.getTotalRecebimento());

			pstmt.setDouble(70, pModel.getTotalDespesas());

			pstmt.setDouble(71, pModel.getFinanEquiptos());

			pstmt.setDouble(72, pModel.getFinanUtensilios());

			pstmt.setDouble(73, pModel.getDevAporteCapital());

			pstmt.setDouble(74, pModel.getDevEmprestimos());

			pstmt.setDouble(75, pModel.getCpAVencer());

			pstmt.setDouble(76, pModel.getCpAtraso30());

			pstmt.setDouble(77, pModel.getCpAtraso60());

			pstmt.setDouble(78, pModel.getCpAtraso90());

			pstmt.setDouble(79, pModel.getCpAtrasoMais90());

			pstmt.setDouble(80, pModel.getCrPotEmitir());

			pstmt.setDouble(81, pModel.getCrEmitidas());

			pstmt.setDouble(82, pModel.getCrAEmitir());

			pstmt.setDouble(83, pModel.getCrInadimp91120());

			pstmt.setDouble(84, pModel.getFuncdoPerdAcm());

			pstmt.setDouble(85, pModel.getCtrZeradosDev());

			pstmt.setDouble(86, pModel.getMesaCtrZeradosDev());

			pstmt.setDouble(87, pModel.getAnoaCtrZeradosDev());

			pstmt.executeUpdate();
			resultado = true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			Util.close(pstmt, connection);

			pstmt = null;
			connection = null;
		}

		return resultado;

	}

	@Override
	public boolean delete(GerencialDiario pModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(GerencialDiario pModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
