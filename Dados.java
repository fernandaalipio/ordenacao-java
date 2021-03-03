package pota;

import java.util.ArrayList;
import java.util.List;

public final class Dados {

	private static Dados instance;

	private int v1[] = new int[100];
	private int v2[] = new int[1000];
	private int v3[] = new int[10000];
	private int v4[] = new int[100000];

	public static int[] quantidades = new int[] { 100, 1000, 10000, 100000 };

	public static List gerarValores() {
		List listas = new ArrayList(40);
		for (int i = 0; i < quantidades.length; i++) {

			for (int j = 0; j < 10; j++) {
				int[] valores = gerarValores(quantidades[i]);
				listas.add(valores);
			}

		}
		return listas;
	}

	public static int[] gerarValores(int valor) {
		int[] vetor = new int[valor];
		for (int i = 0; i < vetor.length; i++) {
			int rnd = (int) (1 + Math.random() * valor);
			vetor[i] = rnd; // atribui o valor a cada indice do vetor
		}
		return vetor;
	}

	private void calcular(int vetor[], int valor) {
		for (int i = 0; i < vetor.length; i++) {
			int rnd = (int) (1 + Math.random() * valor);
			vetor[i] = rnd; // atribui o valor a cada indice do vetor
		}
	}

	private Dados() {
		// gerar numeros
		calcular(v1, 100);
		calcular(v2, 1000);
		calcular(v3, 10000);
		calcular(v4, 100000);
	}

	public static Dados getInstance() {
		if (instance == null) {
			instance = new Dados();
		}
		return instance;
	}

	public int[] getV1() {
		return v1;
	}

	public int[] getV2() {
		return v2;
	}

	public int[] getV3() {
		return v3;
	}

	public int[] getV4() {
		return v4;
	}

	public void setV4(int[] v4) {
		this.v4 = v4;
	}

}
