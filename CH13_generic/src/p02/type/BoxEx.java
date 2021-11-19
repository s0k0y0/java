package p02.type;

public class BoxEx {
	public static void main(String[] args) {

		System.out.println("-------generic X--------");
		
//		box b=new box();
//		b.setObject("홍길동");
//		System.out.println(b.getObject()+"a");//이 사실은
//		//String name=(String) b.getObject 인 거임.
//		
//		b.setObject(new apple());
//		apple a=(apple) b.getObject();//Object가 더 큰타입이서 강제변환 필요
//		System.out.println(a);//주소값 출력 안하게 할려면 apple클래스에서 toString재정의 하면됨
//		
		
		System.out.println("-------generic--------");
		
		box<String> b=new box<>();//데이터 타입 넣어줌
		b.setObject("radioactive");
		System.out.println(b.getObject());
		//String name=(String) b.getObject의 연산이 생략됨 결과임
		
		box<apple> b2=new box();
		b2.setObject(new apple());
		System.out.println(b2);
		
		
		
		
		
	}

}
