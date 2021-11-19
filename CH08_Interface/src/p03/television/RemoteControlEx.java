package p03.television;

import p02.Remote.RemoteControl;

public class RemoteControlEx {
	public static void main(String[] args) {
		
		RemoteControl we1=new television();
		we1.turnOn();
		we1.setMute(true);
		we1.setVolume(11);
		RemoteControl.change();
		we1.setMute(false);
		we1.turnOFF();
		
		
		RemoteControl we2=new audio();
		we2.turnOn();
		we2.setVolume(5);
		RemoteControl.change();
		we2.turnOFF();
		
		
		
		
		
		
		
		
		
		
	}
}
