package pota.vetor;

import java.util.*;

import pota.Dados;

public class BubbleSortVetor {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		long startTime = System.nanoTime();
		bubbleSortVector(vetor);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execultando em nanoseconds  : " + timeElapsed);

		System.out.println("Vetor final: " + Arrays.toString(vetor));
	}

	public static void main(String[] args) {
		System.out.println("bubble sort vetor");
		Dados d = Dados.getInstance();
		calcular(d.getV1());
		calcular(d.getV2());
		calcular(d.getV3());
		calcular(d.getV4());
	}

	// implementacao Vetor (vista em sala de aula)
	public static void bubbleSortVector(int[] vetor) {
		int n = vetor.length;
		boolean invertido = false;
		do {
			invertido = false;
			for (int i = 1; i <= n - 1; i++) {
				if (vetor[i - 1] > vetor[i]) {
					int aux = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = aux;
					invertido = true;
				}
			}
		} while (invertido == true);
	}
}
