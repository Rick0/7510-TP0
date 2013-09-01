package main.java;


public class NodoListaEnlazada<Objeto> {

	private Objeto dato;
	private NodoListaEnlazada<Objeto> nodoSiguiente;


	public NodoListaEnlazada(Objeto objeto) {
		this.dato = objeto;
		this.nodoSiguiente = null;
	}


	public void cambiarDato(Objeto objeto) {
		this.dato = objeto;
	}

	
	public Objeto devolverDato() {
		return this.dato;
	}


	public void cambiarNodoSiguiente(NodoListaEnlazada<Objeto> nodo) {
		this.nodoSiguiente = nodo;
	}


	public NodoListaEnlazada<Objeto> devolverNodoSiguiente() {
		return this.nodoSiguiente;
	}


	public boolean tieneSiguiente() {
		return (this.nodoSiguiente != null);
	}

}
