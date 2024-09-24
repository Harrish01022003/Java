package week6;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("ID: "+id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID: " + id +" NAME: "+ name);
		
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("EMAIL: " + email +" PHONE NUMBER "+ phoneNumber);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(2036);
		obj.getStudentInfo(2036, "Harrish");
		obj.getStudentInfo("harrish@gmail.com", 7548886065l);
		
	}

}
