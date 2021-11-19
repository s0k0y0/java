package p12.wrapper;

import java.nio.file.Watchable;

public class wrapperEx {

	public static void main(String[] args) {
		Integer a=new Integer("100");
		int result1=a.intValue()*5;//integer클래스를 int숫자로 바꿔주겠다. Boxing=>Unboxing
		int result=result1*10;
		System.out.println(result);
		
		int r=Integer.parseInt("20");//integer클래스를  기본 타입 int로 바꿔주겠다???
		System.out.println(r);
		
		printDouble(12.34);//기본형 타입(double)이 클래스 타입(Double d)으로 바뀜. Unboxing=.Boxing
		
	}
	
	static void printDouble(Double d) {//Double인 클래스 타입
		System.out.println(d);
	}
	
	

}
