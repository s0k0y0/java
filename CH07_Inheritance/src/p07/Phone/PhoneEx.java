package p07.Phone;

public class PhoneEx {
	public static void main(String[] args) {
		SmartPhone a=new SmartPhone("인터넷");
		Phone.turnOn();//static이라서 부모 클래스로 직접지정해줘야 함.
		a.Search();//자식 메소드라서 강제변환시켜줘야 함
		Phone.turnOff();
		
	}
}
