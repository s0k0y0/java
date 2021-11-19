package p11.finals;

class ClassA {

}

final class A extends ClassA {
	// final class는 상속을 할 수 없지만 상속을 받을 수 있다. 즉, 부모는 되지 못하지만 자식은 될 수 있다.
}

class ClassB extends b {

//	@Override
//	public void add() {
//		// TODO Auto-generated method stub
//		super.add();
//	}
}

class b {
	// 메소드 앞에 final이 붙으면 오버라이딩 금지
	public final void add() {

	}
}

public class c {
	
	static final int b=100;//고정 상수
	//b=200;
	
	public static void main(String[] args) {
		//final이 붙어 있는 변수는 입력값을 절대로 바꿀 수 없다.
		final int a = 10;//고정 상수
		//a=20;
		System.out.println(a);
		System.out.println(b);
	}

}