package p01.intefaces;
//클래스-설계도>추상 클래스-미완성 설계도>인터페이스-밑그림 설계

//interface:강제적이고 일반적이도록 하기 위한 method와 변수의 가이드라인. 다른 class 작성할때 기본이 되는 틀을 제공하면서, 다른 클래스사이의 중간매개 역할을 하는 일종의 추상 클래스
//-인터페이스는 객체 생성이 불가하다. 그렇기에 자식 클래스를 만들어서 객체를 생성해야 함
//-추상메소드를 사용한다
//-다중 상속


public interface interfaceEx1 {
	
	//1.상수--무조건 인터페이스에서 만든 변수는 절대 바꿀수 없다!
	int a=10;//앞에 static final가 숨어져 있음
	int b=20;
	
	//2.추상 메소드:interface에서는 일반 메소드를 사용할 수 없어 메소드의 가이드라인을 주는 건 변수와 method명으로 제한됨. 
	//메소드의 내용을 추가하려면 해당 인터페이스를 상속받아 자식클래스에서 method를 오버라이딩받아 내용추가가 가능함.
	//추상 메소드는 자식 클래스를 만들어서 반드시 자식 클래스에서 사용해야 하는 것 같음
	abstract void add();//abstract 생략가능
	
	//3.default method:method의 가이드라인을 주는 건데 추상과는 다르게 method를 써도 되고 안써도 되고 개발자 맘임
	default void add2() {
		System.out.println("default add2()");
	}
	
	//4.static method:자식 클래스고 자시고 절대로 method내용 바꿀 수 없고 모든걸 고대로 사용해라
	static void add3() {
		System.out.println("static add3");
	}
	
	
	
	
}
