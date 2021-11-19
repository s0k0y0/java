package Exercise;

public class number3_134 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0){
			sum=sum+i;
			}	
		System.out.println(sum);
		}
	
	
			
		while(true) {
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			int sum1=a+b;
			System.out.println(a+","+b);
				if(sum1==5) {
					break;
				} 
			System.out.println(a+","+b);
			}
		
		
		
		
		
		
		int x;
		int y;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++ ) {
				if(60==(4*x)+(5*y)) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
		
		
		
		for(int g=1; g<=5; g++) {
			for(int d=1; d<=g; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}		
}
