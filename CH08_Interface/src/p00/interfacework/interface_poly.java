package p00.interfacework;

public class interface_poly {
	
	static void checkoutall(Lendable we[], String borrower, String date) {//파라미터의 다형성:파라미터를 다형성으로 가져옴으로써 부모의 딸려있는 자식들의 메소드와 변수를 쓸 수 있다
		for(int i=0; i<we.length; i++) {
			we[i].borrow(borrower,date);
			
		}
	}
	
	
	public static void main(String[] args) {
      
		//배열의 다향성
		
		Lendable[] we=new Lendable[3];//배열 생성
		we[0]=new book("202111","해리포터","롤링");
		we[1]=new book("2012222","푸코","에코");
		we[2]=new CD("2030933","html");
		
		checkoutall(we, "홍길동", "290394");//배열 하나만 출력은 안되는 가봄
		
		
		
	}
}
