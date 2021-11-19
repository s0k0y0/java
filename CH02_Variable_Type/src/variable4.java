
public class variable4 {
		
		static String str1="홍길동";
	
		
	public static void main(String[] args) {
		int a=5;
		
		String str=new String("홍길동");
		
		System.out.println("abc");
		String cde="cde";
		System.out.println("abc"+cde);
		String c="abc".substring(2,3);//문장의 2부터 시작해서 3째 인덱스 전까지 출력해라
		String d=cde.substring(1,2);//문장의 1부터 시작해서 2째 인덱스 전까지 출력해라
		
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		char c1=str.charAt(2);//str 인스턴스의 내용에서 인덱스2에 포함된 단한개의 문자를 출력
		System.out.println(c1);
		
		String c2=String.valueOf(str1+10);//String클래스의 있는 valueof는 괄호안에 있는 모든 리터럴을 문자로 출력
		System.out.println(c2);
		
		int in=Integer.MAX_VALUE;//AIP문서에서 static이 붇은 건 이미 자바내에서 만들어진 method 바로 가져올 수 있기 때문에
		int in2=Integer.MIN_VALUE;
		System.out.println(in+"/"+in2);
		
		int p=Integer.parseInt("20");//Integer클래스에서 method가져와 String을 integer로 강제 캐스팅. 하지만 문자의 형태가 숫자여야 함. 
		System.out.println(p);
		
	
		final double p1=3.121592;//final:입력 리터럴값을 한번 설정하면 절대로 바꿀수 없도록 고정하는 것
		double p2=Math.PI;//double클래스가 아닌 Math클래스에서 pi가져옴.
		System.out.println(p2);
		
		
		
		
		
		
		
		
		
		
	}

}
