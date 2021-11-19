package p03.people;

public class Student extends people {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo=studentNo;
	}	
}
