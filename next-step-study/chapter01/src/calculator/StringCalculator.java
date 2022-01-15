package calculator;

public class StringCalculator {

	public int add(String text) {
		
		if(text == null || text.isEmpty()) {
			return 0;
		}
		
		String[] values = text.split(",");
		return sum(toInts(values));
	}
	
	private int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i =0; i< values.length;i++) {
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}
	
	private int toPositive(String value) {
		int number = Integer.parseInt(value);
		if(number < 0 ) {
			throw new RuntimeException();
		}
		return number;
	}
	
	private int sum(int[] numbers) {
		int sum = 0 ;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
}

//		if(text.contains(",")) {
//			String[] values = text.split(",");
//			int sum = 0;
//			for(String value : values) {
//				sum += Integer.parseInt(value);
//			}
//			return sum;
//		}
		
//		if(text.contains(",")|| text.contains("|") || text.contains(":")) {
//			String[] values = text.split(",|:");
//			int sum = 0;
//			for(String value : values) {
//				sum += Integer.parseInt(value);
//			}
//			return sum;
//		}
//
//		return Integer.parseInt(text);
//	}

//}
