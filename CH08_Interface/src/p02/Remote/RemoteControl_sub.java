package p02.Remote;

public class RemoteControl_sub implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("turnOn");
		
	}

	@Override
	public void turnOFF() {
		System.out.println("turnOFF");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println(volume+"바꿈");
	}
	
	
	
	
	void Music (String Music) {
		System.out.println(Music+"선택");
	}//인터페이스에서 가이드라인 안준 그냥 자식 클래스 소속 메소드
	
	
	
}
