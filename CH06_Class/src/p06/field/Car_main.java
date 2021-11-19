package p06.field;

class Car {
	//1.field==전역변수:객체의 데이터가 저장되는 곳. 값을 저장하는 곳
	int a;//메모리 즉, cpu에 불러오기 위해 반드시 객체 생성해야함
	static double b;//static :이미 cpu에 저장되어 있음 
	
	
	//2.constructor:객체 생성시 초기값 저장 용도. 객체 생성과 함께 변수값도 만들어 낼 수 있는 기능의 method
	public Car(int a) {//static은 constructor에 포함되지 않음. 그냥 클래스를 통해 바로 불러낼 수 있기에?
		super();//부모의 constructor를 불러온다는 의미
		this.a = a;
	}
	
	//생성자 메소드는 반환형 타입이 없고 클래스 이름과 똑같음	
	
	//3.method:객체의 동작에 해당하는 실행 블록. 그냥 갖가지 기능을 만들어 내는 용도
	void add(){
		float f;//method 안에서는 반드시 변수를 초기화(변수저장)해줘야 함 선언만 해서는 안됨
		System.out.println(a+b);
	}
	
	
	//4.초기화 블럭:최초 실행.객체 생성 시 가장 먼저 실행하도록 기능함. 괄호 앞에 아무것도 안 붇은 것. static초기화는 프로그램 실행 가장 먼저 한번만 수행됨 
	{
		System.out.println("인스턴스 초기화 블럭");//해당 클래스의 객체를 생성할 때마다 실행됨
	
	}

	static {
		System.out.println("static 초기화 블럭");//해당 클래스의 객체가 가장 먼저 생성될 때, 그때 단 한번만 수행됨. 모든 class 내용 중 가장 먼저 출력됨
	}
	
}



public class Car_main{//실행 클래스의 이름과 파일의 이름이 같아야지 값이 출력되는 것 같음. 즉, 실행 클래스를 public main class로 두어야함
	
	public static void main(String[] args) {
		
		Car.b=5;
		Car all=new Car(5);//전역변수 this.a에 5가 저장됨
		all.add(); 
		
		Car all2=new Car(10);//static 블럭은 실행되지 않음
		
		
		
		
		
		
		
		
		
		
		
	}	
}