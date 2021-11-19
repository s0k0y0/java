package p04.Airplane;

public class SuperAirplaneEx {
	public static void main(String[] args) {
		SuperAirplane a= new SuperAirplane();
		a.takeOFF();
		a.fly();
		a.flyMode=a.supers;
		a.fly();
		a.flyMode=a.normal;
		a.fly();
		a.land();
		
		
		
	}
}
