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
		lista.agregarAlFinal(elemento1);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento1);
	}
	
	
	@Test
	public void testAgregarVariosElementos() {
		lista.agregarAlFinal(elemento1);
		lista.agregarAlPrincipio(elemento2);
		lista.agregarAlFinal(elemento3);
		lista.agregarAlPrincipio(elemento4);
		lista.agregarAlFinal(elemento5);

		Assert.assertEquals(lista.devolverTamanio() , 5);
	}


	@Test
	public void testBorrarUnElemento() {
		lista.agregarAlFinal(elemento1);
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 0);
	}


	@Test
	public void testBorrarVariosElementosOrdenAscendente() {
		lista.agregarAlFinal(elemento1);
		lista.agregarAlFinal(elemento2);
		lista.agregarAlFinal(elemento3);
		lista.agregarAlFinal(elemento4);
		lista.agregarAlFinal(elemento5);
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 4);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento2);

		lista.borrarPrimerElemento();
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 2);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento4);
	}


	@Test
	public void testBorrarVariosElementosOrdenDescendente() {
		lista.agregarAlPrincipio(elemento1);
		lista.agregarAlPrincipio(elemento2);
		lista.agregarAlPrincipio(elemento3);
		lista.agregarAlPrincipio(elemento4);
		lista.agregarAlPrincipio(elemento5);
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 4);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento4);

		lista.borrarPrimerElemento();
		lista.borrarPrimerElemento();
		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.devolverTamanio() , 1);
		Assert.assertEquals(lista.devolverPrimerElemento() , elemento1);
	}


	@Test
	public void testEstaVacia() {
		Assert.assertEquals(lista.estaVacia() , true);

		lista.agregarAlFinal(elemento1);

		Assert.assertEquals(lista.estaVacia() , false);

		lista.borrarPrimerElemento();

		Assert.assertEquals(lista.estaVacia() , true);
	}


	@Test
	public void testBorrarUnElementoCuandoNoHay() {
		lista.agregarAlFinal(elemento1);
		lista.borrarPrimerElemento();
		
		try {
			lista.borrarPrimerElemento();
		}
		catch (AssertionError error) {
			System.out.println("-- No hay elementos en la lista para borrar --");
		}

		Assert.assertEquals(lista.devolverTamanio() , 0);
	}


	@Test
	public void testPedirUnElementoCuandoNoHay() {
		lista.agregarAlFinal(elemento1);
		lista.borrarPrimerElemento();
		
		Integer numero;
		try {
			numero = lista.devolverPrimerElemento();
		}
		catch (AssertionError error) {
			System.out.println("-- No hay elementos en la lista para devolver --");
		}

		Assert.assertEquals(lista.devolverTamanio() , 0);
	}

}
