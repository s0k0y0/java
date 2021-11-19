package p04.method;

public class boxMethodEx {
	public static void main(String[] args) {
		
		
		box<String> b=Util.boxing("홍길동");//static method이기에 클래스로 불러옴
		System.out.println(b.getObject());
		
		box<Integer> b2=Util.boxing(100);
		System.out.println(b2.getObject());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
