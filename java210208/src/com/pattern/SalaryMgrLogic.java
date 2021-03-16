package com.pattern;

import java.util.Vector;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgrLogic {
	SalaryMgrView smView = null;
	public SalaryMgrLogic(SalaryMgrView SalaryMgrView) {
		this.smView = SalaryMgrView;
	}
	
	public void getEmpDetail(int pempno) {
		
		EmpVO eVO = new EmpVO();
		eVO.setEname("이순신");
		DeptVO dVO = new DeptVO();
		dVO.setDname("형상관리팀");
		eVO.setdVO(dVO);//issue ////////////////이게 뭐지??????????????
		//java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다 함.
		//연관있는 레코드를 한번에 밀어넣기 위해서 사용함.
		
		Vector oneRow = new Vector();
		oneRow.addElement(eVO.getEname());
		oneRow.addElement(eVO.getdVO().getDname());/////////홧인
		smView.dtm_sal.addRow(oneRow);
	}//////////////////////end of
	

}
