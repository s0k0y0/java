package p08.adstract;

//public class:설계도
//abstract class: 미완성 설계도. because 자식클래스를 만들어 추상 메소드의 바디를 추가로 만들어줘야 하므로. 추상 클래스는 객체 생성 불가!!!!
public abstract class adstract {//public, default,final, abstract

	int num=3;
	
	
	//constructor overloading
	public adstract() {
		
	}

	public adstract(int num) {
		this.num = num;
	}
	
	public void methodA() {
		System.out.println("methodA");
	}
	
	abstract void methodB();//추상메소드:선언만 하고 메소드 바디는 적지 않는 것. 자식 클래스에서 상속을 해서 오버로딩으로 메소드 바디를 만들어줘야 함
	//인터페이스가 아닌 일반 클래스에서 추상메소드를 쓸 경우, 1.앞에 abstract표시 2.abstract class로 변환해사 사용 가능
	//추상 메소드를 쓰는 이유는 여러 자식에서 추상 메소드를 오버로딩 할 경우 이를 다형성으로 객체 생성해서 부모의 눈으로 자식의 객체를 맘대로 이용할 수 있게 됨
	
	
	
}
