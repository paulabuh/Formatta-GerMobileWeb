package br.com.formattanegocios.validacao;

import br.com.formattanegocios.util.Util;

public class VerificaAuth {
	private final static String key = "FTT1773";

	public static boolean isValid(String pAuth, String publicKey) {

		String md5 = Util.MD5(key + publicKey).toUpperCase();
		
		if (md5.compareTo(pAuth) == 0) {
			
			return true;
			
		} else {
			return false;
		}
	}

}
