package p04.syn_method2;

class User1 extends Thread {
	
	calculator c;

	
	public void setC(calculator c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		
		c.setMemory(100);
		
	}
	
}

class User2 extends Thread{
	
	calculator c;
	
	public void setC(calculator c) {
		this.setName("User2");
		this.c = c;
	}
	
	@Override
	public void run() {
		
		c.setMemory(50);
		
	}
	
	
	
}