package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int result=cal.add(10,20);
		assertEquals(30,result);
	}
	
	@Test
	public void testsubtract() {
		Calculator cal = new Calculator();
		int result=cal.subtract(10,20);
		assertEquals(-10,result);
	}
	
	@Test
	public void testmul() {
		Calculator cal = new Calculator();
		int result=cal.multiply(10,20);
		assertEquals(200,result);
	}
	
	@Test
	public void testdivide() {
		assertEquals(-10,Calculator.division(10, 5));
	}

}
