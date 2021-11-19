package p03.object;

public class MamberEx {
	public static void main(String[] args) {

		Member we1=new Member("sky");
		Member we2=new Member("sky");
		Member we3=new Member("Ground");
		
		if(we1.equals(we2)) {
			System.out.println("equal");
		} else {
			System.out.println("diffrent");
		}
		
		System.out.println("---------------");
		
		if(we1.equals(we3)) {
			System.out.println("equal");
		} else {
			System.out.println("diffrent");
		}
		
		System.out.println("-------------");
		
		if(we2.equals(we3)) {
			System.out.println("equal");
		} else {
			System.out.println("diffrent");
		}
		
		//before equal overriding:all diffrent 
		
		
		
	}

}
