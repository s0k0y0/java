package p02.threadclass;
//thread를 만드는 방법: 1.thread class를 이용. 2.runnable class를 이용

public class multithreadEx {

	public static void main(String[] args) {//main thread
		// Thread class를 이용해 여러갈래의 thread만들기
		//multi Thread:main thread&thread class를 동시에 시행함
		
		Thread t=new DigitThread();//main Thread를 1코어쓰고 남은 코어로 해당 클래스 thread를 동시에 실행하는 것
		t.start();//thread 시작 메소드=run 메소드를 찾아감. thread class 실행을 위해 반드시 start와 run이 필요함
		
		for(char c='A'; c<='Z'; c++){
				System.out.println(c);
				try {
					Thread.sleep(1000);//1second 간격으로 실행
				} catch (InterruptedException e) {
					e.getMessage();
				}
		
		}

	}

}
