package haeri.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;


public class UserList implements ActionListener{
	//선언부
	JFrame jf 					= new JFrame();
	JPanel jp_north 			= new JPanel();
	JPanel jp_center 			= new JPanel();
	JPanel jp_south 			= new JPanel();
	JLabel jlb_userinfo			= null;
	JTable jtb_list 			= null;
	JScrollPane jsp_userlist 	= null;
	JButton jbtn_refresh		= null;
	JButton jbtn_exit			= null;
	
	Vector<String> vlist_cols	= null;
	Vector<String> vlist_Rows 	= null;
	DefaultTableModel dtm 		= null; 
	
	String my_name 			= "(로그인한사람 이름)"; //로그인 창에서 넘어온 이름 넣어야함
	String my_message		= null;

	public UserList() {// 생성자
		vlist_cols = new Vector<>();
		vlist_cols.add("이름");
		vlist_cols.add("ID");
		vlist_cols.add("부서");
		vlist_cols.add("직급");
		vlist_cols.add("접속여부"); //컬럼 추가
		
		dtm = new DefaultTableModel(vlist_cols,0); //테이블 모델 생성
		jtb_list = new JTable(dtm); //테이블 생성
		
		my_message = my_name+"님 환영합니다.";
		
		//Vector<FTCVO> vecVO = new Vector<FTCVO>();
		//vecVO = FTSDao.();
		// 값을 받아온 벡터에서 다시 꺼내서 넣어야함
		// 유효성체크
		
		vlist_Rows = new Vector<String>();
		for(int i=0; i< vlist_cols.size(); i++) {
			//vlist_Rows.add(vecVO.get(i).getFID());
			vlist_Rows.add("채수민");
			vlist_Rows.add("hongsi");
			vlist_Rows.add("영업부");
			vlist_Rows.add("과장");
			vlist_Rows.add("O"); //이거 이제 get으로 데이터 가져오는거 넣어야해
		}
		dtm.addRow(vlist_Rows);
		
		vlist_Rows = new Vector<String>();
		vlist_Rows.add("이유겸");
		vlist_Rows.add("ugm");
		vlist_Rows.add("개발부");
		vlist_Rows.add("차장");
		vlist_Rows.add("X");
		dtm.addRow(vlist_Rows);
		vlist_Rows = new Vector<String>();
		vlist_Rows.add("이름은여기");
		vlist_Rows.add("아이디 여기");
		vlist_Rows.add("겟으로 가져오기");
		vlist_Rows.add("차장");
		vlist_Rows.add("O");
		dtm.addRow(vlist_Rows); 
		
		/////////////////가운데 정렬  -> 구현 완료
		/////////////////dtm이거 수정 안되게
		////////////////더블클릭하면 대화창(파일전송창)나오게
		////////////////온라인테이블 오프라인테이블 나눠서 만들기
		////////////////메뉴툴바
		initDisplay();
	}
	
	//화면
	public void initDisplay() {
		
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jlb_userinfo = new JLabel(my_message);
		jlb_userinfo.setFont(new Font("맑은고딕",Font.BOLD,15));
		jsp_userlist = new JScrollPane(jtb_list);
		jbtn_refresh = new JButton("초대하기");		
		jbtn_exit = new JButton("닫기");		
		
		jbtn_exit.addActionListener(this);
		jbtn_refresh.addActionListener(this);
		
		////가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
	    dtcr.setHorizontalAlignment(SwingConstants.CENTER); // 렌더러의 가로정렬을 CENTER로
	    TableColumnModel tcm = jtb_list.getColumnModel() ; // 정렬할 테이블의 컬럼모델을 가져옴
	    
	    for(int i = 0 ; i < tcm.getColumnCount() ; i++){
	    	tcm.getColumn(i).setCellRenderer(dtcr);
	    } //전체 가운데 정렬
	    
		jp_north.add(jlb_userinfo);
		jp_center.add(jsp_userlist);
		jp_south.add(jbtn_refresh);
		jp_south.add(jbtn_exit);
		
		jf.add("North",jp_north);
		jf.add("Center",jp_center);
		jf.add("South",jp_south);
		
		jf.setTitle(my_name+"님의 목록");
		jf.setBounds(650,200,500,540);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new UserList();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		////새로고침 눌렀을때
		if(obj == jbtn_refresh) {
			System.out.println("초대하기 버튼 누름");
			//누르면 2명이상 선택할 수 있는 패널 새로 만들기 다중선택
		}
		////닫기 눌렀을때
		else if(obj == jbtn_exit) {
			System.out.println("닫기 버튼 누름");
			System.exit(0); //창 없어짐
		}
	}//////////////////end of actionPerformed
	
	
	
	/*
	JFrame jf = new JFrame();
	JPanel jp_north = null;
	JPanel jp_center = null;
	JLabel jlb_userinfo = null;
	JTextField jtf_myname = null;
	JTextField jtf_myID = null;
	JTextField jtf_mydept = null;
	
	String my_message = "";
	
	String cols[] = {"이름","ID","부서","접속여부"};
	String data[][] = null;
	
	//Vector<String> names = null;
		
	
	DefaultTableModel dtm_userlist = new DefaultTableModel(data,cols);
	JTable jtb_userlist = new JTable(dtm_userlist);
	JTableHeader jth = jtb_userlist.getTableHeader();
	JScrollPane jsp_userlist = new JScrollPane(jtb_userlist);
	
	//DB연동
	DBConnectionMgr 		dbMgr 	= DBConnectionMgr.getInstance();
	Connection			 	con 	= null;
	PreparedStatement 		pstmt 	= null;
	ResultSet 				rs 		= null;
	
	
	public FTCMainFrom() {//생성자
		names = getFTSDaoList();
		initDisplay();
		
	}

	void initDisplay() {
		
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jp_north = new JPanel();
		jp_center = new JPanel();
		
		String my_name = "장해리"; //////////////////////로그인 한 사람 이름으로 받아야해
		my_message = my_name+"님 환영합니다.";
		jlb_userinfo = new JLabel(my_message);
		
		jp_north.add(jlb_userinfo);
		jp_center.add(jsp_userlist);
		
		jf.add("North",jp_north);
		jf.add("Center",jp_center);
		
		jth.setFont(new Font("맑은고딕",Font.BOLD,15));
		jf.setTitle(my_name+"님의 목록");
		jf.setBounds(650,200,500,570);
		jf.setVisible(true);
	}  
	
	public Vector<String> getFTSDaoList() {
		String FTs[] = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT fname from filemem");
		Vector<String> v = null;
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			v = new Vector<>();
			while(rs.next()) {
				String fname = rs.getString("fname");
				v.add(fname);
			}
			FTs = new String[v.size()];
			v.copyInto(FTs);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		return v;
	}
	
	
*/
	
}
