package p03.television;

import p02.Remote.RemoteControl;

public class television implements RemoteControl {

	private int volume; //여기 클래스 안에서만 volume변수에 접근할 수 있도록 하겠다
	
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOFF() {
		System.out.println("TV OFF");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;//만약 볼륨이 10보다 크면 max볼륨 10으로만 현재 클래스에 저장되어 10으로밖에 나오지 않는다
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("volume:"+this.volume);
	}
	

}
