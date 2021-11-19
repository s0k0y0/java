package p06.throwEx;

public class throwEx {

	public static void main(String[] args) {
		
		try {//이 클래스가 아니더라도 반드시 find클래스의 오류에 대한 try()를 작성해야 함
			find();
		} catch (ClassNotFoundException e) {
			System.out.println("class가 존재하지 않는다");
		}
		
		
	}
	
	public static void find() throws ClassNotFoundException {
		Class we= Class.forName("java.lang.String2");
		//클래스에 대한 객체 생성이지만 클래스가 존재하지않아 오류 발생. 근데 예외 처리를 find클래스에서 하지 않겠다고 넘기기 throw함
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
