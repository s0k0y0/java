package p02.threadclass;

//실행 흐름1
public class DigitThread extends Thread {//무조건 Thread를 상속받거나 interface runnable 상속받아야함

	@Override
	public void run() {//thread 실행 메소드
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);//2second 간격으로 실행
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	
	}
	
	
	
}
