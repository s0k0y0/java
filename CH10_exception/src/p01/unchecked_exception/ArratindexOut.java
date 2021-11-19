package p01.unchecked_exception;

public class ArratindexOut {
	
	
	//arguments에 값 넣어보기
	public static void main(String[] args) {//arguments는 String타입으로 모두 문자열로 인식
		if(args.length==2) {
			String data1=args[0];
			String data2=args[1];
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println((data1+data2));//문자열로 인식
		}else {
			System.out.println("ArrayIndexOutodBoundException");
		}
		
		
	}
	
	
	
	
}
