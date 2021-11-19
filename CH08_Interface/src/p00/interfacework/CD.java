package p00.interfacework;

public class CD extends parentCD implements Lendable {// 클래스 상속이 먼저와야 함

	String borrower;// 대출인
	String borrowD;// 대출 날짜
	byte state;// 대출 반납 상태

	public CD(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void borrow(String borrower, String date) {//부모의 대출 추상 메소드 
		if (state != 0) {// 대출이 된 상태
			return;
		}

		this.borrower = borrower;
		this.borrowD = date;
		System.out.println(super.title + " 대출");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	@Override
	public void checkout() {//부모의 반납 추상 메소드
		this.borrower = null;//반납했기에 값 없음
		this.borrowD = null;//반납했기에 값 없음
		this.state = 0;// 0일 경우, 대출이 안된 상태
		System.out.println(super.title + " 반납");
	}
}
