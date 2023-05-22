package exceptions;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			String[] name = { "Ram", "Ramesh", "Gobi" };
			System.out.println(name[4]);
		} catch (ArrayIndexOutOfBoundsException ra) {
			ra.printStackTrace();
		}
		System.out.println("Program ends");
	}

}
