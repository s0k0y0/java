package p08.abstractionClass.Q01;

abstract class message {
	
	String title;
	String senderName;
	
	public message(String title, String senderName) {
		super();
		this.title = title;
		this.senderName = senderName;
	}

	abstract void send(String recipient);//추상 메소드를 안써먹음.....

}


public class sender{
	public static void main(String[] args) {
		
		email we1=new email("생일을 축하합니다","고객센터", "@email.com","10%할인");
		we1.send("수령인");
		
		System.out.println("---------------");
		
		SMS we2=new SMS("생일을 축하합니다","고객센터","999-999","10%할인");
		we2.send("수령인");
		
		
		
		
	}
}