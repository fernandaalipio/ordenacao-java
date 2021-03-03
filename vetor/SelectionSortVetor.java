package pota.vetor;

import java.util.Arrays;

import pota.Dados;

public class SelectionSortVetor {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		long startTime = System.nanoTime();
		selectionSortVetor(vetor);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execution time in nanoseconds  : " + timeElapsed);

		System.out.println("Vetor final: " + Arrays.toString(vetor));
	}

	public static void main(String[] args) {
		System.out.println("selection sort vetor");
		Dados d = Dados.getInstance();
		calcular(d.getV1());
		// calcular(d.getV2());
		// calcular(d.getV3());
		// calcular(d.getV4());
	}

	// implementacao Vetor (vista em sala de aula)
	public static void selectionSortVetor(int vetor[]) {
		int minimo, temp;
		for (int i = 0; i < vetor.length - 1; i++) {
			minimo = i;
			for (int k = i + 1; k < vetor.length; k++) {
				if (vetor[k] < vetor[minimo]) {
					minimo = k;
				}
			}
			temp = vetor[i];
			vetor[i] = vetor[minimo];
			vetor[minimo] = temp;
		}
	}

}
