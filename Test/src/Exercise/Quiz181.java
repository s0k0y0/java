package Exercise;

public class Quiz181 {

	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for (int a:array) {
			max=Math.max(max, a);
		}
		System.out.println(max);
		
		
		int[][] array2= {{95,86},{83,92,96},{78,83,93,87,88}};
			
		int sum=0;
		double avg=0.0;
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
					sum +=array2[i][j];
					
				}//length어케 줄여야 하나...
			double a=array2[i].length;
			}
		System.out.println(sum);
//		System.out.println(avg);
	
	}		
}

