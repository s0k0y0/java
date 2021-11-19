package p07.parentInterface;

public class parentInter_sub  {

	public static void main(String[] args) {
		
	
	System.out.println("자식1의 익명구현객체 생성");	
		
	
	childInterface we1=new childInterface() {//익명구현객체(이름이 없는 객체로 이름만 없지 객체와 똑같이 변수를 통해 해당 인터페이스의 메소드나 변수를 불러올 수 있다)
		
		@Override
		public void method1() {
		
		}
		@Override
		public void method3() {
			System.out.println("자식1:overriding ver");
		}
	};
	
	we1.method1();//1.부모 객체이지만 상속받았음 2.추상메소드라서 오버라이딩됨/부모 소속
	we1.method2();//부모 메소드                                   /부모 소속
	we1.method3();//원래 자식개체인해 인터페이스 자체 생성으로 인해 오버라이딩?. 추상 메소드는 자식객체를 만들어 몸통을 붙여주지 않는 이상 전부 오버라이딩 되는 것 같음
	                                                           //자식 소속
	
	
	
	System.out.println("자식2의 익명구현객체 생성");	
	
		
	childInterface2 we2=new childInterface2() {
		
		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
	};	
	
	
	we2.method1();//부모 추상 메소드 위의 오버라이딩해서 호출          /부모 소속
	we2.method2();//부모 메소드를 자식객체에서 오버라이딩 된거 가져온거  /자식 소속
	we2.method3();//자식2의 메소드                              /자식 소속
	
	
	System.out.println("자식2의 익명구현객체 생성");	
	
	
	childInterface3 we3=new childInterface3() {
		
		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void method2() {
			// TODO Auto-generated method stub
			
		}
	};
	
	we3.method1();//부모의 추상메소드 오버라이딩해서 가져옴       /부모 소속
	we3.method2();//2는 부모의 디폴트 메소드를 추상메소드로 오버라이딩해서 다시한번 오버라이딩됨 /자식 소속
	we3.method3();//자식 추상메소드라서 오버라이딩함            /자식 소속

	
	
	

	
	}	
}
