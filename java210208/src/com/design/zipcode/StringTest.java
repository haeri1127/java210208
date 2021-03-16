package com.design.zipcode;

public class StringTest {

	public static void main(String[] args) {
		String sql = "select";
		sql = sql + " empno, ename";
		sql = sql + " FROM emp";
		sql = sql + " WHERE empno > 7000";
		System.out.println(sql);
		String sql2 = "JAVA";
		sql2.replace('J', 'H');
		System.out.println(sql2); //JAVA라고 출력된다. ->원본이 바뀌지않았다는 이야기
		sql2 = sql2.replace('J', 'H');
		System.out.println(sql2); //이제 HAVA라고 출력됨. 또 객체가 생성됐다....ㄴㄴㄴ
	}

}

