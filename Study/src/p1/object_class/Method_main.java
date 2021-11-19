package p1.object_class;

class Method {
	
	int x;
	
	
	
	void add(int x) {
		x=x+50;
	}
	void add(Method a) {//변수를 Mehtod라는 클래스 내에 있는 변수나 메소드만을 집어넣겠다.
		a.x=a.x+40;//Method클래스의 전역변수인 x를 불어와서 더한다
	}
	void addNew(Method a) {
		a=new Method();//이 메소드를 호출한다면 들어오는 변수는 method클래스를 객체로 가지게 된다
	}
	void add(int[] b) {
		b[0]++;
	}
	
	
}


public class Method_main {
	public static void main(String[] args) {
		
		Method a=new Method();
		
		a.x=100;
		
		a.add(a.x);
		System.out.println("a.x="+a.x);//변수 저장한 값 그대로 출력
		
		a.add(a);//method클래스만 변수로 올 수 있어 객체생성 변수 삽입.
		System.out.println("a.x="+a.x);//위의 140을 그대로 받아 출력
		
		a.addNew(a);//a는 main밑의 객체생성에서 메소드 안에 새로운 객체생성으로 바뀜. 즉, main이 a이고 method new가 b일 경우 a에서 b로 바뀜
		System.out.println("a.x="+a.x);//그냥 기존거 그대로 물려받음?
		
		a.add(a.x);
//		System.out.println("b[0]="+); 이 배열의 의미를 모르겠음....
		
		
		
		
		
		
		
	}
}
