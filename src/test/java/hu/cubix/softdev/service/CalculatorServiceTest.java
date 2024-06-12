package hu.cubix.softdev.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import hu.cubix.softdev.oc.exception.DivisionByZeroException;
import hu.cubix.softdev.oc.service.CalculatorService;

class CalculatorServiceTest {

	private final CalculatorService calculatorService = new CalculatorService();

	@Test
	void testAddition() {
		assertEquals(5, calculatorService.calculate(2, 3, "add"));
	}

	@Test
	void testSubtraction() {
		assertEquals(1, calculatorService.calculate(3, 2, "subtract"));
	}

	@Test
	void testMultiplication() {
		assertEquals(6, calculatorService.calculate(2, 3, "multiply"));
	}

	@Test
	void testDivision() {
		assertEquals(2, calculatorService.calculate(6, 3, "divide"));
	}

	@Test
	void testDivisionByZero() {
		Exception exception = assertThrows(DivisionByZeroException.class, () -> {
			calculatorService.calculate(1, 0, "divide");
		});
		assertEquals("Nullával osztás nem megengedett", exception.getMessage());
	}

	@Test
	void testInvalidOperation() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculatorService.calculate(1, 1, "mod");
		});
		assertEquals("Invalid operation", exception.getMessage());
	}
}