package p03.basicinterface;

public class Main_function {

	public static void main(String[] args) {

		//1.인터페이스 자식 객체 생성
		lamb l=new lamb();
		l.method();
		
		//2.인터페이스 익명 객체 생성
		functionalInterface f=new functionalInterface() {
			
			@Override
			public void method() {
				System.out.println("여기다가 재정의해서 써먹음");
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
		f.method();
		
		
		//3.인터페이스 람다식 객체 생성. 간단하게 표시하기 위해 만든 버전. 하지만 추상메소드 하나밖에 표현못함
//		functionalInterface ff= () ->System.out.println("람다식으로 인터페이스 자체 객체 생성");
//		ff.method();
		
		//3.runnable 람다식
		Runnable r=()->{
			System.out.println("Thread");
			};
		Thread t=new Thread(r);
		t.start();
		
		
		
		
		
		
	}

}
