package p03.hashcode;

import p03.object.Circle;

public class key {

	public int num;//

	public key(int num) {//3단계:생성자가 반드시 있어야 함
		this.num = num;
	}
	
	
	//자신이 만든 class를 key값으로 쓰기 위한 3단계
	@Override
	public int hashCode() {
		return num;//1단계:key값이 return's num과 같은지 비교한다
	
	}
	
	public boolean equals(Object a) {//2단계:객체 안에 담긴 변수가 같은지 아닌지 파악
		if(a instanceof key) {
			key k=(key)a;
			if(this.num==k.num) {
				return true;
			}
		} else {
			System.out.println("강제변환 불가능");
		}
		return super.equals(a);
	}
	
	//이 3간계를 통해 Key에 들어있는 클래스가 해당 클래스와 일치한지 판별하는 것
	
}
