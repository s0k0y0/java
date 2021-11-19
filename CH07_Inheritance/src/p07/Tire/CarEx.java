package p07.Tire;

public class CarEx {
	public static void main(String[] args) {
		Car c = new Car();

		
		//i는 시행횟수 타이어 수명이 다되면 교체해서 새로운 한국 금호 타이어의 객체로 생성되게 됨. 그렇기에 한국과 금호 클래스가 필요했었음
		//다형성으로 인해 한번 시행된 결과를 변화를 주어 새로운 결과를 만들어낸 것 같음
		for (int i = 0; i <= 11; i++) {
			int pro = c.run();
			
			switch (pro) {
			case 1:
				System.out.println("앞왼 한국타이어로 교체");
				c.FL = new Hankook("앞왼", 15);

			case 2:
				System.out.println("앞오 한국타이어로 교체");
				c.FR = new Hankook("앞오", 13);

			case 3:
				System.out.println("뒤왼 금호타이어로 교체");
				c.BL = new Hankook("뒤왼", 17);

			case 4:
				System.out.println("뒤오 금호타이어로 교체");
				c.BR = new Hankook("뒤오", 14);
			}

			System.out.println("-------------------");
		}
	}

}
