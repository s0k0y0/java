package p03.for_whild;

public class breakk {

	public static void main(String[] args) {
		
		while(true) {//조건을 true로 했기 때문에 조건을 어기는 범위 자체가 존재하지 않아 계속해서 반복 실행됨. 이럴때 강제로 종료하기 위해 break; 사용
			int num=(int)(Math.random()*6+1);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		
		
		
		

	}

}
