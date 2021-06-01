package calc.step1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcApp_oneclass extends JFrame implements ActionListener{
	//선언부
	JTextField 	jtf_result 	= null;
	JButton 	jbt_one 	= null;
	JButton		jbt_two 	= null;
	JButton	 	jbt_plus 	= null;
	JButton 	jbt_equals 	= null;
	JButton 	jbt_clear 	= null;
	JPanel	 	jp_pad 		= null;
	String v1 = null;
	String v2 = null;
	String op = null;
	
	//생성자
	public MyCalcApp_oneclass(){
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
		
		jtf_result.addActionListener(this);
		jbt_one.addActionListener(this);
		jbt_two.addActionListener(this);
		jbt_plus.addActionListener(this);
		jbt_equals.addActionListener(this);
		jbt_clear.addActionListener(this);
		
		jp_pad 		= new JPanel(new GridLayout(1,5,2,2));
		jp_pad.add(jbt_one);
		jp_pad.add(jbt_two);
		jp_pad.add(jbt_plus);
		jp_pad.add(jbt_equals);
		jp_pad.add(jbt_clear);
			
		this.getContentPane().add("North",jtf_result);
		this.getContentPane().add("Center",jp_pad);
		
		this.setTitle("계산기클래스하나인거");
		this.setSize(300, 150);
		this.setVisible(true);
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
			String result = MyCalcApp_oneclass.calcurate(v1,v2,op);
			jtf_result.setText(result);
		}else if(obj == jbt_clear) {
			jtf_result.setText("");
		}
	}
	
	public static String calcurate(String sValue1, String sValue2, String sOP) {
		
		double v1 = Double.parseDouble(sValue1);
		double v2 = Double.parseDouble(sValue2);
		
		System.out.println("sValue1 : "+sValue1+"  sValue2 : "+sValue2+"==>"+sOP);
		if(sOP.equals("+")) {
			return ""+(v1+v2);
		}
		else {
			return "error";
		}
	}
	
	public static void main(String[] args) {
		new MyCalcApp_oneclass();   //생성자 호출
	}
}
