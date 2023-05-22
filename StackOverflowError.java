package exceptions;

public class StackOverflowError {
	
	public static void MethodA() {
		MethodB();
	}
	public static void MethodB() {
		MethodA();
	}
	
	public static void main(String[]args) {
		MethodA();
	}

}
