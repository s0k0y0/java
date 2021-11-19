package p03.threadinterdace;

public class threadinterEx {

	public static void main(String[] args) {

		smallLetters s=new smallLetters();
//		Thread t=new Thread();
//		Runnable r=new smallLetters();
//		s.start();//start 메소드 사용 불가능
//		t.start();//start 메소드 사용은 가능하지만 small 클래스와는 상관없이 새로운 객체를 만드는거라 안됨
//		r.start();//start 메소드 사용 불가능
		
		Thread t=new Thread(s);//쓰레드 객체에 runnable 인터페이스 객체 넣어주기
		t.start();
		
		char[] we= {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ'};
		for(char c:we) {//배열 대비 변수 하나씩 넣어주기?? 향상된 for문 의미 제대로 알기!
			System.out.println(c);
			try {
				Thread.sleep(2000);//실행 2초 시간 지연
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}

		
		
		
		
	}

}
