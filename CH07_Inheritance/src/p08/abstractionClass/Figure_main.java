package p08.abstractionClass;

public class Figure_main {
	
	public static void main(String[] args) {
		
		
		//다형성1
		Figure we=new Tetra();//팝업창에 부모 클래스 소속 메소드로 떠도 자식클래스의 오버라이딩이 실행된다
		we.area(4, 5);
		
		Figure we2=new traiangle();
		we2.area(12, 5);

		
		
		//다형성2
		Figure we3=new traiangle();//시간이 지나면 옛날 건 사라지고 부모 변수가 새로운 트라이앵글 자식을 가리킨다. 메모리 관리가 됨
		we3.area(4, 5);
		we3=new traiangle();
		we.area(12, 5);
				
		
		
	}
	
	
	
	

}
