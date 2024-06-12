package hu.cubix.softdev.oc.service;

import org.springframework.stereotype.Service;

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
			return num1 / num2;
		default:
			throw new IllegalArgumentException("Invalid operation");
		}
	}
}