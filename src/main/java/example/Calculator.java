package example;

import java.io.PrintStream;

public class Calculator {
	private final PrintStream printer;

	public Calculator(PrintStream printer){
		this.printer = printer;
	}

	public long add(long one, long two) {
		long result = one + two;
		printResult(result);
		return result;
	}

	public long sub(long one, long two) {
		long result = one - two;
		printResult(result);
		return result;
	}

	private void printResult(long result) {
		printer.println("The result is: " + result);
	}
}