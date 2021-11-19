package p12.packages;

import java.text.SimpleDateFormat;
import java.util.Date;

import p11.finals.c;

public class importEx {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat we1=new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat we2=new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜"+we1.format(d));
		System.out.println("현재 시간"+we2.format(d));
		
		String a="홍길동";
		System.out.println(a);
		//java.lang은 기본 패키지로 import할 필요 없음. but lang외에 개발자가 만든거라고 반드시 import를 해야함
		
		c a2=new c();//다른 패키지에 있는 클래스 사용
		
	}

}
