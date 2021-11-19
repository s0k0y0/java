package p13.access;

public class privateEx {
	private int pri=10;
	
	//pri=20; private는 맘대로 숫자도 못 바꾸는가봄. 그냥 보안상으로 남들이 접근할 수 없게하기 위하고 메소드의 고정변수로 사용하기 위해 private쓰는 것 같음
	
	 void out () {
		System.out.println(pri);
	}
	
}
