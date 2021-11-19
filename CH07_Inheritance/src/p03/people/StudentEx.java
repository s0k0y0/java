package p03.people;

public class StudentEx {

	public static void main(String[] args) {
		Student s= new Student("홍길동","123456-1234567",1);//생성자 메소드로 인해 반드시 객체 생성과 함께 입력값을 넣어줘야 함
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
	}

}
