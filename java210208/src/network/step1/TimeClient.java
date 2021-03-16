package network.step1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;

import book.ch5.AddressBook2;

public class TimeClient extends Thread {
	String timeStr = null;
	JLabel jlb_time = null;  //이거 퍼블릭
	TimeClient(){
	}
	public TimeClient(JLabel jlb_time){ //패키지가 다를때 접근하려면 public사용
		this.jlb_time=jlb_time;
	}
	@Override
	public void run() {//콜백메소드 - 사용자가 아니라 시스템 레벨에서 자동호출되는 메소드임.
		System.out.println("run 호출 성공");
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader br = null;
		boolean isFlag = false;
		try {
			socket = new Socket("192.168.0.38",1127); //local port 7375 //21은 짝궁 아이피, 포트번호는 1127로 똑같이 하셨음 나는 38
			out = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//InputStream is = new InputStreamReader(socket.getInputStream()));
			//내 소켓에 대한 포트번호 따로 할당
			while(!isFlag) {
				while((timeStr=br.readLine())!=null) {
					System.out.println(timeStr);
					jlb_time.setText(timeStr); //디폴트 생성자를 경유하므로 jlt_time은 null이다.
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("넌 누구...");
					}
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*
	 */
	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();//run메소드 호출해줌
	}
	
}
