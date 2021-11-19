package p07.myinterface;

public class defualt {

	public static void main(String[] args) {
		myInterface we1=new myClass();
		we1.method1();
		we1.method2();
		
		System.out.println("--------------");
		myInterface we2=new myClassB();//어차피 myclass들은 형제이기때문에 서로의 메솓드를 사용할 수 없어 따로 객체 생성해줘야함
		we2.method1();
		we2.method2();
		
	}

}
