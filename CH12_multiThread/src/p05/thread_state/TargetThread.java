package p05.thread_state;

public class TargetThread extends Thread {

	@Override
	public void run() {

		for (long i = 0; i < 100; i++) {//runnable상태:실행대기 
			System.out.println("a");
		}

		try {
			Thread.sleep(1500);//timed-waiting:다음 for문장시행까지 기다리는 시간려 주는 thread state
			System.out.println("stop");
		} catch (InterruptedException e) {
			
		}
		
		for (long i = 0; i < 100; i++) {//runnable상태
			System.out.println("b");
		}

	}

}
