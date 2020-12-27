package br.com.formattanegocios.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	private ConnectionFactory() {

	}

	public static Connection getPoolConnection() throws ClassNotFoundException {

		try {
			Context ctx = (Context) new InitialContext()
					.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("jdbc/FttWS");
			// log.info("Usando POOL");
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
