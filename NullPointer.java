package exceptions;

public class NullPointer {
	public static void main(String[] args) {
		System.out.println("Program Starts");

		try {
			String name = "raj";
			String name1 = null;
			String c = name.concat(name1);
			System.out.println(c);
		} catch (NullPointerException me) {
			me.printStackTrace();
		}
		System.out.println("Program Ends");

	}
}