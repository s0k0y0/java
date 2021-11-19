package p05.thread_state;

public class statePrintThread extends Thread {

	private Thread t;

	public statePrintThread(Thread t) {
		this.t = t;
	}

	@Override
	public void run() {

		Thread.State s = t.getState();// new,runnable,blocked 등의 6개의 상태중 현재 thread의 상태를 알려줌
		System.out.println("타겟 쓰레드 상태");

		while (true) {

			if (s == Thread.State.NEW) {
				t.start();
			} else if (s == Thread.State.TERMINATED) {
				System.out.println("쓰레드 종료");
				break;// break는 문장이 반복되어야 쓸 수 있음. 그 반복문장을 빠져나온다는 뜻.
			}
			
			try {
				Thread.sleep(500);//thread시간 지체해서 실행까지 기다리는 시간을 줌
			} catch (InterruptedException e) {
				
			}
		}

	}

}
