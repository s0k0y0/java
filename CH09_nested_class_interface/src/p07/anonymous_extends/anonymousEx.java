package p07.anonymous_extends;

public class anonymousEx {

	public static void main(String[] args) {

		
		anonymous we=new anonymous();
		
		we.p3.wake();//익명객체의 메소드 불러옴
		we.method1();
		we.method2(new person() {//person 익명 객체를 불러와서 내용 수정 가능?. 파라미터 안에 익명객체 넣어서 수정 가능
			
			 void study() {
				 System.out.println("공부합니다");
			 }
			 
			 @Override
			void wake() {//일반 클래스를 익명으로 불러오기 가능. 불어와서 재정의하여 씀
				System.out.println("8시에 일어납니다");
				study();
			 } 
			 
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
