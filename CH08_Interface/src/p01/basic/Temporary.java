package p01.basic;

public class Temporary {
	static double nu=2;
	int num=20;
	String name="홍길동";
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	double add2(int a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {//자바실행하면 무조선 main부터 시작하도록 설정됨
		
		Temporary s=new Temporary();
		System.out.println(s.name);
		System.out.println(s.num);
		double AA=Temporary.nu;
		System.out.println(AA);
		s.add(6, 9);
		s.add2(6, 5);
		
	}
}
