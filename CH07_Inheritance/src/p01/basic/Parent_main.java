package p01.basic;

public class Parent_main {

	public static void main(String[] args) {
		
		//그냥 자식클래스 객체 생성
		ChildA a=new ChildA();
		System.out.println(a.ca);
		System.out.println(a.p);
		System.out.println(Parent.ps);
		System.out.println(ChildA.cas);
		a.work();
		a.ChildA();
		
		//부모의 눈으로 자식의 클래스 다형성 생성
		Parent p2=new ChildA();
		ChildA c2=(ChildA) p2;
		System.out.println(c2.ca);
		System.out.println(c2.p);
		System.out.println(Parent.ps);
		System.out.println(ChildA.cas);
		c2.work();
		c2.ChildA();
	
		
		//ChildB 그냥 ChildB만 객체 생성
		ChildB b=new ChildB();
		System.out.println(b.cb);
		System.out.println(b.p);
		System.out.println(Parent.ps);
		System.out.println(ChildB.cbs);
		b.work();
		b.ChildB();
		
		//parent 다형성으로 객체 생성
		Parent p1=new ChildB();
		ChildB c1=(ChildB) p1;
		System.out.println(c1.cb);
		System.out.println(c1.p);
		System.out.println(Parent.ps);
		System.out.println(ChildB.cbs);
		c1.work();
		c1.ChildB();
		
		

	}

}
