package com.mayab.calidad.unitTest;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import static org.hamcrest.Matchers.*;

@RunWith(Parameterized.class)
public class TestMultiplicacionParametrizada {
	
	@Parameters
	public static Iterable data() {
		return Arrays.asList(new Object[][] {
			{4,2,2},{9, 3, 3}, {100, 10, 10}, {0, 20, 0}
		});
	}
	
	private float num1;
	private float num2;
	private float result;
	
	public TestMultiplicacionParametrizada(float result, float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}

	
	@Test
	public void multiplicarTest() {
		Calculadora miCalculadora = new Calculadora();
		assertThat(result, is(miCalculadora.multiplicacion(num1, num2)));
	}

}
