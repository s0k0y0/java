package p04.syn_method;

class User1 extends Thread {
	
	calculator c;//생성된 주소값을 저장. 이걸 없애면 setC에 변수에는 입력값이 저장되겠지만 calculator와 연결되어 저장되지 않음
	//심지어 상속도 Thread받아서 calculator이중상속해서 super로 불러낼 수도 없음. 즉, 반드시 주소값 호출 필요함
	
	public void setC(calculator c) {//c의 변수저장 setter메소드. 
		this.c = c;//근데 이 set을 설정해줘야 하는지 지식 부족ㅠㅠㅜㅠㅜ
	}
	
	@Override
	public void run() {
		
		c.setMemory(100);
		
	}
	
}

class User2 extends Thread{
	
	calculator c;
	
	public void setC(calculator c) {
		this.setName("User2");//setName method:Thread Name storage(저장)
		this.c = c;
	}
	
	@Override
	public void run() {
		
		c.setMemory(50);
		
	}
	
	
	
}