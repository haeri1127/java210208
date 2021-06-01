package book.ch6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassGubun extends JFrame{
	JButton jbtn_search = new JButton("조회");
	JButton jbtn_exit = new JButton("종료");
	ClassGubun cg2 = new ClassGubun();
	public void start() {
		//jbtn_search.addActionListener(cg2.ClassGuBun$1.class);   -->안됨
		jbtn_search.addActionListener(new ActionListener() {
			// 호출(생성자 호출)
			// 생성자-interface -> 단독으로 인스턴스화x
			// 내 안에서 재정의 직접함  @Override
			// 그렇지 않으면 compile error
			@Override                    //↓주입
			public void actionPerformed(ActionEvent e) { //void - 반환타입x
				System.out.println("조회 버튼 호출 성공");
				
			}
			
		});
		jbtn_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나가기 버튼 호출 성공");
			}
			
		});
	}
	public void initDisplay() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jbtn_search);
		this.add(jbtn_exit);
		this.setSize(500, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ClassGubun cg = new ClassGubun();
		cg.start();
		cg.initDisplay();
	}

}
