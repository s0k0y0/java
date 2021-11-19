package polymorphism.p07;

public class ChildEx {

	public static void main(String[] args) {
		
		//1.자식클래스 객체 생성
		Child c=new Child();
		//c에는 주소값이 들어있고 주소값을 따라가면 힙영역에 클래스 객체가 있다.
		c.method1();
		c.method2();
		c.method3();
		
		//2.polymorphism:부모의 눈을 통해서 자식의 모든 변수나 메소드를 이용하겠다. 하지만 객체생성과 타입변환을 해야함(심지어 타입변환은 자식클래스를 사용할때 각각 해줘야 함;;)
		//형 변환의 이유는 부모는 자식의 매소드가 보이지 않기 때문에 부모가 자식의 메소드를 보기 위해 형변환을 함.
		Parent p1=c;
		p1.method1();
		p1.method2();
		((Child) p1).method3();//강제로 형변환 한 형태. casting의 이유는 child의 부모인 Parent만 형변환을 했다. 이때, Child의 메소드와 변수는 가져오지 않았다.그렇기에 강제적으로 casting하게 됨.
		
		Parent p2=c;
		//자식클래스변수=(자식클래스)부모클래스타입;
		Child c2=(Child)p2;//위의 method3을 강제변환하는 대신 p2 Parent 강제변환을 Child로 다시한번 형변환해줌
		c2.method1();
		c2.method2();
		c2.method3();
		
		
		System.out.println("-------------------");
		Child AAA=new Child();
		AAA.method2();
		AAA.method3();
		

	}

}
