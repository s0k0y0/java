package p00.arraylist;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetTest {
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>();
		
				if(t.add("korea")) {
					System.out.println("first korea add success");
					
				} else {
					System.out.println("fires korea add fail");
				}
				
				if(t.add("japan")) {
					System.out.println("first japan add success");
					
				} else {
					System.out.println("fires japan add fail");
				}
				
				if(t.add("america")) {
					System.out.println("first america add success");
					
				} else {
					System.out.println("fires america add fail");
				}
				
				if(t.add("britain")) {
					System.out.println("first britain add success");
					
				} else {
					System.out.println("fires britain add fail");
				}
				
				if(t.add("korea")) {
					System.out.println("second korea add success");
					
				} else {
					System.out.println("second korea add fail");
				}
		
				System.out.println("출력방법1");
				
				Iterator<String> i=t.iterator();//list 출력방법 중 하나
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				

		
		
		
		
	}

}
