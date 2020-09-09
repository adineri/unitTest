package com.mayab.calidad.unitTest;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCalculadora2 {
	
	static Calculadora miCalculadora;
	
	
	@BeforeClass
	public static void setup() {
		System.out.println("Before test --->");
		miCalculadora = new Calculadora();
	}
	
	
	@Test
	public void SumaPositivosTest() {
		float sumando1 = 4;
		float sumando2 = 4;
		float expectedResult = 8;
		float resultado = -1;
		resultado = miCalculadora.suma(sumando1, sumando2);
		assertEquals(expectedResult, resultado, 0);
	}

	@Test
	public void restaTest() {
		float num1 = 20;
		float num2 = 12;
		float expectedResult = 8;
		float result = -1;
		result = miCalculadora.resta(num1, num2);
		//assertEquals(expectedResult, result, 0);
		assertThat(result, is(expectedResult));
	}
	
	
	@Test
	public void sumaNegativos() {
		float num1 = -12;
		float num2 = -20;
		float expectedResult = -32;
		float result = 0;
		result = miCalculadora.suma(num1, num2);
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void restarCero() {
		float num1 = 20;
		float num2 = 0;
		float expectedResult = 20;
		float result = 0;
		result = miCalculadora.resta(num1, num2);
		assertThat(result, is(expectedResult));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void dividirEntreCero() {
		float num1 = 10;
		float num2 = 0;
		miCalculadora.division(num1, num2);
	}
	
	@After
	public void despues() {
		System.out.println("After test");
	}
	
	@AfterClass
	public static void fin() {
		System.out.println("Tests ended");
	}
}
