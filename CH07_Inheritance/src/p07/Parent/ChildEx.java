package p07.Parent;

public class ChildEx {
	public static void main(String[] args) {
		
		Parent str=new Child();
		str.method1();
		str.method2();
		
		Child a=(Child) str;
		a.method3();
		a.B="YYY";
		//a.B("YYY")는 안됨
		
		
		
		
		
	}
}
