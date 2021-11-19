package p03.type_parameter;

public class Product<T,M> {//데이터 타입 넣을 예정임 표시
	
	private T t;
	private M m;
	
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	
	
}

class tv{
	
	public String you;

	public tv(String you) {
		super();
		this.you = you;
	}
	
	@Override
	public String toString() {
		return you;
	}
	
	
}