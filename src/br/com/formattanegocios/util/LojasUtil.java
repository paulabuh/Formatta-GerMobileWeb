package br.com.formattanegocios.util;

import java.util.List;

import br.com.formattanegocios.model.Loja;

public class LojasUtil {

	public static String lojasSelecionadas(List<Loja> pLojas) {
		StringBuilder txt = new StringBuilder();

		for (int i = 0; i < pLojas.size(); i++) {

			if (pLojas.get(i).isSelecionada()) {
				txt.append(pLojas.get(i).getId() + " ,");

			}

		}
		//retira a ultima virgula
		return txt.toString().substring(0, txt.length() - 1);
	}

}
