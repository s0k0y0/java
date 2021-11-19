package p05.Car;

public class CarEx {

	public static void main(String[] args) {

		//array 다형성은 부모클래스 타이어를 
		
		Car we=new Car();
		we.run();
		
		we.tires[0]=new KimhoTire();//배열의 객체를 금호로 바꿔버림
		we.tires[1]=new KimhoTire();
		we.run();
		

	}

}
