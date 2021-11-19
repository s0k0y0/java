package p04.method;

public class Util {
	
	public static<T> box<T> boxing(T t){//generic method: static<T>과 같이 파라미터 타입을 표시해주는 것
		box<T> b=new box<T>();
		b.setObject(t);
		return b;
	}

	
}
