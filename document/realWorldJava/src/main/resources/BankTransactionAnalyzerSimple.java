package main.resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {

	private static final String REOURCES = "src/main/resources/price.txt";
	
	public static void main(final String... args)throws IOException{
		//고려하지 않고 설계한경우
		//파일이 비어 있다면?
		//데이터에 문제가 있어서 금액을 파싱하지 못한다면?
		//행의 데이터가 완벽하지 않다면?
		
		final Path path = Paths.get(REOURCES);
		//final Path path = Paths.get(REOURCES+args[0]);
		final List<String> lines = Files.readAllLines(path);
		System.out.println(lines);
		double total = 0d;
		for(final String line:lines) {
			final String[] columns = line.split(",");
			final double amount = Double.parseDouble(columns[1]);
			total +=amount;
		}
		System.out.println("The total for all transactions is"+total);
		
		//두번째
		final Path path2 = Paths.get(REOURCES);
		//final Path path = Paths.get(REOURCES+args[0]);
		final List<String> lines2 = Files.readAllLines(path2);		
		double total2 = 0d;
		final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for(final String line2:lines2) {
			final String[] columns2 = line2.split(",");
			final LocalDate date = LocalDate.parse(columns2[0],DATE_PATTERN);
			if(date.getMonth() == Month.JANUARY) {
				final double amount2 = Double.parseDouble(columns2[1]);
				System.out.println("1월달금액표시"+amount2);
				total2 +=amount2;
			}
		}
		System.out.println("The total for all transactions is"+total2);
	}
}
