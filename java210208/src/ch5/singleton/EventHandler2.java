package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler2 implements ActionListener {
	//ViewApp viewApp = null;
	ViewApp2 viewApp = new ViewApp2(); //또 복사되기 때문에 이러면 안됨.
	
	public EventHandler2(ViewApp2 viewApp) {
		this.viewApp = viewApp; //여기에 null이 넘어온다면, 아래 if의 viewApp에도 null이 가기 때문에 버튼 누르면 널에러 발생
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp.jbtn) { //NullPointerException
			System.out.println("전송실행완료22222");
		}
	}

}
