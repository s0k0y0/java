package p02.CellPhone;

public class CellPhone {
	//variable
	String model;
	String color;
	
	//constructor
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	//method
	void powerON() {
		System.out.println("전원 ON");
	}
	
	void powerOFF() {
		System.out.println("전원 OFF");
	}
	
	void bell() {
		System.out.println("Bell");
	}
	
	void sendVoice(String message) {
		System.out.println("A:"+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("B:"+message);
	}
	
	void hangUp() {
	System.out.println("Okay, Bye");
	}
	
	
	
	
	
	
	
	
	
}
