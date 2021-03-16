package variable.step1;

import java.util.Scanner;
/*
 * 에러에는 두 가지가 있다.
 * 하나는 컴파일 타입 에러이고 - 문법 에러이고..
 * 두번째는 런타임 에러이다. - 실행 오류이다.(논리의 오류이다)
 */
public class PracticeExample1_4 {	

	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		System.out.println("지구의 몸무게를 입력하세요.");
		//시스템(내가 사용하고 있는 컴터)에서 in(입력장치로부터)
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()) {//너 입력한 값 더블이야? 네
			wEarth = sc.nextDouble();
			double wMoon = 0.0;
			PracticeExample1_4 q3 = new PracticeExample1_4();
			Common cm = new Common(); //같은 패키지이기때문에 friendly 상태
			wMoon = cm.moonweight(wEarth);
			System.out.println("지구의 몸무게 : "+wEarth+" kg");
			System.out.println("달의 몸무게 : "+wMoon+" kg");
			
			
		}else {
			System.out.println("실수만 입력하세요...제발..");
			return; //주석처리 하면 요기요기 나옴
		}
		System.out.println("요기요기");
	}
	
}
