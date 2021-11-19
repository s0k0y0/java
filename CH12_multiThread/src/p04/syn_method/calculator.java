package p04.syn_method;
//동기화:순서를 지켜서 출력하도록 하는 것
//동기화 하는 방법2가지: 1.동기화 메소드 사용(method1) 2.동기화 블럭 방법(method2)

//critical section(=임계영역,공유객체,공유영역):thread들이 여기로 와서 계산이 끝났는지 안끝났는지 변수 바꼈는지 확인?
public class calculator {

	private int memory;

	public int getMemory() {//변수에 들어있는 값 추출
		return memory;
	}
	
	
	public void setMemory(int memory) {//변수에 값 저장
		this.memory = memory;
		
		try {
			Thread.sleep(2000);//원래는 실행 후 2초 뒤에 각각 100과 50이 따로 출력되어야 하는데. 현제 main method 순서상, user2가 출력까지 2초 사이에 뒤의 thread가 실행되서 user1값이 user2 출력값을 차지해버림
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		//현재쓰레드를 찾아서 현재 쓰레드의 이름을 알아내라. currentThread메소드 안에 getname을 불어오는게 아니라 Thread클래스 안에있는 두개의 메소드를 각각불러옴. 어차피 메소드안에는 메소드 중첩 불가능
	}

}
