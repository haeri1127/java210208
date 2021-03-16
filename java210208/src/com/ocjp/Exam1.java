package com.ocjp;
/*
 * ++i는 i = i + 1;과 같다.
 * --i는 i = i - 1;과 같다.
 * i++는 후위 연산자이므로 먼저 비교하고 나중에 1을 증가시킴
 * ++i 전위 연산자이다.
 */

public class Exam1 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 2;
		   //2 > 2 F j=1 & 3>1 True
		if((++i>j--)&(++i>j)) {
			//실행되는가?  안될듯ㅇ
		}else {
			//실행되나?
			System.out.println(i+", "+j);//concat 붙여쓰기 3 1
		}
		//System.out.println(i); //3
		//System.out.println(j); //1
		//변수 초기화가 있을 때와 없을 때 차이가 있습니까? 있지 초기화 안하면 i=3 j=1
		System.out.println("===================");
		
		i = 1;
		j = 2;
		  //4>1&&5>0   -초기화 안하면
		  //2>2 && 실행 ㄴㄴ 
		  //j=1
		if((++i>j--)&&(++i>j)) {
			//실행 안됨			
		}else {
			System.out.println(i+", "+j);//concat 붙여쓰기 5 0
			//이건 출력될듯
		}
		System.out.println(i); //2
		System.out.println(j); //1
	
	}
	

}
