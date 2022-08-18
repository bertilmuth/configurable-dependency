package example;

public class Calculator {
	public Calculator(){
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
		System.out.println("The result is: " + result);
	}
}