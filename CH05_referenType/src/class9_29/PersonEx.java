package class9_29;

public class PersonEx {

	public static void main(String[] args) {
		
		Person[] p=new Person[10];
		Person[] p2= {new Person(),new Person(),new Person()};//같은 형태로 10개 있는 것이 위의 있는 배열과 정확히 같음. 위의 경우는 배열의 공간만 정해주었깅 11번과 같은 공간 안의 내용(초기화)을 작성해줘야 함
		
		for(int i=0; i<p.length; i++) {
			p[i]=new Person();//배열에 빈 공간이 들어간다는 뜻->{"","","",""....}이와 같이 빈 공간 10개가 존재한다
			p[i].name="홍길동"+i;//method를 만든이유 동일한 배열로 각각의 name과 age를 만들어서 사용하기 위해
			p[i].age=30+i;//배열 인스턴스면 무조건 메소드를 가져올땨 배열[]도 표시해줘야함.
			
			System.out.println(p[i].name+"의 나이는 "+p[i].age+"입니다.");
		}
		
		
		System.out.println("--------------------------");
		for(int i=0; i<p.length; i++) {
			p[i]=new Person("홍길동"+i,30+i);
			System.out.println(p[i].name+"의 나이는 "+p[i].age+"입니다.");
		}
		
		
		
		System.out.println("--------------------------");
		//method없이 그냥 배열로만 내갸 만들어본거
		int[] p3=new int[10];
		int[] p4=new int[10];
		
		for(int i=0; i<p3.length; i++) {
			p3[i]=i;
			p4[i]=30+i;
			
			System.out.println("홍길동"+p3[i]+"의 나이는 "+p4[i]+"입니다.");
		}
		
		System.out.println("--------------------------");//향상된 for으로 작성
		int i=0;
		for(Person a:p) {
			a=new Person();
			a.name="홍길동"+i;//변수에 내용을 넣어줌
			a.age=30+i;
			i++;
			System.out.println(a.name+"의 나이는"+a.age+"입니다.");
		}
		
		int j=0;
		for(Person a:p) {
			a=new Person("홍길동"+j, 30+j);
			j++;
			System.out.println(a.name+"의 나이는"+a.age+"입니다.");
		}
		
		
		String str=new String("앞파고");//알파고가 뜸
		System.out.println(str);
	
		Person sin=new Person("알파고");//주소값이 뜸
		System.out.println(sin.toString());
		

	}

}
