package p05.Driver;

public class DriverEx {
	public static void main(String[] args) {
		Driver we1=new Driver();
		Bus b=new Bus();
		Taxi t=new Taxi();//각각의 모든 객체 생성 
				
		we1.drive(t);//드라이브 클래스의 드리브 메소드를 불러주었음. 최상위 클래스 비클의 소속된 모든 변수와 메소드가 올 수 있으므로 버스와 택시의 객체가 들어올 수 있음
		
		System.out.println("-----------------");
		we1.drive(b);//taxi는 형제관계라서 bus로 인스턴스오브할 수 없지만 bus자기 자신이므로 instanceof가능 
		
//		vehicle we2=new Bus(); Bus의 check메소드를 사용할 수 없을 경우
//		Bus a=(Bus) we2;
//		a.check();
		
		
	}
}
