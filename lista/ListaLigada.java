package pota.lista;

public class ListaLigada {

	NoLigado inicio;
	NoLigado fim;

	public ListaLigada() {
	}

	public ListaLigada(int[] vetor) {
		this.adicionar(vetor);
	}

	public NoLigado adicionar(int valor) {
		return this.adicionar(new NoLigado(valor));
	}

	public NoLigado adicionar(NoLigado novoNo) {
		if (inicio == null) {
			inicio = novoNo;
			fim = novoNo;
		} else {
			fim.proximo = novoNo;
			fim = novoNo;
		}
		return novoNo;
	}

	public NoLigado adicionar(int[] vetor) {
		NoLigado no = null;
		for (int i = 0; i < vetor.length; i++) {
			no = this.adicionar(vetor[i]);
		}
		this.fim = no;
		return inicio;
	}

	public static NoLigado getMeio(NoLigado no) {
		if (no == null) {
			return no;
		}
		NoLigado n1 = no;
		NoLigado n2 = no;
		while (n2.proximo != null && n2.proximo.proximo != null) {
			n1 = n1.proximo;
			n2 = n2.proximo.proximo;
		}
		return n1;
	}

	public void print() {
		inicio.print();
	}

}
