public class Student {
	String studentID;
	String firstName;
	String lastName;
	String[] courses;
	
	Student (String id, String first, String last, String[] list) {
		studentID = id;
		firstName = first;
		lastName = last;
		courses = list;
	}
	
	double getGPA() {
		return 4.0;
	}
}