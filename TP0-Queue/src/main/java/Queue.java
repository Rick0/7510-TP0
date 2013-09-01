package main.java;


interface Queue {

	boolean isEmpty();		// retornar si la pila esta vacia.

	int size();				// retornar el tamanio de la pila.

	void add(Object item);	// agregar un item.

	Object top();			// retornar el primer item, lanzar excepcion si esta vacio.

	void remove();			// remover  el primer item, lanzar excepcion si esta vacio.
}
