package br.com.junior.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();

		System.out.println("Digite o primeiro valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("A Soma �: " + soma);
		System.out.println("A Subtra��o �: " + subtracao);
		System.out.println("A Multiplca��o �: " + multiplicacao);
		System.out.println("A Divis�o �: "  + divisao);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

}
