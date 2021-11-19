package p04.syn_method2;

public class calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}
	
	
	public void setMemory(int memory) {
		synchronized (this) {//동기화 블럭:마찬가지로 순서대로 실행하게끔 해줌
			
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		
		
		}
	}

	
	
	
}
