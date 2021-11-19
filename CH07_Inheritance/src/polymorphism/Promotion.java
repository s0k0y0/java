package polymorphism;
//308
class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}

//파일 이름을 사용하려면 public 생성자이거나 main method가 존재해야함.
public class Promotion {
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		//A는 밑에 클래스들이 상속받기 때문에 A객체를 생성할 필요성 없음
		
		A a1=(A)b;
		//부모클래스로 자동 타입 변환. 상속 관계에서만 가능
		A a2=c;
		A a3=d;
		A a4=e;
		
		B b1=d;
		C c1=e;
		
		//상속이 아닌 동일 선상의 형제관계인 경우에도 타입변환 불가
		//B b3=e;
		
		
		
	}

}
