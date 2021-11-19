package p05.thread_state;

public class statePrintThreadEx {

	public static void main(String[] args) {
		
		TargetThread t=new TargetThread();
		statePrintThread s=new statePrintThread(t);
		
		s.start();
		
		
		
		
		

	}

}
