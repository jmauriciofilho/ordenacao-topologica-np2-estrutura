package ordenacaoTopologica;

import java.util.ArrayList;
import java.util.List;

public class Fila<E> {

	private List<E> fila = new ArrayList<>();

	public void insert(E e) {
		this.fila.add(e);
	}

	public E remove() {
		return this.fila.remove(0);
	}

	public E primeiroDaFila() {
		return this.fila.get(0);
	}

	public boolean vazia() {
		return this.fila.isEmpty();
	}
}