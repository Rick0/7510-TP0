package test.java;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import junit.framework.Assert;

import java.lang.Integer;
import main.java.*;


public class ListaEnlazadaTest {

	private ListaEnlazada<Integer> lista;
	private Integer elemento1;
	private Integer elemento2;
	private Integer elemento3;
	private Integer elemento4;
	private Integer elemento5;


	@Before
	public void setUp() {
		this.elemento1 = new Integer(425);
		this.elemento2 = new Integer(234);
		this.elemento3 = new Integer(542);
		this.elemento4 = new Integer(123);
		this.elemento5 = new Integer(325);
		this.lista = new ListaEnlazada<Integer>();
	}


	@After
	public void tearDown() {
		this.lista = new ListaEnlazada<Integer>();
	}


	@Test
	public void testAgregarUnElemento() {
		lista.agregar(elemento1);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento1);
	}
	
	
	@Test
	public void testAgregarVariosElementos() {
		lista.agregar(elemento1);
		lista.agregar(elemento2);
		lista.agregar(elemento3);
		lista.agregar(elemento4);
		lista.agregar(elemento5);

		Assert.assertEquals(lista.devolverTamanio() , 5);
	}


	@Test
	public void testBorrarUnElemento() {
		lista.agregar(elemento1);
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 0);
	}


	@Test
	public void testBorrarVariosElementos() {
		lista.agregar(elemento1);
		lista.agregar(elemento2);
		lista.agregar(elemento3);
		lista.agregar(elemento4);
		lista.agregar(elemento5);
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 4);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento2);

		lista.borrarPrimerElemento();
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 2);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento4);
	}


	@Test
	public void testEstaVacia() {
		Assert.assertEquals(lista.estaVacia() , true);

		lista.agregar(elemento1);

		Assert.assertEquals(lista.estaVacia() , false);

		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.estaVacia() , true);
	}

}