package reUsablePackage;

/**
 * @author saikiran.nataraja
 *
 */
public class Calculator {

	public Calculator() {
		System.out.println("Calculator instance is created");
	}

	/**
	 * Function to add the two double value numbers
	 * @param a
	 * @param b
	 * @returns addition of two numbers
	 */
	public double add(double a, double b) {
		return a + b;
	}

	/**
	 * Function to subtract the two numbers
	 * @param a
	 * @param b
	 * @returns subtraction of two numbers
	 */
	public double sub(double a, double b) {
		return a - b;
	}

	/**
	 * Function to divide two numbers
	 * @param a
	 * @param b
	 * @returns the double value of division of two numbers
	 */
	public double div(double a, double b) {
		return a / b;
	}

	/**
	 * Function to multiply two numbers
	 * @param a
	 * @param b
	 * @returns the Multiplication of two numbers
	 */
	public double mul(double a, double b) {
		return a * b;
	}

}
