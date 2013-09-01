package main.java;

import java.lang.AssertionError;


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
		this.lista.agregarAlFinal(item);
	}


	public Object top() throws AssertionError {
		return this.lista.devolverPrimerElemento();
	}


	public void remove() throws AssertionError {
		this.lista.borrarPrimerElemento();
	}

}
