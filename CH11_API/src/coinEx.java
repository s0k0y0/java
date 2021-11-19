
public class coinEx {

	public static void main(String[] args) {
		int money;
		
		int[] coinUnit= {50000,10000,5000,1000};
		
//		for(int i=0; i<coinUnit.length; i++) {
//			money=498000;
//			int result=money/coinUnit[i];
//			System.out.println(result);
//		}
		
		
		money=498000;
		for(int i=0; i<coinUnit.length; i++) {
			int result=money/coinUnit[i];
			
			money=money-(result*coinUnit[i]);
			System.out.println(coinUnit[i]+":"+result);
		}
		
		
		

	}

}
