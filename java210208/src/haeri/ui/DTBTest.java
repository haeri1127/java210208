package haeri.ui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DTBTest {
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTable jt = null;
	JScrollPane jsp = null;
	
	Vector<String> cols = new Vector<>();
	Vector<String> dataRows = null;
	DefaultTableModel dtm = null;
	
	public DTBTest() {
		cols.addElement("이름");
		cols.addElement("ID");
		cols.addElement("부서");
		cols.addElement("접속여부"); //열 추가
		
		dtm = new DefaultTableModel(cols,0); //테이블 모델 생성
		jt = new JTable(dtm); //테이블 생성
		jsp = new JScrollPane(jt);
		jf.add(jsp);
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		dataRows = new Vector<String>();
		dataRows.add("11");
		dataRows.add("11");
		dataRows.add("11");
		dataRows.add("11");
		dtm.addRow(dataRows);;
		
		
		dataRows = new Vector<String>();
		dataRows.add("13");
		dataRows.add("sf");
		dataRows.add("1sgsdg");
		dataRows.add("sgs");
		dtm.addRow(dataRows);;
		
		
	}
	
	public static void main(String[] args) {
		new DTBTest();
	}
	
	
	
	
	
	/*********
	Vector<String> m_rowvec = null;
	Vector<String> m_colvec = null;
	DefaultTableModel model = new DefaultTableModel(m_colvec, m_rowvec);
	JTable m_Table = new JTable(model);
	JScrollPane m_ScrollPane = new JScrollPane(m_Table);
	
	
	DTBTest(){
		
	}

	void initDisplay() {
		
		//m_ScrollPane.setBounds("100,200,200,300");
		jp.add(m_ScrollPane);
		jf.add("Center",jp);
		jf.setTitle("제발");
		jf.setSize(400, 400);
		jf.setVisible(true);

	}
	
	
	public static void main(String[] args) {
		DTBTest dt = new DTBTest();
		
		dt.m_rowvec = new Vector<String>();
		dt.m_rowvec.add("1");
		dt.m_rowvec.add("2");
		dt.m_rowvec.add("3");
		dt.m_rowvec.add("4");
		
		
		//테이블에 col값을 넣기 위한 작업.  
		dt.m_colvec = new Vector<String>(); 
		dt.m_colvec.add("1"); 
		dt.m_colvec.add("1"); 
		dt.m_colvec.add("1"); 
		dt.m_colvec.add("1"); 
		dt.model.addRow(dt.m_colvec);
		dt.m_colvec = new Vector<String>();
		dt.m_colvec.add("2"); 
		dt.m_colvec.add("2"); 
		dt.m_colvec.add("2"); 
		dt.m_colvec.add("2"); 
		dt.model.addRow(dt.m_colvec); //테이블에 값 추가
		
		dt.initDisplay();
		//new DTBTest();
		
	}****/

}
