package main.java;

import java.lang.AssertionError;


public class ListaEnlazada<Tipo_E> {

	private NodoListaEnlazada<Tipo_E> primerNodo;


	public ListaEnlazada() {
		this.primerNodo = null;
	}


	public boolean estaVacia() {
		return (this.devolverTamanio() == 0);
	}


	public int devolverTamanio() {
		return this.devolverTamanio(0, this.primerNodo);
	}


	private int devolverTamanio(int tamanio, NodoListaEnlazada<Tipo_E> unNodo) {
		try { return this.devolverTamanio(tamanio+1, unNodo.devolverNodoSiguiente()); } catch (Exception e) { return tamanio; }
	}


	public void agregarAlFinal(Tipo_E dato) {
		this.agregarAlFinal( new NodoListaEnlazada<Tipo_E>(dato) );
	}


	private void agregarAlFinal(NodoListaEnlazada<Tipo_E> nodoNuevo ) {
		try {this.agregarAlFinal(nodoNuevo,this.primerNodo,this.primerNodo.devolverNodoSiguiente());} catch (Exception e) {this.primerNodo = nodoNuevo;}
	}


	private void agregarAlFinal(NodoListaEnlazada<Tipo_E> nodoNuevo, NodoListaEnlazada<Tipo_E> nodoAnterior, NodoListaEnlazada<Tipo_E> nodoActual) {
		try {this.agregarAlFinal(nodoNuevo,nodoActual,nodoActual.devolverNodoSiguiente());} catch (Exception e) {nodoAnterior.cambiarNodoSiguiente(nodoNuevo);}
	}


	public void borrarPrimerElemento() throws AssertionError {
		try { this.primerNodo = this.primerNodo.devolverNodoSiguiente(); } catch (Exception e) { throw new AssertionError("No hay elementos"); }
	}


	public Tipo_E devolverPrimerElemento() throws AssertionError {
		try { return this.primerNodo.devolverDato(); } catch (Exception e) { throw new AssertionError("No hay elementos"); }
	}

}
