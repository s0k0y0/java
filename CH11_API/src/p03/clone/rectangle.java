package p03.clone;

public class rectangle implements Cloneable {//clone은 cloneable의 추상메소드이므로 상속해야함

	int width;
	int height;

	public rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {//직접 만든 클래스는 만드는 clone을 재정의 해줘야 함
		return super.clone();//object clone use
	}

}
