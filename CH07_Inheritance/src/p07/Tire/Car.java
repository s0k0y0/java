package p07.Tire;

public class Car {
	Tire FL=new Tire("앞왼",10);
	Tire FR=new Tire("앞오",10);
	Tire BL=new Tire("뒤왼",10);
	Tire BR=new Tire("뒤오",10);
	
	void stop() {
		System.out.println("멈춤");
	}
	
	
	//Tire method에서 roll작동이 끝날때, run이 실행되면서 타이어 멈춤이라고 알려줌
	int run() {
		System.out.println("달림");
		if(FL.roll()==false) {
			stop();
			return 1; 
		} if(FR.roll()==false) {
			stop();
			return 2;
		} if(BL.roll()==false) {
			stop();
			return 3;
		} if(BR.roll()==false) {
			stop();
			return 4;
		} 
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
