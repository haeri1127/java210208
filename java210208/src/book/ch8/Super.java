package book.ch8;

public class Super {
	
	String title = null;
	
	public Super() {
		System.out.println("Super() 디폴트 생성자 호출");
	}
	public Super(String title) {
		System.out.println("Super(String) 호출");
		this.title = title;
	}
	public void methodA() {
		System.out.println("Super methodA호출");
	}
	
}
