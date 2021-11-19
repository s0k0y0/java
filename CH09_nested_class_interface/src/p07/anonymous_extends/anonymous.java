package p07.anonymous_extends;

public class anonymous {

	//객체 생성
	person p1=new person();
	person p2=new person();
	
	
	//객체를 생성하는 것이 아닌 객체의 내용을 써주는 것
	//익명객체:생성될 객체의 내용을 괄호안에 쓰겠다
	person p3=new person() {
		 void work() {
			 System.out.println("출근합니다");
		 }
		 
		 @Override
		void wake() {//일반 클래스를 익명으로 불러오기 가능. 불어와서 재정의하여 씀
			System.out.println("6시에 일어납니다");
			work();
		 } 
	};
	
	
	
	
	void method1() {
		//메소드안에 클래스(익명)
		person p4=new person() {//메소드 안에도 익명객체생성 가능
			 void work() {
				 System.out.println("산책합니다");
			 }
			 
			 @Override
			void wake() {
				System.out.println("7시에 일어납니다");
				work();
			 } 
		};
		
		p4.wake();
		
		
	};

	void method2(person p5) {//1.로컬 변수이므로 wake 메소드를 불러올 수 있음. 2.변수를 person으로 가져왔기에 person이 담고 있는 변수나 메소드를 자유롭게 쓸 수 있음?
		p5.wake();
	}

}
