package class9_30;

public class DogEx {

	public static void main(String[] args) {
		
		//배열 만들기
		Dog[] D=new Dog[3];
		//배열에 내용 저장
		D[0]=new Dog("풍산개","풍산");
		D[1]=new Dog("진돋개","진도");
		D[2]=new Dog("워리","불독");//근데 이게 instance로 만든건가??그래서 타클래스에 가서 method에 입력값이 일력된거야?
		
		//반복문을 통한 출력
		for(int i=0; i<D.length; i++) {
			System.out.println(D[i].name+D[i].kind);
		}
		
		System.out.println("-----향상된 For문-----");
//		int i=0;
		for(Dog a:D) {
//			a=new Dog();
//			i++;
			System.out.println(a.name+a.kind);
		}
		
		for(Dog a:D) {
			System.out.println(a.toString());
		}//a만 적었을 때누 a의 주소값이 출력되었지만 toString으로 인해 a가 가지고 있는 입력값을 그대로 나타내주게 됨
		
		
		
		
		

	}

}
