package exceptions;

public class Finally {
	public static void main(String[]args) {
		System.out.println("Programs Starts");
		try {
			String name = null;
			System.out.println(name.toLowerCase());
		}
		catch(NullPointerException mech) {
			mech.printStackTrace();
		}
		finally {
			System.out.println("Final Block Works");
		}
		System.out.println("ENds");
		
		
		
		
		
		
		
		System.out.println("Programs Starts");
		try {
			String name = null;
			System.out.println(name.toLowerCase());
		}
		catch(NumberFormatException raj) {
			raj.printStackTrace();
		}
		finally {
			System.out.println("Final Block Works");
		}
		System.out.println("ENds");
		
		
		
		
	}

}
