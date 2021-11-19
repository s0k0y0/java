package p03.threadinterdace;

public class BeepPrintEx2 {

	public static void main(String[] args) {// BeepPrintEx와는 달리 이건 multithread임. 다른 실행 방향의 thread를 만들었음

		// how1:상속받은 자식객체를 runnable target으로 지정
		BeepPrintInter b = new BeepPrintInter();
		Thread t = new Thread(b);
		t.start();

		
		// how2:runnable 다형성으로 만들어 runnable target으로 지정
		Runnable r = new BeepPrintInter();// 자식객체를 runnable로 다형성 만들기
		Thread t2 = new Thread(r);
		t2.start();

		
		// how3:runnable 자체를 익명 객체 생성해 runnable target으로 지정
		Thread t3 = new Thread(new Runnable() {
			public void run() {

				for (int i = 0; i < 5; i++) {
					System.out.println("t3.Beep소리 재생");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.getMessage();
					}
				}
			}
		});
		t3.start();
		
		// how4:runnable 자체를 익명 객체를 람다식으로 줄여 runnable target으로 지정
		Thread t4 = new Thread(() -> {//람다식으로 run method를 작성 생략. 곧바로 실행 내용만 적으면 됨
			for (int i = 0; i < 5; i++) {
				System.out.println("t4.Beep소리 재생");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.getMessage();
				}
			}
		});
		t4.start();
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main.Beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}

	}

}
