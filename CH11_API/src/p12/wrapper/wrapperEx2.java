package p12.wrapper;

public class wrapperEx2 {

	public static void main(String[] args) {
		
		int i=new Integer("100").intValue();//문자열 100을 숫자로 바꿔서 변수에 저장해라
		Integer i2=Integer.valueOf("100");//문자열 100을 Integer클래스 타입으로 바꿔서 변수에 저장해라
		System.out.println(i+"/"+i2);
		
		int i3=Integer.parseInt("100", 2);//문자열100을 2진수로 표현해서 기본 타입에 저장한다
		System.out.println(i3);
		
		String s="3.14f";
		float i4=Float.valueOf(s);
		float i5=Float.parseFloat(s);
		System.out.println(i4+"/"+i5);
		
		//딱히 박싱과 언박싱의 기능이 있는게 아니라 타입변환 현상을 명명하는 것 같음
		

	}

}
