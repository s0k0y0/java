package p03.for_whild;

public class forstate {

	public static void main(String[] args) {
		// while statement
		
		int i=0;
		while(i<10) {
			i++;//println밑으로 내리면 0이 먼저 출력되면서 하나씩 올라감의 형태로 출력이 먼저인 조건문이 됨. 조건문 안의 작성하는 순서의 영향미침
			System.out.println(i);
		}
		
		int sum=0;
		int ii=1;//조건문 안에 들어가는 변수들은 무조건 변수선언과 초기화를 시켜줘야 하는 것 같음
		while(ii<=100) {
			sum +=ii;//이걸 밑으로 내리면 i가 2부터 시작하게 됨
			ii++;
		}
		System.out.println(sum);
		
		
		
		
		
		

	}

}
