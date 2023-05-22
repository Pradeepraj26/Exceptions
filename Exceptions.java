package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		System.out.print("Program Starts"+" ");
		try {
			int a = 10;
		    int b= 0;
		    int c = a/b;
		    System.out.println(c);
		} 
		catch(ArithmeticException ge) {
			ge.printStackTrace(); // System.err.println(StackTrace());
		}
		System.out.println("Program Done");
	}



	}


