package p04.syn_method1;

public class calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//synchronized:동기화 메소드. 실행이 겹쳐서 같은 값이 나오게 되는 것을 방지해줌
	//즉, Thread1인 user2가 사용되고 있으면 중간에 thread2인 user1이 동시에 실행될 수없음. 무조건 첮번쨰 thread가 실행이 끝나야함
	public synchronized void setMemory(int memory) {//변수에 값 저장
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		
	}

}
