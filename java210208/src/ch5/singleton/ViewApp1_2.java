package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewApp1_2 implements ActionListener {
	//setSize하기 전에 인스턴스화를 하였다.
	JFrame jf = new JFrame();
	//인스턴스화를 분리해서 할 수도 있다.
	//이럴 경우 어떤 차이가 있나요?
	JFrame jf2 = null;
	JButton jbtn = null;
	
	public void initDisplay() {
		jf2 = new JFrame();
		//jbtn = new JButton();
		//jbtn.setText("전송");
		jbtn = new JButton("전송");
		//이벤트 소스와 이ㅔㄴ트 처리를 담당하는 클래스를 연결해주어야 한다.
		//이벤트 처리를 담당하는 클래스를 이벤트 핸들러 클래스라고 한다.
		//이벤트 처리를 담당하는 클래스는 반드시 actionPerformed라는
		//메소드를 오버라이딩 해야 한다.
		jbtn.addActionListener(this);
		//이벤트 처리 메소드가 외부에 있을 때는
		//ViewAppEvent ve = new ViewAppEvent();
		//jbtn.addActionListener(ve);//시점의 문제를 당할 수 있다. -문제 해결능력
		//생성된 버튼을 JFramedml 북쪽에 배치해본다.
		jf2.add("North",jbtn);
		jf2.setSize(300, 400);
		jf2.setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewApp1_2 va = new ViewApp1_2();
		va.initDisplay();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//너 전송버튼 누른거야?
		//ae.getSource()는 이벤트가 일어난 버튼의 주소번지를 반환해주는 메소드이다.
		if(ae.getSource()==jbtn) {
			System.out.println("전송버튼 호출 성공");
		}
		
	}

}
