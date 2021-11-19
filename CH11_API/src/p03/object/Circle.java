package p03.object;

public class Circle {//Circle클래스를 C1으로 인식됨. c1.equals로 c1의 equal메소드 불어옴
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override//개발자가 만든 클래스는 equal판별이 가능하지만 우리가 만든 클래스는 불가능
	public boolean equals(Object a) {//가장 상위 부모 클래스 데이터 타입으로 오브젝트에 딸린 전세꼐의 메소드와 변수 이용가능
		if(a instanceof Circle) {//들어오는 변수가 Circle 클래스가 맞냐? c2 서클클래스 맞음!
			Circle c=(Circle)a;//들어온 변수를 Circle클래스로 강제변환. because a는 더 큰 타입인 object임
			if(this.radius==c.radius) {//위의 true를 시행한 다음. 들어온 변수가 같을 경우 true를 출력한다 c1,c2 10이라는 같은 변수 들어옴 true값 출력
				return true;
			}
		} else {
			System.out.println("강제변환 불가능");
		}
		return super.equals(a);
	}
	
	
	
	

}
