package class9_29;

public class Array1 {

	public static void main(String[] args) {
		//array:순차적, 중복적, 고정크기, 같은 차입, 자동변동 별도 없는 것.
		//배열은 for문과 거의 같이 사용!!!!!!
		int a=10;
		int[] a1= {10,20,30};//배열도 참조타입으로 주소값이 변수에 들어있음
		int[] a2=new int[]{10,20,30};
		int[] a3=new int[3];
		a3[0]=10;
		a3[1]=20;
		a3[2]=30;
		System.out.println(a3);//a3로 배열의 값이 한번에 출력될 수 없음 a3의 주소값만이 출력됨
		
		//version1
		for(int i=0; i<a3.length; i++) {
			System.out.println(a3[i]);
		}//배열안의 값이 한번에 출력되게 하는 법
		
		//version2
		for(int i:a3) {
			System.out.println(i);
		}
		
		//둘다 참조형 변수로 주소값이 안에 들어있음
		String s1=new String("홍길동");
		String s2="홀길동";
		
		String[] s3={"홍1","홍2","홍3"};
		System.out.println(s3);
		String[] s4= {new String("홀길동"),new String("홀길동2"),new String("홀길동")};//배열 안의 값은 각각의 String클래스 인것 같음. 실용화로 생략하고 적게 된것.
		String[] s5=new String [4];//s4와 같은 상황. 실제 배열은 new String이 있지만 생략되었다는 것
		s5[0]=new String("홍길동");
		s5[1]=new String("홍동");
		
		
	
	
	
	}

}
