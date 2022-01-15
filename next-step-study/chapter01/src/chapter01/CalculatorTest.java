package chapter01;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
	// 1. 테스트 코드 자동화
	// 2. 테스트 코드 중복제거
	
	private Calculator cal = new Calculator();
	
	@Before
	//Before 생성자를 사용하는 이유는 Calculator 상태 값이 변경되어 다음 테스트 메소드에 
	//영향을줄 수 있으므로 초기화를 진
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}
	
	@Test
	public void add() {
		//중복 제거로인한 제거
		//Calculator cal = new Calculator();
		//System.out.println(cal.add(6, 3));
		assertEquals(9,cal.add(6, 3));
		System.out.println("add");
	}
	
	@Test
	public void substract() {
		//중복 제거로인한 제거
		//Calculator cal = new Calculator();
		//System.out.println(cal.subtract(6, 3));
		assertEquals(3,cal.subtract(6, 3));
		System.out.println("subtract");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
	



}
