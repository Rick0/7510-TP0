package main.java;


public class ListaEnlazada<Objeto> {

	private NodoListaEnlazada<Objeto> primerNodo;
	private int tamanio;


	public ListaEnlazada() {
		primerNodo = null;
		tamanio = 0;
	}


	public boolean estaVacia() {
		return (tamanio == 0);
	}


	public int devolverTamanio() {
		return tamanio;
	}


	public void agregar(Objeto dato) {
		NodoListaEnlazada<Objeto> nodoNuevo = new NodoListaEnlazada<Objeto>(dato);
		
		if (primerNodo == null) {
			primerNodo = nodoNuevo;
		}
		else {
			NodoListaEnlazada<Objeto> nodoActual = primerNodo.devolverNodoSiguiente();
			NodoListaEnlazada<Objeto> nodoAnterior = primerNodo;
			
			while ( nodoActual != null ) {
				NodoListaEnlazada<Objeto> nodoSiguiente = nodoActual.devolverNodoSiguiente();
				nodoAnterior = nodoActual;
				nodoActual = nodoSiguiente;
			}
			
			nodoAnterior.cambiarNodoSiguiente( nodoNuevo );
		}
		
		tamanio++;
	}


	public void borrarPrimerElemento() {
		if (primerNodo != null) {
			NodoListaEnlazada<Objeto> nodoSiguiente = primerNodo.devolverNodoSiguiente();
			primerNodo = nodoSiguiente;
			tamanio--;
		}
	}


	public Objeto devolverPrimerElemento() {
		return primerNodo.devolverDato();
	}	


	public NodoListaEnlazada<Objeto> devolverPrimerNodo() {
		return primerNodo;
	}

}
