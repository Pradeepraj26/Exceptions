package exceptions;

public class MailEligibility {

	public static void main(String[] args) throws MailException {
		
		String name = "ppradeepraj26@yahoo.com";
		if(name.contains("@gmail.com")) {
			System.out.println("This is correct Mail Id");
		}
		else {
			throw new MailException("Not a Correct Mail Id");
		}
		

	}

}
