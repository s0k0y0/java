package p02.type;

public class apple {
	
	
	

}

class box<T> {//객체 생성 시 데이터타입을 넣어준다는 뜻
	
//	private Object object;
//
//	public Object getObject() {
//		return object;
//	}
//	
//	public void setObject(Object object) {
//		this.object = object;
//	}

	private T object;
	
	public T getObject() {
		return object;
	}
	
	public void setObject(T object) {
		this.object = object;
	}
	
	@Override
		public String toString() {
			return "사과";
		}
	
}