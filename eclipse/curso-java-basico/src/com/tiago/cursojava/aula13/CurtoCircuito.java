package com.tiago.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado01 = falso & verdadeiro;
		boolean resultado02 = falso && verdadeiro;
		System.out.println(resultado01);
		System.out.println(resultado02);
		/*O '&' age diferente do '&&'(curto circuito), porque o primeiro ele checa o segundo
		 * valor, mesmo sabendo que o resultado dará falso ou verdadeiro (como no exemplo acima,
		 * tendo um falso, o resultado dará falso). Já o segundo, ele vê o primeiro, se já dará
		 * falso ou verdadeiro, ele nem olha o segundo termo.*/
	}

}
