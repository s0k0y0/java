package p05.type_extends;

public class BoundedType {

	public static void main(String[] args) {
		
		int result=util.compare(10, 20);//뒤가 크면 -1
		System.out.println(result);
		
		int result2=util.compare(4.5, 3.0f);//앞의 변수가 크면 1
		System.out.println(result2);
		
	}

}
