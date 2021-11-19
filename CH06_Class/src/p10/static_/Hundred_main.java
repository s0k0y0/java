package p10.static_;

class Hundred {

	static int arr[];
	
	//가장 먼저 클래스의 객체를 생성할때 단 한번만 실행됨
	static {
		arr=new int[100];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
			System.out.println(arr[i]);//배열은 배열 자체를 그대로 써서 출력하면 주소값이 아닌 배열의 담긴 값이 그대로 나옴
		}
	}
	
	
	//클래스의 객체를 생성할때마다 실행됨
	{
		
	}

}

public class Hundred_main {

	public static void main(String[] args) {
		Hundred we=new Hundred();
		System.out.println(we.arr[35]);
		
	}

}
