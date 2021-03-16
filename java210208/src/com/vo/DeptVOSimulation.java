package com.vo;

public class DeptVOSimulation {
	void methodB(){ //반환값이 전혀 역할을 못함.
		
	}
	DeptVO methodA() { //반환값이 3가지가 가능함.
		
		return new DeptVO();
	}
	DeptVO[] methodC(){ //반환값이 3가지 종류에 대해서 n개 로우까지도 가능함.
		
		return new DeptVO[3];
	}

	public static void main(String[] args) {
		DeptVO dvo = new DeptVO();
		//위치 - 어디서 호출해야 할까요?
		//insert here  - 부서번호 30을 출력하도록 코드를 추가하시오.
		dvo.setDeptno(30);//생성자로 처리해보시오. 1-2 API 활용능력, 배운거만?ㄴㄴ
		//int x = dvo.setDeptno(30); //void라 안됨
		//boolean isOK = dvo.setDeptno(30); //void라 안됨
		int myDeptNo = dvo.getDeptno(); //0출력		
		String myDname = dvo.getDname(); //null
		String myLoc = dvo.getLoc(); //null
		
		System.out.println(myDeptNo);//30
		System.out.println(myDname);
		System.out.println(myLoc);
		
	// DeptVO dvo = new DeptVO();
		dvo = new DeptVO();
		dvo.setDeptno(300);
		myDeptNo= dvo.getDeptno();
		System.out.println(myDeptNo);//300
	
		dvo = new DeptVO();
		dvo.setDeptno(7000);
		myDeptNo= dvo.getDeptno();
		System.out.println(myDeptNo);//7000
		
	}

}
