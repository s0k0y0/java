package p08.adstract;

public class abstract_chil extends adstract {

	@Override
	void methodB() {//추상 메소드를 재정의. 강제성으로 오버로딩 해야함
		System.out.println("methodB overriding");
	}

	void print() {
		System.out.println(num);
	}
	
	
	
	
	
}
