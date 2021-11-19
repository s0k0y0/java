package p01.intefaces;

import p01.intefaces.Person;

public class Person_main {
	//메소드 파일의 위치가 인스턴스 메소드에 영향을 끼치기 때문에 모든 접근이 가능한 public을 붙여주는 것이 좋음
	public int a=10;
	public static double b=0;
	
	public void substract(int k, int s) {
		System.out.println(k-s);
	}//반환타입 void:
	//반환타입 int:메소드 수행 후 결과를 
	
	public void substract2(int k, int s) {
		System.out.println(k-s);
	}
	
	public static void main(String[] args) {
		
	Person i=new Person();
	System.out.println(i.add2(3, 5));
	int result=i.add(3, 3);
	System.out.println(result); 
	i.c=20;
	System.out.println(i.c); 
	System.out.println(Person.d); 
	
	System.out.println("-------------------");
	
	Person_main i2=new Person_main();
	i2.substract(10, 5);
	i2.substract2(20, 5);
	System.out.println(i2.a);
	System.out.println(Person_main.b);
	}

}
