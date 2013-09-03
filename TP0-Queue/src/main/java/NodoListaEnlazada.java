package main.java;


public class NodoListaEnlazada<Tipo_E> {

	private Tipo_E dato;
	private NodoListaEnlazada<Tipo_E> nodoSiguiente = null;


	public NodoListaEnlazada(Tipo_E contenido) {
		this.dato = contenido;
	}


	public void cambiarDato(Tipo_E contenido) {
		this.dato = contenido;
	}


	public Tipo_E devolverDato() {
		return this.dato;
	}


	public void cambiarNodoSiguiente(NodoListaEnlazada<Tipo_E> nodo) {
		this.nodoSiguiente = nodo;
	}


	public NodoListaEnlazada<Tipo_E> devolverNodoSiguiente() {
		return this.nodoSiguiente;
	}


	public boolean tieneSiguiente() {
		return (this.nodoSiguiente != null);
	}

}
