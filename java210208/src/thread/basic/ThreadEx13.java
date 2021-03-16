package thread.basic;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.println("[[[ A스레드 run ]]]");
	}//////////////end of run
}///////////////end of A

//class B extends Thread{
class B implements Runnable{ //이거 추가
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println("[[[ B스레드 run ]]]");
	}//////////////////end of run
}////////////////end of B


public class ThreadEx13 {
	
	static long startTime = 0;
	/*
	 * 33[main thread시작] - 34[3:스레드 로딩 - ready go -> 36[대기중] - 35 - 36[A run call] - 37[B run call]]
	 * 5-6-7(------|||||||---------||||||||||--------------------------)
	 * 15-16-17(|||||||||||||-------|||||||||||||||)
	 * 46
	 */
	public static void main(String[] args) {
		A th1 = new A();
		B th = new B();
		Thread th2 = new Thread(th); //이거 추가
		th1.start();
		th2.start();
		//시간을 계산함.
		startTime = System.currentTimeMillis();
		/*
		 */
		try {
			th1.join(); //th1의 작업이 끝날 때까지 기다린다.
			th2.join(); //th2의 작업이 끝날 떄까지 기다린다.
		} catch (InterruptedException e) {}
		System.out.println("소요시간:"+(System.currentTimeMillis() - ThreadEx13.startTime));
	}///////////end of main

}

