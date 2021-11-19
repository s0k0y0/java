package p01.basic;

import java.util.Scanner;

public class Student_main {
	public static void main(String[] args) {
		
		//학생 수를 입력받기
		Scanner sc=new Scanner(System.in);
		
		
		
		//배열을 생성하고 크기 정하기
		Student[] s=new Student[3];
		
		for(int i=0; i<s.length; i++) {
			s[i]=new Student();
			
			System.out.println("name: ");
			String name=sc.next();
			s[i].setName(name);
			
			System.out.println("age: ");
			int age=sc.nextInt();
			s[i].setAge(age);
			
			System.out.println("phone: ");
			String Number=sc.next();
			s[i].setNum(Number);
			
			System.out.println("favorite: ");
			String skill=sc.next();
			s[i].setSkill(skill);
			
			System.out.println("address: ");
			String address=sc.next();
			s[i].setAddress(address);
			
			s[i].print();
		}
		
		String num=sc.nextLine();
		
		
		//학생정보 입력
		
		
		
		
		
	}
}
