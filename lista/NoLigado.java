package pota.lista;

public class NoLigado {

	int valor;
	NoLigado proximo;

	public NoLigado() {
	}

	public NoLigado(int valor) {
		this.valor = valor;
	}

	public void print() {
		NoLigado no = this;
		while (no != null) {
			System.out.print(no.valor + " ");
			no = no.proximo;
		}
	}
}
