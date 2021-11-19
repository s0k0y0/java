package p05.Driver;

public class Driver {
	public void drive(vehicle v) {//파라미터 변수로 최상위 인터페이스의 변수나 메소드만 넣겠다
		v.run();
		
		if(v instanceof Bus) {//만약 입력된 변수가 Bus와 같다면? v에 t,b가 저장되는 것
			Bus b=(Bus)v;//Bus로 강제 변환하도록 한다
			b.check();//check요금 실행해준다
		}
		v.run();//버스와 택시의 run달린다 실행해준다
	}
}
