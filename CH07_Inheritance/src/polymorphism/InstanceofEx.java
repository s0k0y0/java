package polymorphism;

public class InstanceofEx {

	public static void main(String[] args) {
		InstanceofEx st=new InstanceofEx();
		int result=st.add(5,6);
		System.out.println(result);
		
		System.out.println(st instanceof InstanceofEx);
		//형변환이 가능한지의 true & false(1.자신 자신일때, 형변환 가능. 2.자식의 객체는 형변환 가능. #부모일때 자식으로 형변환 불가능but강제 캐스팅으로 가능)
		//즉, 강제로 작은클래스타입에 큰타입을 넣는 casting의 반대인것. 작은 클래스를 큰 클래스로 변환하는 promotion이 가능한지의 여부를 보는게 instanceof.
		//클래스도 강제 변환이 가능하다. 데이터 타입의 casting과 같이 (변환할려는 클래스명)을 앞에 써주면 된다.
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	
	public InstanceofEx() {
		// TODO Auto-generated constructor stub
	}

}
