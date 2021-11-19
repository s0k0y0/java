package p07.string;

public class byteToStringEx {

	public static void main(String[] args) {
		
		byte[] b= {72,101,108,108,111,32,74,97,118,97};
		String we=new String(b);//배열에 담긴 숫자 아스키 코드값이 문자열 코드값으로 변환.(바이트는 아스키코드값을 대상으로 한 데이터타입인듯)
		System.out.println(we);
		
		String we2=new String(b,6,4);//6번부터 4글자 출력해라
		System.out.println(we2);
		
		System.out.println(we.charAt(0));//하나의 글자를 뽑아올때 쓰임
		
		int result=Integer.SIZE;
		System.out.println("\n"+result);//32byte다?
		
		
		
		
	}

}
