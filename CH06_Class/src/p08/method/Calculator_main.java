package p08.method;

class Calculator {
	
	
	//method overloading:method명이 같고, 파라미터의 갯수와 순서, 타입이 약간 다른 것
	//택1.메소드가 반드시 데이터 타입을 가져 return을 하든가 
	//택2.void타입을 가져 return타입이 없어도 되는가 둘중 하나여야함
	void add() {
		System.out.println("add()");
	}
	
	int add(int a, int b) {//메소드가 데이터 타입을 갖게 되면 반드시 return값을 가져야 되는 것 같음
		System.out.println("add()");
		return a+b;
	}
	
	int add(float a, int b) {
		System.out.println("add()");
		return (int)a+b;//더 큰 float타입으로 자동변화 되기에 integer로 강제변환 시켜줌
	}
}


public class Calculator_main{
	public static void main(String[] args) {
		
		Calculator we=new Calculator();
		we.add();
		int result=we.add(1, 2);//변수 생성시 해당 변수는 반드시 반드시 무조건 하나의 데이터 타입을 가져야 함
		System.out.println(result); 
		System.out.println(we.add(2.3f, 2));//float type에 f꼭 써야함
		
	}
}
