package p04.syn_method2;

public class mainThreadEx {

	public static void main(String[] args) {
		
		
		calculator c=new calculator();
		
		User1 t1=new User1();
		User2 t2=new User2();
		
		t2.setC(c);
		t2.start();
		
		t1.setC(c);
		t1.start();
		
		
		
		
		
		
		
		

	}
	

}
