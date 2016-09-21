package br.com.mhc.estrutura;

public class Fila<T> {
	
	private T[] fila = (T[]) new Object[100];
	private int quantidadeElementos = 0;
	
	public void push(T t) {
		this.fila[this.quantidadeElementos] = t;
		this.quantidadeElementos++;
	}
	
	public void remove() {
		for (int i = 0; i < this.quantidadeElementos; i++) {
			this.fila[i] = this.fila[i + 1];
		}
		this.quantidadeElementos--;
	}
	
	public T peek() {
		return this.fila[0];
	}
	
	public T pop() {
		T t = this.fila[0];
		remove();
		return t;
	}
	
	public int length() {
		return this.quantidadeElementos;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder b = new StringBuilder();
		b.append("[");
		for(T t : this.fila) {
			b.append(t);
			b.append(", ");
		}
		b.append("]");
		return b.toString();
	}

}
