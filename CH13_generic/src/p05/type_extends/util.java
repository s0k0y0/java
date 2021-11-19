package p05.type_extends;

public class util {
	
	//T:는 넘버클래스에 포함된 더블클래스, 인티저클래스, float, short등 자식 클래스를 모두 쓸 수 있음
	public static<T extends Number> int compare(T t1, T t2) {
		
		double d1=t1.doubleValue();
		double d2=t2.doubleValue();//데이터 타입이 T이므로 T에 속한 모든 클래스를 쓸 수 있게됨.
		
		return Double.compare(d1, d2);//이 메소드가 아니라 더블 클래스에 있는 compare메소드 리턴. 둘의 변수를 비교해서 숫자로 차이 나타내줌
		
		
		
	}
}
