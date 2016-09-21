package br.com.mhc.estrutura;

public class Pilha<T> {
	
	private T[] pilha = (T[]) new Object[100];
	private int quantidadeElementos;
	
	
	public void push(T t) {
		this.pilha[this.quantidadeElementos] = t;
		this.quantidadeElementos++;
	}
	
	public void remove() {
		this.pilha[this.quantidadeElementos - 1] = null;
		this.quantidadeElementos--;
	}
	
	public T peek() {
		return this.pilha[this.quantidadeElementos - 1];
	}
	
	public T pop() {
		T t = this.pilha[this.quantidadeElementos - 1];
		remove();
		return t;
	}
	
	public int length() {
		return this.quantidadeElementos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder b = new StringBuilder();
		b.append("[");
		for (T t : this.pilha) {
			b.append(t);
			b.append(", ");
		}
		b.append("]");
		return b.toString();
	}

}
