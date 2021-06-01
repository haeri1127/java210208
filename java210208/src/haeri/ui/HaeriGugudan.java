package haeri.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HaeriGugudan extends JFrame {
	//선언부
	JPanel jp_top 		= new JPanel();
	JPanel jp_mid 		= new JPanel();
	JPanel jp_bot 		= new JPanel();
	
	
	//JButton jbtn_result = new JButton("아 버튼말고 결과 보여줘야하는데 어캐해야하지 ㅅㅂ");
	JTextArea jta_display = null;
	
	
	JButton jbtns_num[] = new JButton[12];//방만 12개 주기
	JButton jbtn_num = null;
	String gugudan_num[] = {"1","2","3","4","5","6","7","8","9","리셋","0","지우기"}; 
	
	
	JButton jbtn_plus 	= new JButton("+");
	JButton jbtn_min 	= new JButton("-");
	JButton jbtn_multi 	= new JButton("x");
	JButton jbtn_div 	= new JButton("%");
	
	

	
	
	//생성부
	public HaeriGugudan() {
	}

	
	
	//화면처리부
	public void initDisplay() {
		
		jta_display = new JTextArea("결과결과");
		jp_top.add(jta_display);
		
		
		
		/////////숫자
		jp_mid.setLayout(new GridLayout(4,3));
		for(int i=0; i<jbtns_num.length;i++) {
			jbtn_num = new JButton(gugudan_num[i]);
			jp_mid.add(jbtn_num);
			jbtns_num[i] = jbtn_num;
		}
		
		////////기호
		jp_bot.setLayout(new GridLayout(1,4));
		jp_bot.add(jbtn_plus);
		jp_bot.add(jbtn_min);
		jp_bot.add(jbtn_multi);
		jp_bot.add(jbtn_div);
		////////////////////바텀 판넬 만들기 끝
		
		this.add("North",jp_top);
		this.add("Center",jp_mid); //그 판넬을 중간에 붙여줘
		this.add("South",jp_bot); //그 판넬을 아래에 붙여줘
		this.setSize(400, 500);
		this.setVisible(true);
		
		
		
	}
	public void gugudanlogic() {
		
		
		
	}
	
	public static void main(String[] args) {

		HaeriGugudan hg = new HaeriGugudan();
		hg.initDisplay();
		
		
	}

	
}
