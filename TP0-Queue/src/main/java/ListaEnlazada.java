package main.java;

import java.lang.AssertionError;


public class ListaEnlazada<Objeto> {

	private NodoListaEnlazada<Objeto> primerNodo;
	private int tamanio;


	public ListaEnlazada() {
		this.primerNodo = null;
		this.tamanio = 0;
	}


	public boolean estaVacia() {
		return (this.tamanio == 0);
	}


	public int devolverTamanio() {
		return this.tamanio;
	}


	public void agregarAlPrincipio(Objeto dato) {
		NodoListaEnlazada<Objeto> nodoNuevo = new NodoListaEnlazada<Objeto>(dato);

		if (this.primerNodo == null) {
			this.primerNodo = nodoNuevo;
		}
		else {
			nodoNuevo.cambiarNodoSiguiente(this.primerNodo);
			this.primerNodo = nodoNuevo;
		}
		
		this.tamanio++;
	}


	public void agregarAlFinal(Objeto dato) {
		NodoListaEnlazada<Objeto> nodoNuevo = new NodoListaEnlazada<Objeto>(dato);

		if (this.primerNodo == null) {
			this.primerNodo = nodoNuevo;
		}
		else {
			NodoListaEnlazada<Objeto> nodoActual = this.primerNodo.devolverNodoSiguiente();
			NodoListaEnlazada<Objeto> nodoAnterior = this.primerNodo;
			
			while ( nodoActual != null ) {
				NodoListaEnlazada<Objeto> nodoSiguiente = nodoActual.devolverNodoSiguiente();
				nodoAnterior = nodoActual;
				nodoActual = nodoSiguiente;
			}
			
			nodoAnterior.cambiarNodoSiguiente( nodoNuevo );
		}
		
		this.tamanio++;
	}


	public void borrarPrimerElemento() throws AssertionError {
		if (this.primerNodo == null)
			throw new AssertionError("No hay elementos");
		NodoListaEnlazada<Objeto> nodoSiguiente = this.primerNodo.devolverNodoSiguiente();
		this.primerNodo = nodoSiguiente;
		this.tamanio--;
	}


	public Objeto devolverPrimerElemento() throws AssertionError {
		if (this.primerNodo == null)
			throw new AssertionError("No hay elementos");
		return this.primerNodo.devolverDato();
	}	


	public NodoListaEnlazada<Objeto> devolverPrimerNodo() {
		return this.primerNodo;
	}

}
