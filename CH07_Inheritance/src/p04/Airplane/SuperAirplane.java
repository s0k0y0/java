package p04.Airplane;

public class SuperAirplane extends Airplane {
	public static final int normal=1;
	public static final int supers=2;
	
	public int flyMode=normal;
	
	@Override
	public void fly() {
		if(flyMode==supers) {
			System.out.println("초음속비행");
		} else {
			super.fly();	
		}
			
	}
}
