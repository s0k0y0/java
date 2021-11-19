package p04.Calculator;

public class ComputerEx {

	public static void main(String[] args) {
		int r=10;
		
		Calculator c1=new Calculator();//부모 객체 생성
		System.out.println(c1.areaCircle(r));
		
		Computer c2=new Computer();//자식 객체 생성
		System.out.println(c2.areaCircle(r));

	}

}
