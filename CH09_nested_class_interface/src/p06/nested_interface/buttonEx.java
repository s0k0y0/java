package p06.nested_interface;

public class buttonEx {

	public static void main(String[] args) {

		
		button we=new button();
		callListner c=new callListner();
		we.setListener(c);
		we.touch();
		
		
		MessageListener m=new MessageListener();
		we.setListener(m);
		we.touch();
		
		
		//1.중첩인터페이스 생성 2.추상메소드 자식클래스 만들어 오버라이딩 3.오버라이딩 메소드를 자유롭게 쓸 수 있도록 인터페이스를 매개변수로 하여 setlistener만듬
		//4.자식 객체, 부모 객체 따로 만들어 출력
		
		
		
		
		
		
		
		
		
	}

}
