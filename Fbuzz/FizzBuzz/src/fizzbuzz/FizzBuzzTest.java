package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFizz() {
		String salida=Fizzbuzz.result(3);
		String expect="Fizz";
		assertEquals(expect,salida);
		
	}
	
	@Test
	public void testBuzz() {
		String salida=Fizzbuzz.result(5);
		String expect="Buzz";
		assertEquals(expect,salida);
	}
	
	@Test
	public void testFizzBuzz() {
		String salida=Fizzbuzz.result(15);
		String expect="FizzBuzz";
		assertEquals(expect,salida);
	}
	
	@Test
	public void testNone() {
		String salida=Fizzbuzz.result(0);
		String expect="0";
		assertEquals(expect,salida);
	}

}
