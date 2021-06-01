package book.ch8;

public class Sub extends Super {

	public Sub() {
		System.out.println("Sub() 디폴트 생성자 호출");
	}
	public Sub(String title) {
		System.out.println("Sub(String) 호출");
		this.title = title;
	}
	@Override  //여기 쓰는건 합법. 왜? 부모를 안거쳤잖아
	public void methodA() {
		System.out.println("Sub methodA 호출");
	}
	//  @Override  여기 쓰는건 불법.
	public void methodA(int x) {
		System.out.println("Sub methodA(int) 호출");
	}
	public void methodB() {
		System.out.println("Sub methodB 호출");
	}
	
}
