package Car;

public class Taxi implements Car{
	
	public void inwon() {
		System.out.println("정원이 5명이다");
	}

	@Override
	public void drive() {
		System.out.println("총알처럼 달린다");
		
	}
}
