package pota.lista;

import java.util.Arrays;

import pota.Dados;

public class InsertionSortList {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		ListaLigada ll = new ListaLigada(vetor);

		long startTime = System.nanoTime();
		insertionSortList(ll);

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

	public static void insertionSortList(int[] vetor) {
		ListaLigada ll = new ListaLigada(vetor);
		insertionSortList(ll);
	}

	public static void insertionSortList(ListaLigada ll) {
		NoLigado novoInicio = null;
		NoLigado no = ll.inicio;
		while (no != null) {
			NoLigado proximo = no.proximo;
			NoLigado atual = no;
			if (novoInicio == null || novoInicio.valor >= atual.valor) {
				atual.proximo = novoInicio;
				novoInicio = atual;
			} else {
				NoLigado aux = novoInicio;
				while (aux.proximo != null && aux.proximo.valor < atual.valor) {
					aux = aux.proximo;
				}
				atual.proximo = aux.proximo;
				aux.proximo = atual;
			}
			no = proximo;
		}
		ll.inicio = novoInicio;
	}

}