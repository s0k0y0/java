package p06.state_control;

class threadA extends Thread {

	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {

		while (!stop) {

			if (work) {
				System.out.println("threadA 작업내용");
			} else {
				Thread.yield();// 실행하는 중 이 메소드로 바로 실행 대기 상태로 가겠다
		}
		}
		
		System.out.println("ThreadA 종료");
	}

	
	
}

class threadB extends Thread {

	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {
		
		while(!stop) {
			
			if(work) {
				System.out.println("threadB 작업내용");
			} else {
				Thread.yield();//실행=>실행대기
			}
		}
		
		System.out.println("ThreadB 종료");
	}
	
	
	
}
