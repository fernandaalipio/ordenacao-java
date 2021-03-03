package pota;

import java.util.List;

import pota.lista.BubbleSortList;
import pota.lista.InsertionSortList;
import pota.lista.MergeSortList;
import pota.lista.SelectionSortList;
import pota.vetor.BubbleSortVetor;
import pota.vetor.InsertionSortVetor;
import pota.vetor.MergeSortVetor;
import pota.vetor.SelectionSortVetor;

public final class MainApp {

	static List listas;
	static int numeroDeListasParaExecucao = 40;

	public static void main(String[] args) {
		System.out.println("INICIANDO ALGORíTIMOS DE ORDENAÇÃO \n");
		listas = Dados.gerarValores();

		System.out.println("ALGORÍTIMOS BASEADOS EM VETOR \n");
		rodarBubbleSortVetor();
		rodarInsertionSortVetor();
		rodarSelectionSortVetor();
		rodarMergeSortVetor();

		System.out.println("ALGORÍTIMOS BASEADOS EM LISTA \n");
		rodarBubbleSortLista();
		rodarInsertionSortLista();
		rodarSelectionSortLista();
		rodarMergeSortLista();
	}

	private static void rodarBubbleSortVetor() {
		System.out.println("BUBBLE SORT VETOR");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			BubbleSortVetor.bubbleSortVector(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarInsertionSortVetor() {
		System.out.println("INSERTION SORT VETOR");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			InsertionSortVetor.insertionSortVector(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarSelectionSortVetor() {
		System.out.println("SELECTION SORT VETOR");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			SelectionSortVetor.selectionSortVetor(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarMergeSortVetor() {
		System.out.println("MERGE SORT VETOR");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			MergeSortVetor.mergeSortVetor(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarBubbleSortLista() {
		System.out.println("BUBBLE SORT LISTA");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			BubbleSortList.bubbleSortList(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarInsertionSortLista() {
		System.out.println("INSERTION SORT LISTA");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			InsertionSortList.insertionSortList(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarSelectionSortLista() {
		System.out.println("SELECTION SORT LISTA");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			SelectionSortList.selectionSortList(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}

	private static void rodarMergeSortLista() {
		System.out.println("MERGE SORT LISTA");
		long tempoTotal = 0;
		int qtd = 0;
		for (int j = 1; j <= numeroDeListasParaExecucao; j++) {
			int[] valores = (int[]) listas.get(j - 1);
			qtd = valores.length;
			long tempoInicial = System.nanoTime();
			MergeSortList.mergeSortList(valores);
			long tempoFinal = System.nanoTime();
			long tempoDeExecucao = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal + tempoDeExecucao;
			if (j == 10 || j == 20 || j == 30 || j == 40) {
				System.out.println("EXECUÇÃO MÉDIA [" + qtd + "]: " + tempoTotal / 10 + " ns");
				tempoTotal = 0;
			}
		}
		System.out.println("------------------------------------");
	}
}
