package com.vitorcamara.projetos;

import java.util.Scanner;

public class Multiplo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do index " + i + ":");
			vetorA[i] = scan.nextInt();
		}

		int soma = 0;
		int qtdMult = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 5 == 0) {
				qtdMult++;
				System.out.println("Múltiplo de 5 encontrado: " + vetorA[i]);
				soma += vetorA[i];

			}

		}

		System.out.println("\nSoma dos múltiplos de 5 = " + soma);

	}

}
