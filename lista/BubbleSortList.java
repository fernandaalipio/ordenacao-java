package pota.lista;

import java.util.Arrays;

import pota.Dados;

public class BubbleSortList {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		ListaLigada ll = new ListaLigada(vetor);

		long startTime = System.nanoTime();
		bubbleSortList(ll);

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execution time in nanoseconds  : " + timeElapsed);

		System.out.println("Vetor final: ");
		ll.print();

	}

	public static void main(String[] args) {
		Dados d = Dados.getInstance();
		calcular(d.getV1());
//        calcular(d.getV2());
//        calcular(d.getV3());
//        calcular(d.getV4());
	}

	public static void bubbleSortList(int[] vetor) {
		ListaLigada ll = new ListaLigada(vetor);
		bubbleSortList(ll);
	}

	public static void bubbleSortList(ListaLigada ll) {
		NoLigado no = ll.inicio;
		NoLigado inicio = no;
		boolean alteracao = true;
		if (no != null && no.proximo != null) {
			while (alteracao) {
				NoLigado anterior = null;
				NoLigado atual = inicio;
				NoLigado proximo = atual.proximo;
				alteracao = false;
				while (atual.proximo != null) {
					if (atual.valor > proximo.valor) {
						if (inicio == atual) {
							inicio = proximo;
						} else {
							anterior.proximo = proximo;
						}
						atual.proximo = proximo.proximo;
						proximo.proximo = atual;
						alteracao = true;
						atual = proximo;
					}
					anterior = atual;
					atual = anterior.proximo;
					proximo = atual.proximo;
				}
			}
		}
		ll.inicio = inicio;
	}
}