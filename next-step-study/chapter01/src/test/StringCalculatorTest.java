package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculator.StringCalculator;

public class StringCalculatorTest {

	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null() {
		assertEquals(0,cal.add(null));
		assertEquals(0,cal.add(""));
	}
	
	@Test
	public void add_number() {
		assertEquals(1,cal.add("1"));
	}
	
	@Test
	public void add_comma() {
		assertEquals(3,cal.add("1,2"));
	}
	
	@Test
	public void add_column_or() {
		assertEquals(6,cal.add("1,2:3"));
	}
	
}
