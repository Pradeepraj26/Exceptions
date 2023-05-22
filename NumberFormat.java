package exceptions;

public class NumberFormat {
	public static void main(String[]args) {
		System.out.println("Program Starts");
		try {
			String a = "Pradeep";
			int num = Integer.parseInt(a);
			System.out.println(num);
		}
		catch(NumberFormatException ge){
			ge.printStackTrace(); 
			
		}
		System.out.println("Program Done");
		
	}

}
