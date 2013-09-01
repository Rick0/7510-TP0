package main.java;


public class Cola implements Queue {

	private ListaEnlazada<Object> lista;


	public Cola() {
		this.lista = new ListaEnlazada<Object>();
	}


	public boolean isEmpty() {
		return this.lista.estaVacia();
	}


	public int size() {
		return this.lista.devolverTamanio();
	}


	public void add(Object item) {
		this.lista.agregar(item);
	}


	public Object top() {
		return this.lista.devolverPrimerElemento();
	}


	public void remove() {
		this.lista.borrarPrimerElemento();
	}

}
