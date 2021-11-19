package p07.Car;

public class DriverEx {

	public static void main(String[] args) {
		Driver s1=new Driver();
		Vehicle s2=new Bus();
		Vehicle s3=new Taxi();
		
		s1.drive(s3);//부모 클래스가 파라미터인 드라이버 클래스의 메소드를 불러온 다음. 부모의 속한 자식들을 파라미터에 넣을 수도 있음:파라미터의 다형성
		s1.drive(s2);
		
		System.out.println("-----------");
		
		Vehicle a1=(Vehicle) s2;//타입변환(그냥 s2.run하면 될걸 왜 타입변환을 하는 거냐고ㅠㅜ)
		Vehicle a2=(Vehicle) s3;
		
		a1.run();
		a2.run();
		
		
	}

}
