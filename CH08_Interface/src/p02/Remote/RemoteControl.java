package p02.Remote;

public interface RemoteControl {
	
	
	
	//static 전역변수
	public int MAX_VOLUME=10;//interface는 내용을 작성할 때 가이드 라인이다. interface에 해당 전역변수를 넣으면 static final이 생략되어 있어 보이지 않지만 절대로 해당 변수를 바꿀 수 없다는 것이다. 
	public int MIN_VOLUME=0;
	
	
	//추상 메소드
	public void turnOn();
	public void turnOFF();
	public void setVolume(int volume);
	
	
	//선택 메소드(자식클래스에서 오버라이딩해서 사용해도 되고 안해도 되고 맘대로)
	default void setMute(boolean mute) {
		if(mute) {System.out.println("무음");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	
	static void change() {
		System.out.println("건전지 교환");
	}
	
	
	
}
