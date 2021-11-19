package last.Q3;

public class soundableEx {

	private static void printSound(soundable s) {//진짜 기이한데 매개변수안에 클래스 타읍을 넣으면 그 메소드 안에서 데이터타입 클래스의 메소드를 불러올 수 있는 것 같음
		System.out.println(s.sound());
	}
	
	
	
	public static void main(String[] args) {
		
		cat c=new cat();
		dog d=new dog();
	
		printSound(c);
		printSound(d);
		
		
		
		
		
		

	}

}
