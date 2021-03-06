package br.com.formattanegocios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.formattanegocios.jdbc.ConnectionFactory;
import br.com.formattanegocios.model.Loja;
import br.com.formattanegocios.util.Util;

public class LojaDao implements IDao<Loja> {

	@Override
	public Loja getById(int id) {

		Loja loja = null;

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;

		try {

			connection = ConnectionFactory.getPoolConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM TB_LOJA WHERE ");
			sql.append(" ID = '" + id + "'");
			pstmt = connection.prepareStatement(sql.toString());
			rst = pstmt.executeQuery();

			if (rst.next()) {
				loja = new Loja();
				loja.setCodLoja(rst.getString("codloja"));
				loja.setDescricao(rst.getString("descricao"));
				loja.setApelido(rst.getString("apellido"));
				loja.setCnpj(rst.getString("cnpj"));
				loja.setId(rst.getInt("id"));
				loja.setTelefone(rst.getString("fone"));
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

		return loja;
	}

	@Override
	public List<Loja> getAll(String pCondicao) {
		ArrayList<Loja> lista = new ArrayList<Loja>();
		Connection connection;
		PreparedStatement pstmt;
		ResultSet rst;

		rst = null;
		pstmt = null;
		connection = null;

		try {

			connection = ConnectionFactory.getPoolConnection();

			StringBuilder sql = new StringBuilder();

			sql.append("select id, codloja, descricao, apellido, cnpj,'' fone  from tb_loja  order by apellido");

			if (pCondicao.compareTo("") > 0) {
				sql.append("Where " + pCondicao);
			}

			pstmt = connection.prepareStatement(sql.toString());

			rst = pstmt.executeQuery();

			while (rst.next() && rst.getRow() > 0) {

				Loja loja = new Loja();
				loja.setCodLoja(rst.getString("codloja"));
				loja.setDescricao(rst.getString("descricao"));
				loja.setApelido(rst.getString("apellido"));
				loja.setCnpj(rst.getString("cnpj"));
				loja.setId(rst.getInt("id"));
				loja.setTelefone(rst.getString("fone"));
				loja.setSelecionada(true);

				lista.add(loja);
			}

			if (lista.size() == 0) {
				lista = null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rst.close();
				pstmt.close();
				connection.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			rst = null;
			pstmt = null;
			connection = null;
		}

		return lista;
	}

	@Override
	public boolean insert(Loja pModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Loja pModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Loja pModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
