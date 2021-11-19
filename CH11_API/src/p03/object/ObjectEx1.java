package p03.object;

import java.util.GregorianCalendar;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		GregorianCalendar g1=new GregorianCalendar(2021,10,14);//
		GregorianCalendar g2=new GregorianCalendar(2021,10,14);
		if(g1.equals(g2)) {//equal은 객채의 내용이 다른지 같은지 판별
			System.out.println("equal");
		} else {
			System.out.println("diffrent");
		}
		
		System.out.println("---------------");
		Circle c1=new Circle(10);
		Circle c2=new Circle(10);
		if(c1.equals(c2)) {//같은 내용인데 다르게 나오기에 equal메소드를 오버라이딩 해줘야함. 
			System.out.println("equal");
		} else {
			System.out.println("diffrent");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
