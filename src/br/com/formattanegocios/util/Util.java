package br.com.formattanegocios.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {

	private static String pathApp;

	public static String getPathApp() {
		return pathApp;
	}

	public static void setPathApp(String pathApp) {
		Util.pathApp = pathApp;
	}

	public static String padL(String pTxt, int pQtde, char pChar) {
		return String.format("%1$" + pQtde + "s", pTxt).replace(' ', pChar);
	}

	public static String MD5(String pArg) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			BigInteger hash = new BigInteger(1, md.digest(pArg.getBytes()));
			return padL(hash.toString(16), 32, '0');
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			md = null;
		}
		return pArg;

	}

	public static void close(ResultSet rs, PreparedStatement statement,
			Connection connection) {
		try {
			if (rs != null)
				rs.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void close(ResultSet rs, PreparedStatement statement) {
		close(rs, statement, null);
	}

	public static void close(ResultSet rs) {
		close(rs, null, null);
	}

	public static void close(PreparedStatement statement) {
		close(null, statement, null);
	}

	public static void close(PreparedStatement statement, Connection connection) {
		close(null, statement, connection);
	}

	public static void close(Connection connection) {
		close(null, null, connection);
	}

}
