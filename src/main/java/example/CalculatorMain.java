package example;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(System.out);
		CalculateAndPrint calculateAndPrint = new CalculateAndPrint(calculator);
		calculateAndPrint.run();

	}
}

class CalculateAndPrint {
	private final Calculator calculator;

	public CalculateAndPrint(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run() {
		calculator.add(5, 3);
	}
}
