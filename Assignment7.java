package practice;

class Access {
	
	protected String detail(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println("FullName: " +fullName);
		return fullName;
	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Access access = new Access();
		access.detail("joshua", "rufus");
		access.detail("santhosh", "kumar");
	}
}
//OUTPUT
//FullName: joshuarufus
//FullName: santhoshkumar