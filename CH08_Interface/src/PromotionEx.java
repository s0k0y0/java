interface Promotion {}

class B implements Promotion{}
class C implements Promotion{}
class D extends B{}
class E extends C{}

public class PromotionEx{//파일이름을 쓰려면 public이나 main method존재
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		//다형성의 자동 형변환
		Promotion a1=b;
		Promotion a2=c;
		Promotion a3=d;
		Promotion a4=e;
		
		
	}
}


