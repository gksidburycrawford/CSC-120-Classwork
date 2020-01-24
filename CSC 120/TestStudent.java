public class TestStudent {
	public static void main(String[] args) {
		String[] classlist = {"CSC 151", "CSC 251", "CSC 284", "CIS 110"};
		Student s1 = new Student("0357036", "Adam", "Gaweda", classlist);
		Student s2 = new Student("8675309", "Tommy","Tutone", classlist);
		Student.out.println(s1.firstname + "'s GPA is " + getGPA());
	}
}