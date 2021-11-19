package p05.Driver;

public class Bus implements vehicle {

	@Override
	public void run() {
		System.out.println("Bus");
		
	}//추상메소드로 내용 채웠음
	
	
	public void check() {
		System.out.println("승차요금 체크");
	}//자식의 독단적 메소드. 사용하려면 강제변환해야함
	
	

}
