package p10.static_;
public class singleEx {

	public static void main(String[] args) {
		
		//Singleton 적용 전
		//Bank b1=new Bank("KB은행"); 
		//System.out.println(b1.name);
		
		//sigleton을 사용하는 의미는 다른 객체 생성을 막기 위한 것이다. 그렇기에 전제 조건이 객체를 절대 생성하지 못하게 public이 아닌pivate를 붙여준다.
		
		
		
		//위는 새로 객체를 생성한게 맞는데 이건 static 객체를 가져오것임. 객체 생성new가 없는거 보면 알 수 있음
		Bank b=Bank.getB();//객체생성된 주소를 갖는 메소드만 호출
		System.err.println("Bank 이름:"+b.getName());
		
		
		
		
		
		
	}
}
