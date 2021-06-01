package thread.main;

class MyRunnigOne implements Runnable {

	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
}

public class MainThread1_1 {
	
	public static void main(String[] arsg) {
		System.out.println("main start");
		Runnable r1 = new MyRunnigOne();
		Thread th = new Thread(r1);
		th.start();
		System.out.println("main end");
	}
}
