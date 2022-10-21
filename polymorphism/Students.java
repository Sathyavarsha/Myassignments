package polymorphism;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo( String phoneNumber,String emailId) {
		System.out.println("Student emailId: "+emailId);
		System.out.println("Student phoneNumber: "+phoneNumber);	
	}
		
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(2014);
		s.getStudentInfo(2014, "sathya");
		s.getStudentInfo("8015350921", "sathya@gmail.com");
	}

}
