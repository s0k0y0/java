package p07.constructor;

class Car {
	String name;
	int a;
	String color;
	
	//this:현재 클래스에 있는 요소를 직접 지정해서 불러오도록 함
	//this():안에 변수의 수에 따라 자신의 클래스에 있는 생성자 메소드 자체를 불러옴
	//super:this와 동일. 직접 지정
	//super():타 클래스에 있는 생성자 메소드 중에 선택해서 메소드 자체를 호출
	public Car() {
		System.out.println("constructor");
	}
	
	public Car(int a, String name) {
		this.a=a;//객체생성할 때 집어넣은 값이 저장될려면 반드시 기입해야함
		this.name=name;
		System.out.println("parameter constructor");
	}
	
	public Car(int a, String name, String color) {
		this(a , name);//현재 클래스에 다른 생성자를 호출하도록하는 기능.기본 생성자 호출은 메소드에서 가장 먼저 기입해야함
		this.color=color;
		System.out.println("parameter constructor");
	}
	
	@Override //<재정의==기존 메소드 수정해서 재사용. 메소드의 이름을 바꾸면 더이상 오버라이딩이 아닌 새로운 메소드 생성으로 인식됨
	public String toString() {
		return "("+name+","+a+","+color+")" ;
	}
	
	@Override
	public boolean equals(Object obj) {//boolean type으로 출력값은 true나 false임
		return super.equals(obj);
	}//파라미터의 다형성:부모타입으로 모든 자식들의 변수를 파라미터에 첨부가능
	//다형성의 장점:메소드의 파라미터 타입을 부모타입으로 선언하면 자식들의 모든 변수를 쉽게 사용할 수 있음
	
	
}


public class Car_main{
	
	public static void main(String[] args) {
		
		
		
		//1.constructor을 사용한 데이터 저장
		Car we1=new Car();
		we1.a=10;
		we1.name="홍길동1";
		System.out.println(we1.a+","+we1.name);
		
		//2.파라미터가 있는 생성자를 사용한 데이터 저장
		Car we2=new Car(20,"홍길동2");
		System.out.println(we2.a);
		System.out.println(we2.toString());
		
		
		//3.파라미터 있는 생성자 데이터 저장(30,"홍길동3","노랑색")
		Car we3=new Car(20,"홍길동2","노랑색");
		System.out.println(we3.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}