package com.tiago.cursojava.aula11;

public class SequenciaEscape {

	public static void main(String[] args) {
		/*O que é esse 'Escape'?
		 * Ele é uns comando para colocarmos no output.
		 * Por exemplo, se tentarmos colocar uma saída como "Olá!", no modo tradicional,
		 * não mostraremos as aspas duplas, para isso temos que colocar uma barra invertida
		 * ficando: \"Olá!\"*/
		System.out.println(" \"Olá!\" ");
		System.out.print("Olá \n \r");
		
		/*LISTA DE ESPAPE:
		 * \t -> TAB
		 * \b -> backspace
		 * \n -> Nova linha
		 * \r -> Retorno de carro (volta para o início)
		 * \f -> anvanço de página
		 * \' -> aspas simples
		 * \" -> aspas duplas
		 * \\ -> barra invertida(/)*/
	}

}
