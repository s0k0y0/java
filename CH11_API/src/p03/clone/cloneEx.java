package p03.clone;

import java.util.GregorianCalendar;

public class cloneEx {
	public static void main(String[] args) throws CloneNotSupportedException {//클론을 강제변환해도 예외처리가 나왔는데 왜인진 모르겠음

		
		//1.개발자가 만든 클래스인 경우 곧바로 복제가능
		GregorianCalendar g1=new GregorianCalendar(2021,10,14);
		GregorianCalendar g2=(GregorianCalendar) g1.clone();//개발자가 만든 클래스를 복제하는 형식
		System.out.printf("%tF %n",g1);
		System.out.printf("%tF %n",g2);
		
		//2.우리가 만든 클래스는 곧바로 복제 불가능. 반드시 재정의 해야함
		rectangle r1=new rectangle(10, 5);
		rectangle r2=(rectangle) r1.clone();//오브젝트 클론을 쓰는 거므로 클론을 오브젝트클래스보다 작은 타입인 rectangle 클래스로 강제변환 해줘야 함
		//원본의 값이 같을 경우, 클론의 값도 변하고 주소값까지 클론은 같아진다
		
		System.out.println("r2 height "+r2.height);//똑같이 복제했기 때문에 같은 값이 나와야함
		
		System.out.println("r2 width "+r2.width);
		
		
		
		
		
		
	}
}
