package p03.television;

import p02.Remote.RemoteControl;

public class audio implements RemoteControl {
	//extends&implements의 가장 큰 차이점: 다중 상속은 불가능 하지만 다중 인터페이스상속은 가능하다.즉, 여러개의 클래스의 가이드라인을 받을 수 있다
	
	
	
	
	
	private int volume; //television과는 또 다른 변수의 volume으로 이 볼륨은 해당 클래스내에서만 접근하도록 하겠다. 
	//아니면 main에서 볼륨을 삽입했을때 그 볼륨이 적용되는 범위를 각각 클래스 내로 하겠다. 오디오 볼륨을 지정하면 오디오 클래스 내에서만 일어나고 텔레비전 볼륨을 지정하면 텔레비전 클래스 내에서만 반응

	@Override
	public void turnOn() {
		System.out.println("audio ON");
	}

	@Override
	public void turnOFF() {
		System.out.println("audio OFF");
		
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
