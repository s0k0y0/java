package p06.String;

public class Circle {
	int radius;
	
	public Circle (int radius) {//파일 이름과 같은 메소드:생성자, 객체 생성 시 초기값을 함께 넣을 수 있는 용도,return 없음
		//super();부모의 기본 생성자를 호출해라, 부모 소속의 전역변수 호출해야 한다는 뜻 같음
		this.radius=radius;//this:현재 클래스라는 뜻. a.adds와 같이 자기자신의 클래스의 이름이 아닌 다른 방식으로 가리켜주는 명령어
	}
		public boolean equals(Object obj){//부모 클래스 Object에 있는 모든 method와 변수 현재는 변수 c2를 넣음 
			if(obj instanceof Circle) {//c2가 Circle과 같냐?
				Circle c=(Circle) obj;//true일 경우, 강제변환 시행한다.
				if(this.radius==c.radius) {//강제변환 후, c1.radius와 c2.radius가 같냐?
					return true;//맞으면 true 도출
				}
			}	
			return false;//다 아니면 다른 객체라는 뜻으로 false를 도출
		}
		
		
		
		
		
}
