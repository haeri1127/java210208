package com.onj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class MyCalcEventHandler implements ActionListener{
	private JTextField jtf_result = null;	
	private JButton jbt_one = null;	
	private JButton jbt_two = null;	
	private JButton jbt_plus = null;	
	private JButton jbt_equals = null; 	
	private JButton jbt_clear = null; 	
	String v1 = "";	
	String v2 = "";	
	String op = "";	
	
	public MyCalcEventHandler() {
		
	}
	
	public MyCalcEventHandler(JTextField jtf_result, JButton jbt_one
			 				 ,JButton jbt_two,JButton jbt_plus
			 				 ,JButton jbt_equals,JButton jbt_clear) {
		this.jtf_result = jtf_result;
		this.jbt_one = jbt_one;
		this.jbt_two = jbt_two;
		this.jbt_plus = jbt_plus;
		this.jbt_equals = jbt_equals;
		this.jbt_clear = jbt_clear;
		//리턴타입이 없는데 ()괄호가 있다??? 무족권 생성자 반환타입 없는데 괄호 있다 무족권~~~ 셍성자
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		
		if(obj == jbt_one) {
			jtf_result.setText(jtf_result.getText()+"1"); //set계속 바뀌는거, append 뒤에 붙이는거
		}else if(obj == jbt_two) {
			jtf_result.setText(jtf_result.getText()+"2");
		}else if(obj == jbt_plus) {
			v1 = jtf_result.getText();
			System.out.println("v1:"+v1 +"-> v2 : "+v2+" op : "+op);
			op = "+";
			jtf_result.setText("");
		}else if(obj == jbt_equals) {
			v2 = jtf_result.getText();
			String result = MyCalcurate.calcurate(v1,v2,op);
			jtf_result.setText(result);
		}else if(obj == jbt_clear) {
			jtf_result.setText("");
		}
	}
	

}
