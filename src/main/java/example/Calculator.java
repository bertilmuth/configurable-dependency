package example;


public class Calculator {
	private final Printer printer;

	public Calculator(Printer printer){
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