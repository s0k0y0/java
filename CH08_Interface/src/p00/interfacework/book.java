package p00.interfacework;

public class book implements Lendable {

	String request;//청구번호
	String title;//제목
	String writer;//저자
	String borrower;//대출인
	String borrowD;//대출 날짜
	byte state;//대출 반납 상태

	public book(String request, String title, String writer) {
		super();
		this.request = request;
		this.title = title;
		this.writer = writer;
	}

	@Override
	public void borrow(String borrower, String date) {
		
		if(state!=0) {//대출이 된 상태.0이 아니다
			return;
		}
		
		this.borrower=borrower;
		this.borrowD=date;
		System.out.println(title+" 대출");
		System.out.println("대출인:"+borrower);
		System.out.println("대출일:"+date+"\n");
	}

	@Override
	public void checkout() {
		this.borrower=null;
		this.borrowD=null;
		this.state=0;//0일 경우, 대출이 안된 상태 
	  System.out.println(title+" 반납");
	}

}
