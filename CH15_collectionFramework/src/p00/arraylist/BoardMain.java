package p00.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {

		int key;
		Scanner s2 = new Scanner(System.in);
		
		boardSVC b=new boardSVC();

		do {

			System.out.println("|메뉴를 입력하세요|");
			System.out.println("1.게시판 글쓰기 2.글 목록 보기 3.글 삭제 4.종료");
			key = s2.nextInt();

			if (key == 1) {
				System.out.println("게시판 글 작성");
				b.writeArticle(s2);
			}

			if (key == 2) {
				System.out.println("----------------");
				b.listArticles();
			}

			if (key == 3) {

			}

		} while (!(key == 4));

	}

}

class BoardVO {

	private String register;
	private String subject;
	private String email;
	private String content;
	private String passwd;
	
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}

class boardSVC {
	
	
	
	
//	Scanner s1=new Scanner(System.in);
	ArrayList<String> a=new ArrayList<String>();
	BoardVO b=new BoardVO();
	
	public void writeArticle(Scanner s) {
		System.out.print("작성자: ");
		String st1=s.next();
		b.setRegister(st1);
		System.out.print("이메일: ");
		String st2=s.next();
		b.setEmail(st2);
		System.out.print("비밀번호: ");
		String st3=s.next();
		b.setPasswd(st3);
		System.out.print("제목: ");
		String st4=s.next();
		b.setSubject(st4);
		System.out.print("글내용: ");
		String st5=s.next();
		b.setSubject(st5);

	}
	
	private void addArticle(BoardVO bo) {//값을 저장하는 방법을 해결하지 못함!!!!!
		
		a.add(bo.getRegister());//arraylist배열 생성할때 들어가는 데이터타입의 형태만 add()안에 들어올 수 있음. 즉, 변수내용이 String으로 이루어진 변수라서 첨부가능
		a.add(bo.getEmail());
		a.add(bo.getSubject());
		a.add(bo.getContent());
		a.add(bo.getPasswd());
		
		
		
	}
	
	public void listArticles() {
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	

}