package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	//ViewApp viewApp = null;
	ViewApp viewApp = new ViewApp(); //또 복사되기 때문에 이러면 안됨.
	
	
	public EventHandler(ViewApp viewApp) {
		this.viewApp = viewApp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp.jbtn) { //NullPointerException
			System.out.println("ㅗㅗㅗ전송1111");
		}
	}

}
