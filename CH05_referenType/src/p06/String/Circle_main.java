package p06.String;

public class Circle_main {

	public static void main(String[] args) {
		Circle c1=new Circle(5);//c2와 별개의 객체 생성된 거임
		Circle c2=new Circle(5);
		
		if(c1==c2) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		if(c1.equals(c2)) {//우리가 만든 클래스는 equals()의 재정
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
		//주소값이 출력안되게 method class에서 toString메소드 만들어줘야함
	}

}
