
public class Name {

	public static void main(String[] args) {
		
		Person a1=new Person("홍길동", 111);
		Person a2=new Person("홍길동", 222);
		Person a3=new Person("유재석", 111);
		
		if(a1.equals(a2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(a1.equals(a3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(a2.equals(a3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		

	}

}
