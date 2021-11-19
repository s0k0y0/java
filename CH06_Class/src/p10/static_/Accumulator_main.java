package p10.static_;

class Accumulator {

		static int grandTotal;
		int total;
		
		void accumulator(int amount) {
			total+=amount;//total=total+amount
			grandTotal+=amount;	
		}
		
		static int getgrandTotal() {
			return grandTotal;
		}


}


public class Accumulator_main{
	public static void main(String[] args) {
		
		String a1="홍길동";//변수는 주소값과 객체를 생성
		String a2="홍길동";//변수는 a1의 주소값을 가지게 됨
		String a3=new String("홍길동");//new 새로운 객체생성
		String a4=new String("홍길동");//new 새로운 객체생성
		
		Accumulator we1=new Accumulator();//위와 마찬가지로 new와 같이 객체 생성
		Accumulator we2=new Accumulator();
		we1.accumulator(10);
		we2.accumulator(20);
		System.out.println(we1.total);
		System.out.println(Accumulator.grandTotal);//grand는 static 메소드이므로 항상 메모리에 저장되어 있어 다른 클래스에 저장된 변수를 항상 공유함
		System.out.println(we2.total);
		System.out.println(Accumulator.grandTotal);//그렇기에 여러 클래스에서 공유되는 메소드
		//30이 나오는 이유는 처음 10을 넣어 accuum메소드에 있는 total, grand에 10으로 저장됨. 다음 we2에서 20을 넣어 10이 넣어진 그 공유 메소드에 20을 넣어 total,grand는 20이 저장되지만
		//메모리에 있는 static getgrand에는 둘이 합친 값이 저장됨
		
		
		
	}	
}