package p1.object_class;

public class variable {
	int mem;
	static int staticv;
	
	public static void main(String[] args) {
		
		
		//객체 생성으로 불러온 버전
		variable we=new variable();
		System.out.println(we.mem);
		System.out.println(we.staticv);
		
		//static으로 불러온 버전
		System.out.println(variable.staticv);
		
		//static으로 초기화해준 버전
		int sta=variable.staticv;
		sta=1;
		System.out.println(sta);
		
		//로컬변수 초기화해준 버전
		int localv;
		localv=0;
		System.out.println(localv);
		
		
	}
	
	
}
