package p01.generic_no;

import java.util.ArrayList;

public class Person {

	private String app;
	
	public Person() {
		this("Phon class");//현재 클래스의 다른 생성자 호출하는 코드. app에 괄호 값을 넣는다
	}

	public Person(String app) {
		super();
		this.app = app;
	}
	
	@Override
	public String toString() {
		return app;
	}
	
	
	
	
}
