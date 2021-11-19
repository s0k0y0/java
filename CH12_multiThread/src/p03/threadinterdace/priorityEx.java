package p03.threadinterdace;

public class priorityEx {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			Thread t=new calculatorThread("thread"+i);
			if(i !=10) {
				t.setPriority(Thread.MIN_PRIORITY);//우선 순위 가장 낮춤?
			} else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
		
		
		

	}

}
