package p01.intefaces;

public class interface_Sub implements interfaceEx1 {
	
	
	
	@Override
	public void add() {
		
		System.out.println("abstract method를 Overriding하는데 method의 body를 추가한 overrid method");
	}
	
	
	
	void subtract() {
		System.out.println("구현한 클래스 메소드");
	}
	
	
	
	
	
	
	

}
