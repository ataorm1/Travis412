package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) throws ArithmeticException {
		try 
		{
			return a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by Zero! Exitting...");
			return -1;
		}
	}
}
