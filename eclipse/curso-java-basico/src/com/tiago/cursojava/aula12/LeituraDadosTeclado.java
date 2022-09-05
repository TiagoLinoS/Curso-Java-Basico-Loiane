package com.tiago.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		//Lendo uma linha inteira
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo é " + nomeCompleto);
	
		//Lendo apenas o primeiro conjuto de caracteres
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scanner.next();
		System.out.println("Seu primeiro nome é " + primeiroNome);
		
		//Lendo um int
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		System.out.println("Sua idade é " + idade);
		
		//Lendo um double
		System.out.println("Digite sua altura:");
		double altura = scanner.nextDouble();
		System.out.println("Sua idade é " + altura);
		*/
		//Lendo várias entradas
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinhos de estimação:");
		String primeiroNome = scanner.next();
		int idade = scanner.nextInt();
		int quantFilhos = scanner.nextInt();
		double altura = scanner.nextDouble();
		boolean temPet = scanner.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de Filhos: " + quantFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem Bichinhos de estimação? " + temPet);
				
	}

}
