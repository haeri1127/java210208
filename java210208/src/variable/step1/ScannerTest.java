package variable.step1;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		System.out.println("0보다 큰 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int imsi = scan.nextInt();
		System.out.println("입력한 값은 "+imsi+" 입니다.");
		
	}

}
