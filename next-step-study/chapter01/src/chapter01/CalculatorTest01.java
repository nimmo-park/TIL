package chapter01;

public class CalculatorTest01 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(9, 3));
		System.out.println(cal.subtract(9, 3));
		System.out.println(cal.multiply(9, 3));
		System.out.println(cal.divide(9, 3));
	}
}
