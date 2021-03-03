package pota.vetor;

import java.util.Arrays;

import pota.Dados;

public class MergeSortVetor {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		long startTime = System.nanoTime();
		mergeSortVetor(vetor);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execution time in nanoseconds  : " + timeElapsed);

		System.out.println("Vetor final: " + Arrays.toString(vetor));

	}

	public static void main(String[] args) {
		System.out.println("merge sort vetor");
		Dados d = Dados.getInstance();

		calcular(d.getV1());
		// calcular(d.getV2());
		// calcular(d.getV3());
		// calcular(d.getV4());
	}

	public static void mergeSortVetor(int vetor[]) {
		mergeSortVetor(vetor, 0, vetor.length - 1);
	}

	// implementacao Vetor (vista em sala de aula)
	public static void mergeSortVetor(int vetor[], int indiceInicial, int indiceFinal) {
		int meioVetor;
		if (indiceInicial < indiceFinal) {
			meioVetor = (indiceInicial + indiceFinal) / 2;
			mergeSortVetor(vetor, indiceInicial, meioVetor);
			mergeSortVetor(vetor, meioVetor + 1, indiceFinal);
			intercala(vetor, indiceInicial, meioVetor, indiceFinal);
		}
	}

	public static void intercala(int vetor[], int indiceInicial, int meioVetor, int indiceFinal) {
		int[] b = new int[vetor.length];

		for (int i = indiceInicial; i <= meioVetor; i++) {
			b[i] = vetor[i];
		}

		for (int j = meioVetor + 1; j <= indiceFinal; j++) {
			b[indiceFinal + meioVetor + 1 - j] = vetor[j];
		}

		int i = indiceInicial;
		int j = indiceFinal;

		for (int k = indiceInicial; k <= indiceFinal; k++) {
			if (b[i] <= b[j]) {
				vetor[k] = b[i];
				i = i + 1;
			} else {
				vetor[k] = b[j];
				j = j - 1;
			}
		}
	}

}
