package pota.lista;

import java.util.Arrays;

import pota.Dados;

public class SelectionSortList {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		ListaLigada ll = new ListaLigada(vetor);

		long startTime = System.nanoTime();
		selectionSortList(ll);

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execução em nanosegundos  : " + timeElapsed);

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

	public static void selectionSortList(int[] vetor) {
		ListaLigada ll = new ListaLigada(vetor);
		selectionSortList(ll);
	}

	// selection sort trocando os valores dos nós
	public static void selectionSortList(ListaLigada ll) {
		NoLigado no = ll.inicio;
		while (no != null) {
			NoLigado atual = no;
			NoLigado proximo = no.proximo;
			while (proximo != null) {
				if (atual.valor > proximo.valor) {
					atual = proximo;
				}
				proximo = proximo.proximo;
			}
			int aux = no.valor;
			no.valor = atual.valor;
			atual.valor = aux;
			no = no.proximo;
		}
	}

}