package com.tiago.cursojava.atividades01;
import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		/*Atividades Referentes as aulas 11, 12 e 13*/
		
		Scanner scan = new Scanner(System.in);
		
		/*Questão 01
		System.out.println("Alo mundo");
		*/
		
		/*Questão 02
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		System.out.println("O número informado foi " + numero);
		*/
		
		/*Questão 03
		System.out.println("Digite dois números:");
		int numero01, numero02;
		numero01 = scan.nextInt();
		numero02 = scan.nextInt();
		System.out.println("A soma dos números digitados é " + (numero01+numero02));
		*/
		
		/*Questão 04
		System.out.println("Digite as quantros notas dos bimestres:");
		double nota01, nota02, nota03, nota04;
		nota01 = scan.nextDouble();
		nota02 = scan.nextDouble();
		nota03 = scan.nextDouble();
		nota04 = scan.nextDouble();
		System.out.println("A média das notas é " + (nota01+nota02+nota03+nota04)/4);
		*/
		
		/*Questão 05
		System.out.println("Digite a quantidade de metros:");
		double metros;
		metros = scan.nextDouble();
		System.out.println(metros + " metros dá " + (metros*100) + " centímetros");
		*/
		
		/*Questão 06
		System.out.println("Digite o raio do círculo:");
		double raio = scan.nextDouble();
		System.out.println("A área desse círculo é " + (3.14*(raio*raio)));
		*/
		
		/*Questão 07
		System.out.println("Digite o lado do quadrado:");
		double ladoQuadrado, area; 
		ladoQuadrado = scan.nextDouble();
		area = ladoQuadrado * ladoQuadrado;
		System.out.println("A área desse quadrado é " + area);
		System.out.println("E seu dobro é " + (area*area));
		*/
		
		/*Questão 08
		System.out.println("Digite quanto você recebe por hora:");
		double valorPorHora = scan.nextDouble();
		System.out.println("Agora, digite quantas horas você trabalhou:");
		int horasTrabalhadas = scan.nextInt();
		System.out.println("O seu salário deste mês será de R$ " + 
			(valorPorHora*horasTrabalhadas));
		*/
		
		/*Questão 09
		System.out.println("Digite a temperatura em Fahrenheit:");
		int fahrenheit, celsius;
		fahrenheit = scan.nextInt();
		celsius = (5 * (fahrenheit-32) / 9);
		System.out.println(fahrenheit + " em Fahrenheit equivale a " + celsius + " em Celsius");
		*/
		
		/*Questão 10
		System.out.println("Digite a temperatura em Celsius:");
		int fahrenheit, celsius;
		celsius = scan.nextInt();
		fahrenheit = celsius*(9/5) + 32;
		System.out.println(celsius + " em Celsius equivale a " + fahrenheit + " em Fahrenheit");
		*/
		
		/*Questão 11
		System.out.println("Digite dois números inteiros e um real:");
		int num01, num02;
		double num03;
		num01 = scan.nextInt();
		num02 = scan.nextInt();
		num03 = scan.nextDouble();
		System.out.println("O produto do dobro do primeiro com a metade do segundo é "
				+ ((num01*2) - (num02/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro é " 
				+ ((num01*3) + num03));
		System.out.println("O terceiro número elevado ao cubo é " 
				+ (num03 * num03 * num03));
		*/
		
		/*Questão 12
		System.out.println("Digite sua altura e direi seu peso ideal:");
		double altura = scan.nextDouble();
		System.out.println("Seu peso ideal é " + (72.7 * altura - 58));
		*/
		
		/*Questão 13
		System.out.println("Digite quanto você recebe por hora:");
		double valorPorHora, salarioBruto, salarioLiquido, inss, impostRenda, sindicato; 
		valorPorHora = scan.nextDouble();
		System.out.println("Agora, digite quantas horas você trabalhou neste mês:");
		int horasTrabalhadas = scan.nextInt();
		salarioBruto = valorPorHora*horasTrabalhadas;
		inss = salarioBruto * 0.08;
		impostRenda = salarioBruto * 0.11;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - (inss + impostRenda + sindicato);
		System.out.println("O seu salário deste mês será de R$ " + salarioLiquido);
		System.out.println();
		System.out.println("Sendo o seu salário bruto de R$" + salarioBruto);
		System.out.println("O desconto do INSS foi de R$" + inss);
		System.out.println("O desconto do Sindicato foi de R$" + sindicato);
		*/
		
		/*Questão 14*/
		System.out.println("Digite o tamanho do arquivo que será baixado (em MB) e a "
				+ "velocidade de um link da internet (em Mbps):");
		double tamanhoArquivo, velocidadeInternet, tempoDownload;
		tamanhoArquivo = scan.nextDouble();
		velocidadeInternet = scan.nextDouble();
		tempoDownload = ( (tamanhoArquivo/8) / velocidadeInternet) / 60;
		System.out.println("O tempo aproximado de download do arquivo é de "
				+ tempoDownload + " minutos");
		
	}
}
