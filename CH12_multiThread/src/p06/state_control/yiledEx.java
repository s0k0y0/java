package p06.state_control;

public class yiledEx {

	public static void main(String[] args) {
		
		threadA a=new threadA();
		threadB b=new threadB();
		
		a.start();//둘의 thread 동시 실행
		b.start();
		
		try {
			Thread.sleep(3000);//다음 실행 3초 지연
			System.out.println("thread 실행 중 3초 지연");
		} catch (InterruptedException e) {
			
		}
		
		b.stop=true;//b thread 종료시킴
		
		a.work=false;
		try {
			Thread.sleep(3000);//대기상태로 전환과 3초 지연
			System.out.println("thread 실행 중 3초 지연");
		} catch (InterruptedException e) {
			
		}
		
		a.work=true;
		try {
			Thread.sleep(3000);//실행상태로 전환과 3초 지연
			System.out.println("thread 실행 중 3초 지연");
		} catch (InterruptedException e) {
			
		}
		
		a.stop=true;//a method 종료시킴
		
		
		
	}

}
