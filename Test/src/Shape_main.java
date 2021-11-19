
class Shape {
	
	public void draw() {
		System.out.println("그린다");
	}
}


class Circle extends Shape {
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("원을 그린다");
	}
}

class Rectangle extends Shape {
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("사각형을 그린다");
	}
}
class Triangle extends Shape {
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("삼각형을 그린다");
	}
}

public class Shape_main{
	public static void main(String[] args) {
		
		Shape[] a=new Shape[3];
		a[0]=new Circle();
		a[1]=new Rectangle();
		a[2]=new Triangle();
		
		for(int i=0; i<a.length; i++){
			a[i].draw();
		}
	}
}
