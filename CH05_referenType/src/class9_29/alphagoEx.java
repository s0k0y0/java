package class9_29;

public class alphagoEx {

	public static void main(String[] args) {

		alphago all = new alphago();

		// 변수를 통해 넣고 출력
		all.age = 10;
		System.out.println(all.age);
		all.name = "알파고";
		System.out.println(all.name);

		// 생성자를 통해서 값저장하고 출력
		alphago all2 = new alphago("알파고", 20);
		System.out.println(all2.age);
		System.out.println(all2.name);
		
		// 메소드를 만들어서 값을 넣고 출력
		alphago all3=new alphago();
		all3.setage(20);
		all3.setName("알파고");
		System.out.println(all3.getName());
		System.out.println(all3.getAge());
		
		
		

//		int al = all2.setage(20);
//		System.out.println(al);
//
//		String al2 = all2.setName("알파고");
//		System.out.println(al2);
//		System.out.println(all.setName("알파고"));

	}

}
