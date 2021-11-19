package p07.myinterface;

public class myClassB implements myInterface {

	@Override
	public void method1() {//오버라이딩 필수
		System.out.println("method1_B");
	}
	
	@Override
	public void method2() {//오버라이딩 해도 되고 안해도 되고 맘대로
		System.out.println("method2_B");
	}
	
}
