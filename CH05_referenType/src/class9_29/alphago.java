package class9_29;

public class alphago {
	int age;
	String name;
	
	//기본생성자
	public alphago() {
		
	}
	
	public alphago(String name) {//아무리봐도 타 클래스에서 리터럴값을 넣으려면 매개변수 써넣어야 함
		this.name=name;
	}//void는 return값이 없을때 쓴다. public은 어디서나 아무데서나 이 클래스의 public붙은 메소드에 접근 가능하다는 것으로 만약 public자리에 아무것도 없다면 그건 default가 생략된 것으로 default는 사용하는 클래스와 method클래스가 같은 패키지 내 있어야지만 method가 활용가능하다.
	
	public alphago(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//여기까지 overloading
	
	//메소드로 출력
	public void setName(String name) {//출력하기 전의 변수에 저장하도록 하는 메소드
		this.name=name;
	}
	
	public String getName() {//변수에 들어있는 값 입력해서 출력하는 메소드
		return name;
	}
	
	public void setage(int age) {//변수를 입력하기 위한 메소드
		this.age=age;
	}
	
	public int getAge() {//void없을 때 무조건 return 넣어야 함.출력을 위한 메소드!!!!!
		return age;
	}
	
	
	
}
