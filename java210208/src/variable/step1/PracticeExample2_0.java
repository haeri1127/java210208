package variable.step1;

import java.util.Scanner;

/*
 * 1부터 N까지의 // 벙수의 합계 ///2개 동의룰 구하시오.
 *  
 */
public class PracticeExample2_0 {
	
	int num;
	int sum;
	
	int sum(int x){
		sum = sum + x;
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1부터 end까지 숫자를 세는 변수임.
		int start = 0;
		//1부터 어디까지 셀 것인지 담을 변수임.
		int end = 0;
		//합을 구해서 담을 변수 선언하기
		int hap = 0; //0으로 하는 이유는 합을 구할때 결과값에 영향을 줄 수 있으니까 0으로 초기화 해야된다.
		System.out.println("정수 몇까지 셀건가요?");
		end = sc.nextInt();
		//String s = sc.NextInt -> 인트니까 스트링 안되지
		//PracticeExample2 go = new PracticeExample2();
		for(start=1; start<=end; start=start+1) {
			//System.out.println(start);
			hap = hap + start;
			//go.sum(num);
		}
		System.out.println(hap);
		
	//	System.out.println(N + "까지의 합계는 "+go.sum+" 입니다.");	
	}//main메소드 끝
	
}