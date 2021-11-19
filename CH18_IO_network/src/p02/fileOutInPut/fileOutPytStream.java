package p02.fileOutInPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutPytStream {
	public static void main(String[] args) {
		
		FileOutputStream f=null;
		
		try {
			
			f=new FileOutputStream("fos.dat");//output:파일에다가 기록을 하겠다
			
			byte[] arr= {0,1,2,3,4};//outStream은 byte,integer만 입력할 수 있음.
			
			for(int i=0; i<arr.length; i++) {
				f.write(arr[i]);//하나읽고 저장하고 하나읽고 저장하고를 반복하겠다
			}
				
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 만들 수 없음");
		} catch (IOException e) {
			
		}finally {
			try {
				f.close();
			} catch (IOException e) {
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
