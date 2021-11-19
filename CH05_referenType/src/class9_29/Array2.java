package class9_29;

public class Array2 {
	// filed,변수,전역변수
	int age;
	String name;

	// 생성자:객체생성시 초기값 저장용도, 클래스명과 동일하고 return이 없음
	public Array2() {
	}
	
	//public overloading:생성자가 여러개 있는 것.지금 위 아래 public이 두개 있는 것과 같이 위의 public을 변수를 넣어 업그레이드 함.
	
	//String name:파라미터 변수, 매개 변수, 지역변수. 지역변수는 해당 배열에서만 쓴다는 것
	public Array2(String name) {
		this.name=name;//다른 클래스에서 입력한 값을 this.name인 전역변수에 집어넣으라는 것
	}
	
	public int getAge(int age) {
		this.age=age;
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSome() {
		this.name=name;
		return name;
	}
	
	//public과 타 클래스에서 리터렁값을 넣었을 때 어디에 입력되는지 헷갈림
	
}

