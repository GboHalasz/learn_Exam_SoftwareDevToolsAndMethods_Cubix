package hu.cubix.softdev.oc.exception;

public class DivisionByZeroException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionByZeroException(String message) {
		super(message);
	}
}