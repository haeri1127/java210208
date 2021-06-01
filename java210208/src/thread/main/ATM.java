package thread.main;

public class ATM extends Thread {
	private int depositedMoney=10000;
	public void run() {//여기다가 하면 들어오지도 못한
		synchronized (this) { //여기다가 하는 것이 합리적, 효율적
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				withDraw(1000);
			}////////////end of for
		}////////////////end of synchronized
	}////////////////////end of run
	
	private void withDraw(int howMuch) {
		if(depositedMoney>0) {
			depositedMoney-=howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("잔액 : %,d 원 %n",depositedMoney);
		}else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("잔액이 부족합니다..");
		}
	}//////////////////end of withDraw

}
