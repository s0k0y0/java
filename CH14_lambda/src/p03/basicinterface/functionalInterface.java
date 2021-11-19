package p03.basicinterface;

//interface 구성요소4가지: 1.추상메소드 
//lambda:인터페이스를 단축형인 람다식으로 표현가능. 추상메소드가 반드시 하나일때 사용가능 

@FunctionalInterface//람다식 사용 가능 표시
public interface functionalInterface {

	public void method();
	public void method2();

}


class lamb implements functionalInterface {

	@Override
	public void method() {
		System.out.println("자식 클래스 만들어 인터페이스 객체 생성가능");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}