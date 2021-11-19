package p07.Car;

public class Driver {
	public void drive(Vehicle a) {//파라미터의 다형성
		a.run();//비클이 부모 클래스라면 부모의 자식들까지 메소드를 사용할 수 있음
	}
}
