package Car;

public class Car_main {
	public static void main(String[] args) {
		
		Car[] a=new Car[3];
		a[0]=new Bus();
		a[1]=new Taxi();
		a[2]=new Ambulance();
		
		for(int i=0; i<a.length; i++) {
			a[i].drive();
			if(a[i]instanceof Taxi) {
				((Taxi) a[i]).inwon();//instanceof로 Taxi로 자동 다형성 가능한지 판별하고  true라면 강제변환을 하도록 실행한다.부모의 클래스에는 자식 클래스가 모두 포함되어있기 때문에 true임 
				return;
			}
		}
		
	}
}
