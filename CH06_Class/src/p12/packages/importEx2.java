package p12.packages;

import static java.lang.System.out;

public class importEx2 {// static은 클래스에는 붙을 수 없다?
	// 대문자는 고정상수 ex)PI
	// 소문자는 변수

	static int a = 10;// 공유 변수
	static String s = "홍길동";
	static String s2 = new String("홍길동");

	public static void main(String[] args) {

		importEx2 it = new importEx2();
		a=20;
		it.a=30;
		importEx2 it2=new importEx2();
		//상속 관계가 아닌 타 클래스에 대해서는 다형성으로 객체생성 불가
		
		System.out.println(a);
		
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println();
		
		System.out.println(s);//같은 클래스 안이라 클래스명 생략해도 됨
		System.out.println(s2);//원래는 주소값이 나와야 하지만 개발자가 추가적으로 기능을 넣어 바로 입력값이 출력될 수 있도록 변경

		
		
		
		
	}

}

