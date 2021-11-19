package p05.Car;

public class Car {
	//array 다형성:자식 클래스를 배열로 두어 자식 클래스 요소를 밑에 roll과 같이 사용할 수 있다.
	Tire[] tires={new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire()};
	
//	void run() {
//		for(Tire a:tires) {//데이터 타입이 Tire 클래스이기에 Tire method를 불러올 수 있는 것 같음. 그리고 tire의 roll을 불러도 new hankook으로 인해 재정의된 한국타이어가 굴러감이 출력됨
//			a.roll();;
//		}
	
	void run() {
		for(int i=0; i<tires.length; i++) {
			Tire a=new Tire() {
				
				@Override
				public void roll() {
					// TODO Auto-generated method stub
					
				}
			};
			a.roll();
		}
	}
	
	
	
	
		
}
