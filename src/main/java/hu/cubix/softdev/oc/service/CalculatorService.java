package hu.cubix.softdev.oc.service;

import org.springframework.stereotype.Service;

import hu.cubix.softdev.oc.exception.DivisionByZeroException;

@Service
public class CalculatorService {

	public double calculate(double num1, double num2, String operation) {
		switch (operation) {
		case "add":
			return num1 + num2;
		case "subtract":
			return num1 - num2;
		case "multiply":
			return num1 * num2;
		case "divide":
			if (num2 == 0) {
				throw new DivisionByZeroException("Nullával osztás nem megengedett");
			}
			return num1 / num2;
		default:
			throw new IllegalArgumentException("Invalid operation");
		}
	}
}