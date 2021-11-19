package p08.abstractionClass.Q01;

public class email extends message{
	
	String sender;
	String emailB;
	
	
	
	public email(String title, String senderName, String sender, String emailB) {
		super(title,senderName);
		this.sender = sender;
		this.emailB = emailB;
		
		
				
	}



	@Override
	void send(String recipient) {
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName);
		System.out.println("받는 사람:"+sender);
		System.out.println("내용:"+emailB);
	}
	
	
}



class SMS extends message{


	String phone;
	String message;

	

	public SMS(String title, String senderName,String phone, String message) {
		super(title,senderName);
		this.phone = phone;
		this.message = message;
		
	}



	@Override
	void send(String recipient) {
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName);
		System.out.println("받는 사람:"+phone);
		System.out.println("내용:"+message);
	}
	
	
	
	
}
