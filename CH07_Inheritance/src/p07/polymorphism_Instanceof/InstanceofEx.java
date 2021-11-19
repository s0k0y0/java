package p07.polymorphism_Instanceof;

//328
//intstnceof:다형성에서 강제형변환 여부를 나타내주는 연산자
public class InstanceofEx {

	public static void main(String[] args) {
		// method안에서는 method를 만들 수 없다. 호출은 가능하지만 이중 method는 불가능
		
		//1.
		Parent p1=new Child();//Parent의 눈으로 Child을 다형성 형성함.   즉, 이건 Parent이기도 하고 Child가 다 포함되어 있는 객체
		InstanceofEx.method1(p1);
		method2(p1);//같은 클래스에 있는 method일 경우 앞에 위와 같이 클래스명을 안써줘도 됨
		
		Parent p2=new Parent();//이건 그냥 Parent
		InstanceofEx.method1(p2);//p2는 Parent만 가지고 있으므로 method1에서 child와 같냐고 물어봤을때 그렇지 않음으로 else를 실행.
		try {
			method2(p2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("강제형변환 예외 발생");
		}//surround with-catch block:에러발생할 경우 시행함.
		
	}
	
	
	
	
	
	
	//static은 메모리에 있어 바로 가져다쓸 수 있음. 
	                         // Parent p=new Parent();와 파라미터가 동일 의미
	public static void method1(Parent p) {// Parent클래스의 내용만 파라미터에 입력 가능
		if (p instanceof Child) {// p(입력한 변수)가 child class가 맞냐?
			Child c = (Child) p;
			System.out.println("casting");
		} else {
			System.out.println("promotion");
		}
	}

	
	//이건 무조건 강제 캐스팅해라임.
	public static void method2(Parent p) {
		Child c = (Child) p;
		System.out.println("casting");
	}
	
	
	
	
	//java.lang.ClassCastException:형변환에서 예외가 발생

}
