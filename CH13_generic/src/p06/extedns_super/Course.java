package p06.extedns_super;

//person:일반인과정
//Worker:직장인 과정
//sudent:학생과정
//highsudent:고등학생 과정

public class Course<T> {
	
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {//수강생 이름, 수강생 인원
		this.name=name;
		students=(T[])new Object[capacity];//들어올 변수값의 크기인 배열을 students에 저장하겠다  
						//들어오는 클래스가 다 달라 오브젝트 타입으로 배열을 만들어야 함
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {//배열에 값을 넣는 메소드
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			//수강생 이름이 이미 들어가있으면 다음으로 스킵해라
			if(students[i]==null) {//이름이 없으면 변수값으로 넣어주라
				students[i]=t;
				break;
				
			}
				
			
		}
	}
	
	//1.new Person(t)로 변수값 넣기 2.각 클래스의 get메소드 name에 변수저장
	//3.넣은 변수가 add 메소드를 거쳐 값이 없다면null 변수 넣어주기 4.add를 거친 변수값이 getstudents배열 메소드에 저장됨 5.register메소드로 arrays배열 형태로 출력
	
	
}
