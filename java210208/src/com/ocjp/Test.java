package com.ocjp;

public class Test {
	public static void main(String[] args) {
		
		 int x =5;
		 boolean b1 = true;
		 boolean b2 = false;
		
		 if((x==4) && !b2)  { //5==4 false && !false->true
		 System.out.print("1");//좌중괄호 우중괄호가 없으면 여기까지만-한줄까지만 영역이 됨.  
		 
		 System.out.print("2");
		 }
		 if ((b2 = true) && b1)  //참참
		 System.out.print("3");  
	}

}

