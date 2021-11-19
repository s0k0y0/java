package p06.extedns_super;

import java.util.Arrays;

public class wildCardEx {

	public static void main(String[] args) {
		
		Course<Person> p=new Course<Person>("일반인과정", 5);
		p.add(new Person("홍길동"));//person클래스의 name에 변수값 넣어주기
		p.add(new worker("직상인"));
		
		Course<worker> w=new Course<worker>("worker",5);
		w.add(new worker("직장인"));//??나머지는 안됨. 데이터 타입이 안맞기 떄문
		
		Course<student> s=new Course<student>("student",5);
		
		Course<highstudent> h=new Course<highstudent>("high",5);
		
		registerCourse(h);
		registerCourse(s);
		registerCourse(w);
		registerCourse(p);
		
		registerCoursehigh(h);//extedns highstudents이므로 고등학생 배열만 출력가능
		
		
		
		
	}
	
	public static void registerCourse(Course<?> c) {
		//all course
		System.out.println(c.getName()+"수강생:"+Arrays.toString(c.getStudents()));
		//입력값을 배열에 넣는다??
	}
	
	public static void registerCourseStu(Course<? extends student> c) {
		//students course
		System.out.println(c.getName()+"수강생:"+Arrays.toString(c.getStudents()));
	}
	
	public static void registerCoursewor(Course<? extends worker> c) {
		//worker course
		System.out.println(c.getName()+"수강생:"+Arrays.toString(c.getStudents()));
	}
	
	public static void registerCoursehigh(Course<? extends highstudent> c) {
		//highstudent course
		System.out.println(c.getName()+"수강생:"+Arrays.toString(c.getStudents()));
	}
	
	

}
