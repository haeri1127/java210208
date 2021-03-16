package ch5.singleton;

import javax.swing.JFrame;

public class ViewAppTest{
	//setSize하기 전에 인스턴스화를 하였다.
	//JFrame jf = new JFrame();
	JFrame jf2 = null;
	String titlename = "해리의 창만들기1";
	String titlename2 = "해리의 창만들기2";
	
	
	public void initDisplay(String x) {
		jf2 = new JFrame();
		jf2.setTitle(x);
		jf2.setSize(300, 400);
		jf2.setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewAppTest va = new ViewAppTest();
		va.initDisplay(va.titlename);
		va.initDisplay(va.titlename2);
	}
	
}
