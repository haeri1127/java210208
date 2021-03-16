package variable.step1;

import java.util.Scanner;

public class PracticeExample1 {
	
	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		//달에서의 몸무게
		double wMoon = 0.0;
		System.out.println("지구의 몸무게를 입력하세요.");
		//시스템(내가 사용하고 있는 컴터)에서 in(입력장치로부터)
		Scanner sc = new Scanner(System.in);
		wEarth = sc.nextDouble();
		wMoon = (wEarth*17)/100; //(double*int)/int = double
		System.out.println("지구의 몸무게 : "+wEarth+" kg");
		System.out.println("달의 몸무게 : "+wMoon+" kg");
	}
	

}
