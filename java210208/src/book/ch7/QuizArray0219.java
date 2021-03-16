package book.ch7;

import java.util.Random;

public class QuizArray0219 {
	//선언부
	int nums[] = null;
	//배열의 초기화
	void initArray(int size) {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			nums[i] = r.nextInt(50);
		}
	}
	//배열 출력하기
	int maxInArray(int size){
		int max = 0;
		return max;
	}
	//최대값 구하기
	void printArray(int size){
		
	}
	//main
	public static void main(String[] args) {
		QuizArray0219 qa = new QuizArray0219();
		int size = 10;
		qa.initArray(size);
		qa.printArray(size);
		int max = qa.maxInArray(size);
		System.out.println("최대값 : "+max);
	}

}
