package pota.vetor;

import java.util.Arrays;

import pota.Dados;

public class InsertionSortVetor {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		long startTime = System.nanoTime();
		insertionSortVector(vetor);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " Execultando em nanosegundos  : " + timeElapsed);

		System.out.println("Vetor final: " + Arrays.toString(vetor));
	}

	public static void main(String[] args) {
		System.out.println("insertion sort vetor");
		Dados d = Dados.getInstance();
		calcular(d.getV1());
		calcular(d.getV2());
		calcular(d.getV3());
		calcular(d.getV4());
	}

	// implementacao Vetor (vista em sala de aula)
	public static void insertionSortVector(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i <= n - 1; i++) {
			int j = i;
			while (j > 0 && vetor[j - 1] > vetor[j]) {
				int aux = vetor[j];
				vetor[j] = vetor[j - 1];
				vetor[j - 1] = aux;
				j = j - 1;
			}
		}
	}

}
