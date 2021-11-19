package p02.CellPhone;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone use=new DmbCellPhone("자바폰","검정",10);
		
		System.out.println(use.model);
		System.out.println(use.color);
		
		System.out.println(use.channel);
		
		use.powerON();
		use.bell();
		use.sendVoice("Hi");
		use.receiveVoice("Hi, what's wrong?");
		use.hangUp();
		
		use.turnOnDmb();
		use.ChangeChannel(12);
		use.turnOFF();
	}

}
