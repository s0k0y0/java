package p02.fileOutInPut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputStreamEx {
	public static void main(String[] args) {

		FileInputStream f=null;
		
		try {
			f=new FileInputStream("fos.dat");
			
			byte[] arr=new byte[16];//출력할 수 있는 byte크기를 정해줘야 함
			
			while(true) {
				int f1=f.read(arr);
				if(f1<0) {//0보다 작게되면 더이상 파일안에 읽은 거리가 없다는 뜻
					break;
				}
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);//숫자는 한 바이트?라서 정상적으로 출력된거?ㅠㅜ근데 out에서는 숫자가 정상적으로 표기가 안됐는데...하...
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 불러오기 불가능");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				f.close();
			} catch (IOException e) {
				System.out.println("파일 종료 불가능");
			}
		}
		
		
		
		
		
	}

}
