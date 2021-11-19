package p07.userdefine;

public class Account_main {

	public static void main(String[] args) {

		Account we = new Account();

		we.deposit(5000);// 5000원 입급

		try {
			we.withdraw(10000);//조건이 아니라 변수입력이 잘못들어가는 것이기에 try를 이쪽에 써야함?
		} catch (AccountException e) {
			System.out.println(e.getMessage());//내가 만든 예외 오류메세지 가져오기
		}

	}

}
