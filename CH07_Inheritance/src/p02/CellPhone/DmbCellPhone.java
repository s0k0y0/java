package p02.CellPhone;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);//부모 클래스의 기본 생성자(부모 클래스에 있는 기본 생성자를 불러온다는 뜻)
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel"+channel);
	}
	
	//super:부모 클래스
	//super():부모 클래스의 기본생성자 호출
	
	void ChangeChannel(int channel) {
		this.channel=channel;//변수가 전역변수에 있으면 써줘야 하는 것 같음. 근데 아예 없어도 에러 안남;;
		super.model="color";//부모 클래스의 변수를 지칭하는 것. 즉, super.은 부모 클래스에 찾아가는 것 super()은 부모클래스의 변수가 찾아오는 것
		System.out.println("channel"+channel+"change");
	}
	
	void turnOFF() {
		System.out.println("수신 OFF");
	}
	
	void bell() {
		System.out.println("Bell Overriding");
	}
}
