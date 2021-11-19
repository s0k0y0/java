package p03.threadinterdace;

import java.awt.Toolkit;

public class BeepPrintInter implements Runnable {

	@Override
	public void run() {
		
		Toolkit t=Toolkit.getDefaultToolkit();//singletone과 비슷.get메소드로 toolkit클래스의 모든 변수와 메소드를 쓸 수 있음
		for(int i=0; i<5; i++) {
			t.beep();//삐뽀삐뽀 소리나는 것
			System.out.println("t1&t2.Beep소리 재생");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}

	}

}
