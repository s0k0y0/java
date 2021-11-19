package p05.System;

public class systemEx2 {

	public static void main(String[] args) {
		int[] we1= {77,82,99,100,-27,0,42,-35,60,72};
		int[] we2= {7,0,3,0,-1,2,11,5,0,9};

		for(int i=0; i<10; i++) {
			try {
				int result=we1[i]/we2[i];
				System.out.println(result);
				System.out.printf("%d/%d=%d%n",we1[i],we2[i],result);
			} catch (ArithmeticException e) {
//				System.out.println("index["+i+"]"+" 0으로 나눌 수 없다");
				System.err.println("index["+i+"]"+" 0으로 나눌 수 없다");
			}
		}
		
		
		
		
	}

}
