package p02.nulls;

public class Point_main {

	public static void main(String[] args) {
		
		Point a1=new Point(10, 20);
		System.out.println(a1.x);
		System.out.println(a1.y);
		
		
		Point a2;//값이 초기화가 되지 않음
//		System.out.println(a2.x);  값이 없는 상태
//		System.out.println(a2.y);
		
		Point a3=null;
		try {
		System.out.println(a3.x); 
		System.out.println(a3.y); //null:알 수 없는 어떤 값으로 위와 같이 컴파일 에러는 발생시키지 않으나 실행시 에러를 발생
		} catch (Exception e) {
			System.out.println("예외");
		}
	}

}
