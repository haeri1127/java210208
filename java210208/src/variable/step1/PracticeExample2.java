package variable.step1;

import java.util.Scanner;

public class PracticeExample2 {
	
	int num;
	int sum;
	
	int sum(int x){
		sum = sum + x;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("숫자 몇까지 셀건가요?");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		PracticeExample2 go = new PracticeExample2();
		for(int num=1; num<=N; num++) {
			go.sum(num);
		}
		
		System.out.println(N + "까지의 합계는 "+go.sum+" 입니다.");	
	}//main메소드 끝
	
}