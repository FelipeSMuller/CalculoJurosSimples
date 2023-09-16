package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Double taxa;
		int J, valor, tempo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem vindo ao cálculo de Juros Simples!! ");
		System.out.println();

		System.out.println("Digite o valor que você tem : ");
		valor = sc.nextInt();

		System.out.println("Digite a taxa de juros em decimais : ");

		taxa = sc.nextDouble();

		System.out.println("Digite o tempo : ");
		tempo = sc.nextInt();

		J = (int) ((valor * taxa * tempo));

		System.out.println("O Calculo do juros simples e igual a = R$ " + J);

		sc.close();

	}

}
