package ch5.singleton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewApp2{
	//setSize하기 전에 인스턴스화를 하였다.
	JFrame jf = new JFrame();
	JFrame jf2 = null;
	JButton jbtn = null;
	
	public void initDisplay() {
		jf2 = new JFrame();
		//디폴트 생성자는 제공해주지만 파라미터를 갖는 생성자는 제공되지 않습니다.
		EventHandler2 eh = new EventHandler2(null); //null을 넣으면 null이 넘어가고
		//이 메소드는 호출 되나요?
		//너 실행문이야?
		jbtn = new JButton("전송");
		jbtn.addActionListener(eh);//////////이 라인이 jbtn = new JButton("전송"); 윗줄에 온다면 jbtn은 null. 병원 아직 안지어졌어.
		jf2.add("North",jbtn);
		jf2.setSize(300, 400);
		jf2.setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewApp2 va = new ViewApp2();
		va.initDisplay();
	}
	
}
