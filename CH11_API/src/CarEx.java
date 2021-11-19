
class Car {

	String number;
	int inputTime;
	int outputTime;
	int fee;
	final int prTime=2000;

	public Car(String number, int inputTime, int outputTime) {
		this.number = number;
		this.inputTime = inputTime;
		this.outputTime = outputTime;

	}

	public void prn() {
			if(0<=outputTime&&outputTime<=24){
				if(0<=inputTime&&inputTime<=24){
					int fee = ((outputTime - inputTime) *prTime);
					
					System.out.println("차량번호: "+number);
					System.out.println("주차요금: " + fee+"원");
					System.out.println("입고시간: " +inputTime+"시");
					System.out.println("출고시간: " +outputTime+"시");
					
				}
			}
		}
		

}



public class CarEx {
	public static void main(String[] args) {

		Car c1=new Car("349578",10,20);
		Car c2=new Car("354788",9,16);
		Car c3=new Car("305962",7,14);
		
		c1.prn();
		c2.prn();
		c3.prn();
		
	}

}