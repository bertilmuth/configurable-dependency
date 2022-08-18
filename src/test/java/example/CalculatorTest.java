package example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {
	private Calculator calculator;

	@BeforeEach
	void setup() {
		calculator = new Calculator();
	}

	@Test
	void addsToNumbers() {
		long result = calculator.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	void subtractsToNumbers() {
		long result = calculator.sub(5, 1);
		assertEquals(4, result);
	}
} 