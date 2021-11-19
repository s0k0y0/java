package p03.type_parameter;

public class ProductEx {
	public static void main(String[] args) {

		Product<tv ,String> p=new Product();//실제 데이터 타입 넣어줌. 클래스이기만 하면 내가 만든거든 남이 만든거든 상관없음
		p.setT(new tv("me"));//p클래스 변수에 tv클래스를 넣겠다
		//new tv()였는데 이건 생성자가 없을때 즉, 값을 넣을 수 없을떄. 지금은 내가 임의적으로 변수와 생성자 만듬. 또한 값의 내용을 출력해주는 toString도 재정의해서 넣음
		p.setM("smart TV");
		System.out.println(p.getM());
		System.out.println(p.getT());
		
		
	}
}

