package main.java;


public class NodoLista<Objeto> {

	private Objeto dato;
	private NodoLista<Objeto> nodoSiguiente;


	public NodoLista(Objeto objeto) {
		dato = objeto;
		nodoSiguiente = null;
	}


	public void cambiarDato(Objeto objeto) {
		dato = objeto;
	}

	
	public Objeto devolverDato() {
		return dato;
	}


	public void cambiarNodoSiguiente(NodoLista<Objeto> nodo) {
		nodoSiguiente = nodo;
	}


	public NodoLista<Objeto> devolverNodoSiguiente() {
		return nodoSiguiente;
	}


	public boolean tieneSiguiente() {
		return (nodoSiguiente != null);
	}

}
