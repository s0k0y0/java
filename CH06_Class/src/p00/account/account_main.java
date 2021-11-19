package p00.account;

public class account_main {

	public static void main(String[] args) {
		//"1111","hong",3000
		
		//1.변수저장
		Account we2=new Account();
		we2.balancd=3000;
		we2.accountNo="1111";
		we2.ownerName="hong";
		
		//2.메소드 저장
		Account we3=new Account();
		we3.setAccountNo("1111");
		we3.setBalancd(3000);
		we3.setOwnerName("hong");
		
		//3.생성자 저장
		 Account we=new Account("1111", "hong", 3000);
		//만약 3개의 파라미터가 든 생성자를 만들경우, 파라미터가 아무것도 없는 빈 생성자 없이 빈 형태의 객체를 생성할 수 없다.
		//즉,위와 같이 객체를 생성했을 때 account클래스에서 account(){}의 빈 생성자를 만들지 않는 한, account we=new account();를 만들 수 없다.
		
		 
		//입금1000
		we.deposit(2000);
		
		//출금1000
//		we.withdraw(1000);
//		System.out.println("인출금액:"+b);
//		
//		int b=we.withdraw(1000);
//		System.out.println("인출금액:"+b);
		
		try {
			we.withdraw(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace(); 빨간색으로 표시하도록 기능. 빨간색으로 표시해도 다음 코드 실행가능 상태
		}
		
		System.out.println("over");
		
	}

}
