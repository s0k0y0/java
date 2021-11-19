package p00.interfacework;

interface Lendable {
	
	void borrow(String borrower, String date);//반납, 대출 추상 메소드 
	void checkout();

}



class parentCD{
	
	String registerNo;//관련번호
	String title;//제목
	
	
	public parentCD(String registerNo, String title) {
		super();
		this.registerNo = registerNo;
		this.title = title;
	}
	
	
}




public class library{
	
	public static void main(String[] args) {
		
		book we1=new book("867", "개미","베르베르");
		we1.borrow("홍길여","2018611");
		we1.checkout();
		
		
		CD we2=new CD("2018-9001", "Spring");
		we2.borrow("박삼수","2018656");
		we2.checkout();
		
		
		
		
		
	}
}