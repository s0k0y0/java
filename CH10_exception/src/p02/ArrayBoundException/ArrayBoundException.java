package p02.ArrayBoundException;

public class ArrayBoundException {
	public static void main(String[] args) {
		
		if(args.length==2) {
			
			String data1=args[0];
			String data2=args[1];
			System.out.println(data1);
			System.out.println(data2);
			
		} else {
			
			System.out.println("실행방법");
			System.out.println("ArrayIndexOutOfBoundsException");//인덱스의 범위를 초과하여 사용할 경우, 배열이 2칸 밖에 없으므로 2칸 이상은 불가능
			System.out.println("       ");
			
			
		}
		
		
		
		
		
		
	}

}
