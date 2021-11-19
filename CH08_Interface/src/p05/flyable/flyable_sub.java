package p05.flyable;

public class flyable_sub extends Vehicle implements flyable {

	@Override
	public void fly() {//인터페이스의 추상메소드 오버라이딩
		System.out.println("fly()인터페이스를 구현하고 vehicle를 상속받아서 난다");
	}
	
}
