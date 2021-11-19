package p05.flyable;

import p05.Driver.vehicle;

public class flyable_main {
	public static void main(String[] args) {
		
		flyable_sub we=new flyable_sub();
		we.fly();
		we.move();
		
		//다형성
		flyable we2=new flyable_sub();
		we2.fly();
		((Vehicle) we2).move();//자식이 vehicle도 상속을 받았기 때문에 두 부모가 포함하고 있기에 캐스팅 가능
		
//		vehicle we3=new flyable_sub();
//		we3.run();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
