package class9_29;

public class Person {
	String name;
	int age;
	
	public Person() {
		
	}//생성자, 생성자의 overloading에서는 void 붙여주면 안되는 것 같음. 근데 왜인지는 모름ㅠㅜ일단은 void를 붙이게 되면 생성자로 인식을 안하게 됨.
	//생성자:객체를 생성할 때, 홍길동 객체의 값을 필드에 있는 전역변수에 저장할 수 있게 해주는 것. 즉, 변수를 저장할 수 있도록 하는 메소드
	
	public Person(String name) {//setName과는 다르게 처음에 new로 인스턴스화할떄부터 값을 new와 함꼐 저장할 수 있다!
		this.name=name;
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}//생성자 오버로딩:동일한 메소드 이름으로 타입이나 매개변수의 수가 다른 것. 더 업그레이드 된것
	
	
	
	
	
	public void setAge(int age) {//나이값 세팅하는 메소드
		this.age=age;
	}
	
	public int getAge() {//나이값 출력하는 메소드
		return age;
	}
	
	public void setName(String name) {//이름 세팅하는 메소드. 이건 new로 instance화 할때 값을 저장할 수 없다. setName의 메소드를 부를때 그떄 괄호에 Name의 변수값을 넣어 저장시킬 수 있는 것이다.
		this.name=name;
	}
	
	public String getName() {//이름 출력하는 메소드
		return name;
	}
	
	//재정의:제조사에서 만든 toString=>현재 사용자 고쳐서 사용(toString:변수를 그대로 println하면 변수의 주소값이 아니라 변수가 가지고 있는 문자를 그대로 나타내주는 것)
	//즉, 주소값을 가지고 있는 참조변수를 쉽게 입력값을 나타낼려면 toString이 유용하다는 것.
	@Override
	public String toString() {
		return name+":"+age;
	}
	

}
