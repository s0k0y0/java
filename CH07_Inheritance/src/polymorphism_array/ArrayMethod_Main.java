package polymorphism_array;

public class ArrayMethod_Main {

	public static void main(String[] args) {
		
		//배열의 원래 형태는 String[] str={new String(), new String(), new String()}인 형태!!!!
		//일반 클래스에서 배열을 사용했을때
		String[] str=new String[3];
		str[0]=new String("홍길동1");
		str[1]="홍길동2";
		str[2]="홍길동3";
		
		
		//배열의 다형성(클래스를 배열로 만든 버전)
		ArrayMethod[] a=new ArrayMethod[2];
		a[0]=new ArrayMethodA();
		a[1]=new ArrayMethodB();
		
		for(int i=0; i<a.length; i++) {
			a[i].showSleepStyle();
			
		}
		
		
		
		
		
	}

}
