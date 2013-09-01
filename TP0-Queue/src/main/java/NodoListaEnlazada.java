package main.java;


public class NodoListaEnlazada<Objeto> {

	private Objeto dato;
	private NodoListaEnlazada<Objeto> nodoSiguiente;


	public NodoListaEnlazada(Objeto objeto) {
		dato = objeto;
		nodoSiguiente = null;
	}


	public void cambiarDato(Objeto objeto) {
		dato = objeto;
	}

	
	public Objeto devolverDato() {
		return dato;
	}


	public void cambiarNodoSiguiente(NodoListaEnlazada<Objeto> nodo) {
		nodoSiguiente = nodo;
	}


	public NodoListaEnlazada<Objeto> devolverNodoSiguiente() {
		return nodoSiguiente;
	}


	public boolean tieneSiguiente() {
		return (nodoSiguiente != null);
	}

}
