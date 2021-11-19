package p02.threadclass;

import java.awt.Toolkit;

public class BeepPrintEx {//이건 mutithread는 아니고 main만 실행되는 singlethread

	public static void main(String[] args) {
		
		Toolkit t=Toolkit.getDefaultToolkit();//singletone과 비슷.get메소드로 toolkit클래스의 모든 변수와 메소드를 쓸 수 있음
		for(int i=0; i<5; i++) {
			t.beep();//삐뽀삐뽀 소리나는 것
			System.out.println("Beep소리 재생");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}

		
		for(int i=0; i<5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		
	}

}
