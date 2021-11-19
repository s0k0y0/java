package p00.account;

public class Account {

	String accountNo;// 계좌번호
	String ownerName;// 예금주
	int balancd;// 잔고

	// 1.변수 저장
	public Account() {
		// TODO Auto-generated constructor stub
	}

	// 2.메소드 저장
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalancd() {
		return balancd;
	}

	public void setBalancd(int balancd) {
		this.balancd = balancd;
	}

	// 3.생성자 저장
	public Account(String accountNo, String ownerName, int balancd) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balancd = balancd;
	}

	// 입금
	void deposit(int a) {
		this.balancd += a;
		System.out.println("통장잔고:" + balancd);
	}

	// 출금
	int withdraw(int b) throws Exception {
		if (this.balancd > b) {
			this.balancd -= b;
			System.out.println("통장잔고:" + balancd);
		} else {
			// System.out.println("잔고 부족");
			throw new Exception("잔고 부족");// 강제적으로 예외발생
		}
		return b;// 이 줄이 없다면 b=1000라는 것이 저장이 안되지만 return으로 b값을 저장해주면서 출력할 수 있게됨

	}

}
