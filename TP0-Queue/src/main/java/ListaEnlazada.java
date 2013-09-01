package main.java;


public class ListaEnlazada<Objeto> {

	private NodoLista<Objeto> primerNodo;
//	private NodoLista<Objeto> ultimoNodo;
	private int tamanio;


	public ListaEnlazada() {
		primerNodo = null;
//		ultimoNodo = null;
		tamanio = 0;
	}


	public boolean estaVacia() {
		return (tamanio == 0);
	}


	public int devolverTamanio() {
		return tamanio;
	}


	public void agregar(Objeto dato) {

		NodoLista<Objeto> nodoNuevo = new NodoLista<Objeto>(dato);
		
		if (primerNodo == null) {
			primerNodo = nodoNuevo;
		}
		else {
			NodoLista<Objeto> nodoActual = primerNodo.devolverNodoSiguiente();
			NodoLista<Objeto> nodoAnterior = primerNodo;
			
			while ( nodoActual != null ) {
				NodoLista<Objeto> nodoSiguiente = nodoActual.devolverNodoSiguiente();
				nodoAnterior = nodoActual;
				nodoActual = nodoSiguiente;
			}
			
			nodoAnterior.cambiarNodoSiguiente( nodoNuevo );
		}
		
		tamanio++;
	}


	public void borrarPrimerElemento() {
		if (primerNodo != null) {
			NodoLista<Objeto> nodoSiguiente = primerNodo.devolverNodoSiguiente();
			primerNodo = nodoSiguiente;
			tamanio--;
		}
	}


	public Objeto devolverPrimerElemento() {
		return primerNodo.devolverDato();
	}	


	public NodoLista<Objeto> devolverPrimerNodo() {
		return primerNodo;
	}

}
