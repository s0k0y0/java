package p02.nested_class;

import p02.nested_class.A.C;

public class Amain {
	public static void main(String[] args) {
		
		A a=new A();//A안에 
		A.B b=a.new B();//A클래스 안에 있는 B클래스의 객체를 생성할때 (인스턴스 중첩클래스 객체생성)
		System.out.println(b.field1); //.점:안에 있다는 뜻
//		System.out.println(A.B.field2); static 붙어 있는 변수를 불어올때 클래스 직접 호출
		b.method1();
//		A.B.method2();
		
		A.C c=new A.C();//static이 붇은 중첩 클래스 객체 생성할떄
		System.out.println(c.field1); 
		System.out.println(A.C.field2);
		c.method1();
		A.C.method2();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//396
	void method1()
	
	
	
	
	
	
	
	
	
}
