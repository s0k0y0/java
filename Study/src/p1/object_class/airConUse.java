package p1.object_class;

class classO {
	//전역변수,필드
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	
	//일반 메소드
	void powerON() {
		System.out.println("power ON");
	}
	void powerOFF() {
		System.out.println("power OFF");
	}
	void tempUp() {
		temp++;
	}
	void tempDowm() {
		temp--;
	}
	
	
}


public class airConUse{
	public static void main(String[] args) {
		
		classO we=new classO();
		
		we.color="White";
		we.company="air";
		we.price=10000;
		we.size=10;
		we.temp=10;
		
		System.out.println("price:"+we.price);
		we.powerON();
		we.tempUp();
		System.out.println(we.temp);
		we.tempDowm();
		we.tempDowm();
		System.out.println(we.temp);
		we.powerOFF();
		
		System.out.println("-----두번째 시행-----");
		
		we.color="White";
		we.temp=10;
		we.price=10000;
		
		we.powerON();
		we.powerOFF();
		we.tempDowm();
		System.out.println(we.temp);
		
		classO we2=new classO();
		we2.color="yellow";
		we2.price=999999;
		we2.temp=10;
		
		System.out.println("temp="+we2.temp+",price:"+we2.price+",color="+we2.color);
		
		
		
	}
}