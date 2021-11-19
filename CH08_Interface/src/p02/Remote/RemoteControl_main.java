package p02.Remote;

public class RemoteControl_main {

	public static void main(String[] args) {
		
		
		
		RemoteControl a= new RemoteControl_sub();//먼저 자식으로 다형성 만들어준 다음
		
		RemoteControl_sub ai=(RemoteControl_sub) a;//자식 클래스로 강제 변환 시켜줌
		
		ai.turnOn();
		ai.setMute(false);
		ai.setVolume(5);
		ai.Music("2002");//강제 변환 시켜주었기에 method사용 가능
		ai.turnOFF(); 
		
		RemoteControl aa=new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOFF() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		aa.turnOn();
		aa.setMute(false);
		aa.setVolume(5);
		//aa.Music("2002"); 자기자신의 객체만 생성했고 자식 객체를 생성하지 않아서 method호출 불가능
		aa.turnOFF();
		
		
		
		
	}

}
