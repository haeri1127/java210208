package com.onj;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcView extends JFrame{
	//선언부   --실행문은 불가능하다
	JTextField 	jtf_result 	= null;
	JButton 	jbt_one 	= null;
	JButton		jbt_two 	= null;
	JButton	 	jbt_plus 	= null;
	JButton 	jbt_equals 	= null;
	JButton 	jbt_clear 	= null;
	JPanel	 	jp_pad 		= null;
	MyCalcEventHandler myEventHandler = null;
	
	//생성자
	public MyCalcView(){
		initDisplay();
	}
	
	//화면 처리부
	public void initDisplay() {
		jtf_result	= new JTextField();
		jtf_result.setHorizontalAlignment(JTextField.RIGHT); //이거 텍스트 오른쪽에 입력하게 하는 그거같은디
		jbt_one		= new JButton("1");
		jbt_two 	= new JButton("2");
		jbt_plus	= new JButton("+");
		jbt_equals 	= new JButton("=");
		jbt_clear 	= new JButton("C");
		
		myEventHandler = new MyCalcEventHandler(jtf_result, jbt_one
				 								,jbt_two, jbt_plus
				 								,jbt_equals, jbt_clear); ////파라미터 뭐 넣을지 생각좀 해라
		jtf_result.addActionListener(myEventHandler);
		jbt_one.addActionListener(myEventHandler);
		jbt_two.addActionListener(myEventHandler);
		jbt_plus.addActionListener(myEventHandler);
		jbt_equals.addActionListener(myEventHandler);
		jbt_clear.addActionListener(myEventHandler);
		
		jp_pad 		= new JPanel(new GridLayout(1,5,2,2));
		jp_pad.add(jbt_one);
		jp_pad.add(jbt_two);
		jp_pad.add(jbt_plus);
		jp_pad.add(jbt_equals);
		jp_pad.add(jbt_clear);
		
		this.getContentPane().add("North",jtf_result);
		this.getContentPane().add("Center",jp_pad);
		
		this.setTitle("계산기");
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyCalcView();   //생성자 호출
	}

}
