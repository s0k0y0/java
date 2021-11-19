package p05.trywithresouces;



public class tryWithResourcesEx {

	public static void main(String[] args) {

		// old
		fileInputStream we1 = null;//method안에 있는 변수는 로컬 변수로 반드시 초기화 해줘야 함

		try {
			we1= new fileInputStream("file.txt");
			we1.read();
			throw new Exception("강제적으로 예외처리하겠다");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				we1.close();
			} catch (Exception e) {
				
			}
		}
		
		
		//new(try-with-resources)

		try {
			fileInputStream we2= new fileInputStream("file.txt");
			
			
			we2.read();
			throw new Exception("강제적으로 예외처리하겠다");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} finally {//close를 안 쓰는 이유는 AutoCloseable 즉, 자동으로 close하는 기능이 첨부되어 있음
			
		}
		
		
		
		
		
		
		

	}

}
