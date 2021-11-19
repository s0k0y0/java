package p07.userdefine;

public class Account {

	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {// 입급
		balance = balance + money;
		System.out.println("통장잔고: " + balance);
		
	}

	public void withdraw(int money) throws AccountException {// 출금
		 
		if (balance<money) {
			throw new AccountException();//조건이 맞으면 무조건 예외로 넘기기
		}
		balance-=money;
		System.out.println("통장잔고: " + balance);
		
	}
	
	

	
}

class AccountException extends Exception {// 나만의 오류 만들기

	public AccountException() {
		super("출금할 수 없습니다.통장 잔고가 부족합니다.");
	}

}