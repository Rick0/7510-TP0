package test.java;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import junit.framework.Assert;

import java.lang.Integer;
import main.java.*;


public class ColaTest {

	private Cola cola;
	private Integer elemento1;
	private Integer elemento2;
	private Integer elemento3;
	private Integer elemento4;
	private Integer elemento5;


	@Before
	public void setUp() {
		this.elemento1 = new Integer(111);
		this.elemento2 = new Integer(222);
		this.elemento3 = new Integer(333);
		this.elemento4 = new Integer(444);
		this.elemento5 = new Integer(555);
		this.cola = new Cola();
	}


	@After
	public void tearDown() {
		this.cola = new Cola();
	}


	@Test
	public void testAgregarUnElemento() {
		cola.add(elemento1);
		Assert.assertEquals(cola.top() , elemento1);
	}
	
	
	@Test
	public void testAgregarVariosElementos() {
		cola.add(elemento1);
		cola.add(elemento2);
		cola.add(elemento3);
		cola.add(elemento4);
		cola.add(elemento5);

		Assert.assertEquals(cola.size() , 5);
	}


	@Test
	public void testBorrarUnElemento() {
		cola.add(elemento1);
		cola.remove();

		Assert.assertEquals(cola.size() , 0);
	}


	@Test
	public void testBorrarVariosElementos() {
		cola.add(elemento1);
		cola.add(elemento2);
		cola.add(elemento3);
		cola.add(elemento4);
		cola.add(elemento5);
		cola.remove();

		Assert.assertEquals(cola.size() , 4);
		Assert.assertEquals(cola.top() , elemento2);

		cola.remove();
		cola.remove();

		Assert.assertEquals(cola.size() , 2);
		Assert.assertEquals(cola.top() , elemento4);
	}


	@Test
	public void testEstaVacia() {
		Assert.assertEquals(cola.isEmpty() , true);

		cola.add(elemento1);

		Assert.assertEquals(cola.isEmpty() , false);

		cola.remove();

		Assert.assertEquals(cola.isEmpty() , true);
	}


	@Test
	public void testBorrarUnElementoCuandoNoHay() {
		cola.add(elemento1);
		cola.remove();

		try {
			cola.remove();
		}
		catch (AssertionError error) {
			System.out.println("-- No hay elementos en la cola para borrar --");
		}

		Assert.assertEquals(cola.size() , 0);
	}


	@Test
	public void testMostrarUnElementoCuandoNoHay() {
		cola.add(elemento1);
		cola.remove();

		Integer unNumero;
		try {
			unNumero = (Integer)cola.top();
		}
		catch (AssertionError error) {
			System.out.println("-- No hay elementos en la cola para mostrar --");
		}

		Assert.assertEquals(cola.size() , 0);
	}

}
