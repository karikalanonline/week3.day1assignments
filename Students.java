package week3.day1;

public class Students {
 
	public void getStudentInfo(String id) {            //id may be with alphanumeric that's what giving String as the datatype
		System.out.println("This is student ID");
	}
	
	public void getStudentInfo(String id, String name) {
		System.out.println("This is student ID and name");
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("This is student email and phone number");
	}
}
