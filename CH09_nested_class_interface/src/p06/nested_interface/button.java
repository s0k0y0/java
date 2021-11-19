package p06.nested_interface;
//중첩 인터페이스
public class button {

	Onclicker listener;

	
							//매개변수의 다형성
	public void setListener(Onclicker listener) {//콜클래스랑 메세지클래스를 쓸 수 있음
		this.listener = listener;
	}


	void touch() {//무슨 역할의 메소드인지 모르겠음!!!!!!!!!
		listener.onclick();
	}




	//nested interface
	interface Onclicker{//중첩 인터페이스 생성
		void onclick();//추상 메소드
	}
	
	
	
	
	
	
	
}
