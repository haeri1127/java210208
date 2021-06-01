package book.ch12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExam1 {
	public void methodA(List<String> list) {//메소드 오버로딩
		System.out.println("methodA(List) 호출");
		
	}
	
	public void methodB(List list) {
		
	}

	public void methodA(Collection<String> list) {//메소드 오버로딩
		System.out.println("methodA(Collection)호출");
		
	}
	
	public void methodA(ArrayList<String> list) {//메소드 오버로딩
		System.out.println("methodA(ArrayList) 호출");
		
	}
	public static void main(String[] args) {
		ListExam1 le = new ListExam1();
		ArrayList<String> al = new ArrayList();
		System.out.println("size는 얼마입니까?   "+al.size()); //0입니다
		al.add("딸기");
		System.out.println("size는 얼마입니까?   "+al.size());
		le.methodA(al);
		le.methodA(al);
		List<String> 		al2 = new ArrayList();
		le.methodA(al2);
		le.methodA(al2);
		le.methodA(al2);
		Collection<String> 	al3 = new ArrayList();
		le.methodA(al3);
		le.methodA(al3);
		le.methodA(al3);
	}

}
