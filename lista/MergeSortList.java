package pota.lista;

import java.util.Arrays;

import pota.Dados;

public class MergeSortList {

	private static void calcular(int[] vetor) {
		System.out.println("Vetor inicial: " + Arrays.toString(vetor));

		ListaLigada ll = new ListaLigada(vetor);
		long startTime = System.nanoTime();
		NoLigado no = mergeSortList(ll.inicio);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(vetor.length + " execution time in nanoseconds  : " + timeElapsed);
	}

	public static void main(String[] args) {
		System.out.println("merge sort lista");
		Dados d = Dados.getInstance();
		calcular(d.getV1());
		// calcular(d.getV2());
		// calcular(d.getV3());
		// calcular(d.getV4());
	}

	public static NoLigado mergeSortList(int[] vetor) {
		ListaLigada ll = new ListaLigada(vetor);
		return mergeSortList(ll.inicio);
	}

	public static NoLigado mergeSortList(NoLigado no) {
		// não há mais merges
		if (no == null || no.proximo == null) {
			return no;
		}

		NoLigado meio = ListaLigada.getMeio(no);
		NoLigado proximoDoMeio = meio.proximo;
		meio.proximo = null;

		// meio vetor 1 = mergeSort (A, p, q)
		NoLigado meioLista1 = mergeSortList(no);

		// meio vetor 2 = mergeSort (A, q+1, r)
		NoLigado meioLista2 = mergeSortList(proximoDoMeio);

		// intercala (A, p, q, r)
		return intercala(meioLista1, meioLista2);
	}

	public static NoLigado intercala(NoLigado meioLista1, NoLigado meioLista2) {
		// B[i] = vetaux1[i]
		NoLigado noOrdenado = null;
		if (meioLista1 == null) {
			return meioLista2;
		}

		if (meioLista2 == null) {
			return meioLista1;
		}

		if (meioLista1.valor <= meioLista2.valor) {
			noOrdenado = meioLista1;
			noOrdenado.proximo = intercala(meioLista1.proximo, meioLista2);
		} else {
			noOrdenado = meioLista2;
			noOrdenado.proximo = intercala(meioLista1, meioLista2.proximo);
		}
		return noOrdenado;
	}

}
