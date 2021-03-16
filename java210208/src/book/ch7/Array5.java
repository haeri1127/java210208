package book.ch7;

public class Array5 {
	void methodB(boolean[] isOK) {
		System.out.println(isOK.length);
		//System.out.println(isOK[3]);
	}
	/*
	 10-11(선언만-초기화가 안됨-방크기가 결정되지 않았다.isOK.length:NulPointerException) 
	 */
	public static void main(String[] args) {
		boolean isOK[] = null;//선언만 하였다. 크기가 결정되지 않았다.
		Array5 a5 = new Array5();
		a5.methodB(isOK);
 	}

}
/*
 * 변수는 한번에 하나값만 담을 수 있다. -장애
 * 배열은 한번에 여러개 값을 담을 수 있다.
 * 그러나 다른 타입은 담을 수가 없다.[문제제기] - 객체 배열, ArrayList가능[문제해결능력을 가진자]
 * 또 기워넣기가 불가하다. - 크기를 조절할 수 없다. ArrayList사용하면 문제가 해결됨
 * 
 * 
 * 자료구조(List계정, Map계정, Set계열) -늘었다 줄었다 한다. 끼워넣기 가능. 회원탈퇴, 신입사원 등록
 * FIFO
 * LIFO
 * LILO.....
 * 
 * 세션과 쿠키
 * 
 * 
 * 오라클서버. -영원하다.
 *  
 */
