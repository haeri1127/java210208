package thread.main;

class MyRunnigTwo implements Runnable {

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

public class MainThread1_2 {
	
	public static void main(String[] arsg) {
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r1 = new MyRunnigTwo();
		Thread th = new Thread(r1);
		th.start();
		try {
			th.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" end");
	}
}
