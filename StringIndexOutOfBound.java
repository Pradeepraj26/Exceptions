package exceptions;

public class StringIndexOutOfBound {
	public static void main(String [] args) {
		System.out.println("Program Starts");
		
		try {
			String name = "Ramesh";
			System.out.println(name.charAt(9));
		}
		catch(StringIndexOutOfBoundsException pra){
			pra.printStackTrace();
		}
		System.out.println("Program Ends");
		
	}

}
