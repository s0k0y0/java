package p03.threadinterdace;

public class calculatorThread extends Thread  {
	
	public calculatorThread(String name) {
		setName(name);//Thread method:Thread이름을 저장하겠다
		}
	
	@Override
	public void run() {
		
		for(int i=0; i<200; i++) {
			
		}
		System.out.println(getName());//setname에 저장된 변수값 출력
	
	}
}
