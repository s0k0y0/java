package p08.adstract;

public class abstract_main {
	public static void main(String[] args) {

	
	//1.polymorphism
	//만약 자식이 하나더 있다면 그 자식의 오버라이딩 메소드를 we.로 불러낼 수 있음. 즉, 오버라이딩 메소드는 하나의 부모 객체생성으로 여러 작식의 메소드를 불러올 수 있는 거임.
	adstract we=new abstract_chil();
	we.methodA();
	we.methodB();//오버라이딩은 부모로 불러낼 수 있음. 자식만의 메소드를 불러올때 강제변환
	
	abstract_chil child=(abstract_chil)we;
	child.print();
	
	//2.익명:인터페이스와 추상 클래스는 객체 생성을 못하기에 이름없는 객체 생성이란 뜻으로 익명 객체 생성. 역할은 기존 객체 생성과 다르지 않음 
	//실제로는 객체을 생성해서 메모리로 클래스를 불러오는게 아니고 밑에 적힌 오버라이딩 메소는만 메모리로 올린다
	adstract we2=new adstract() {
		
		@Override
		void methodB() {
			// TODO Auto-generated method stub
			
		}
	};
	we2.methodA();
	we2.methodB();
	((abstract_chil) we2).print();//강제변환
	
	
	
	
	
	}
}
