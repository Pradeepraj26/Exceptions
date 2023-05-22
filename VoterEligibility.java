package exceptions;

public class VoterEligibility {
	public static void main(String[] args) throws AgeException {
		int age = 15;
		if (age >= 18) {
			System.out.println("Eligible To Vote");
		} else {
			throw new AgeException("Age is not eligible");
		}
	}

}
