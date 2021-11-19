package p06.nested_interface;

public class MessageListener implements button.Onclicker {//중첩 인페이스 상속 방법

	@Override
	public void onclick() {
		System.out.println("전화를 겁니다");
		
	}

}
