package main.resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {

	private static final String REOURCES = "src/main/resources/price.txt";
	
	public void analyze(final String fileName,final BankStatementParser bankStatementParser) throws IOException{
	
		final Path path = Paths.get(REOURCES);
		final List<String> lines = Files.readAllLines(path);
		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
		collectSummary(bankStatementProcessor);
	}
	
	//private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
	
	public static void main(final String... args) throws IOException{
	
		//현재는 nullPointerException
		final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
		
		final BankStatementParser bankStatementParser = new BankStatementCSVParser();
		
		bankStatementAnalyzer.analyze(REOURCES, bankStatementParser);
		
		
	}
	
	private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
		System.out.println("The total for all trasactions is: "+bankStatementProcessor.calculateTotalAmount());
		System.out.println("The total for transactions in January is: "+bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
		System.out.println("The total for transactions in February is: "+bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
		System.out.println("The total salary receives is: "+bankStatementProcessor.calculateTotalForCategery("Salary"));
		
	}
}
