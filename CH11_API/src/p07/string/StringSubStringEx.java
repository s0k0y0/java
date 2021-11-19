package p07.string;

public class StringSubStringEx {

	public static void main(String[] args) {

		String we=new String("8584933-5837734");
		
		String s=we.substring(0,5);//가장 마지막 번째는 출력에선 제외시킴. 즉, 5번째 인덱스 글자는 출력 제외됨
		System.out.println(s);
		
		String s2=we.substring(7);//7번 부터 끝까지 출력하기
		System.out.println(s2);
		char s3=we.charAt(7);//7번쨰 한글자밖에 못 뽑음
		System.out.println(s3);
		
		
		System.out.println("------------");
		
		//문자열 ("10")=>숫자
		//1번 방법
		int result=Integer.parseInt("10");
		System.out.println(result);
		
		//2번 방법
		Integer i=new Integer("10");
		int result2=i.intValue();
		
		
		//숫자(100)=>문자열("100")로 바꾸기
		String result3=String.valueOf(100);	
		
		
		
		
		
	}

}
