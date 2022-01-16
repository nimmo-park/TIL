package main.resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSimple02 {

	private static final String REOURCES = "src/main/resources/price.txt";
	
	public static void main(final String... args)throws IOException{
		
		final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();
		
		//final String fileName = args[0];
		final Path path = Paths.get(REOURCES);
		final List<String> lines = Files.readAllLines(path);
		
		final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFromCSV(lines);
		System.out.println("The total for all transactions is"+calculatTotalAmount(bankTransactions));
		System.out.println("Transactions in January"+selectInMonth(bankTransactions,Month.JANUARY));
	}
	
	public static double calculatTotalAmount(final List<BankTransaction> bankTransactions) {
		double total = 0d;
		for(final BankTransaction bankTransaction:bankTransactions) {
			total += bankTransaction.getAmount();
		}
		return total;
	}
	
	public static List<BankTransaction> selectInMonth(final List<BankTransaction>bankTransactions,final Month month){
		final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
		for(final BankTransaction bankTransaction:bankTransactions) {
			if(bankTransaction.getDate().getMonth() == month) {
				bankTransactionsInMonth.add(bankTransaction);
				
			}
			
		}
		
		return bankTransactionsInMonth;
	}
}
