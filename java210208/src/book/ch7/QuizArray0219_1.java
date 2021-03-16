package book.ch7;

import java.util.Random;

public class QuizArray0219_1 {
	//선언부
	int nums[] = null;
	//배열의 초기화
	void initArray(int size) {
		Random r = new Random();
		nums = new int[size];
		for(int x=0;x<size;x++) {
			nums[x] = r.nextInt(50);
		}
	}
	//배열 출력하기
	int maxInArray(int size){
		int max = 0;
		max = nums[0];
		for(int i=1;i<size;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}///////end of if
		}//////////end if for
		return max;
	}
	//최대값 구하기
	void printArray(int size){
		if(nums!=null) {
		for(int a=0;a<nums.length;a++) {
			System.out.printf("%3d",nums[a]);
			}
		}
	}
	
	
	//main
	public static void main(String[] args) {
		QuizArray0219_1 qa = new QuizArray0219_1();
		int size = 10;
		qa.initArray(size);
		qa.printArray(size);
		int max = qa.maxInArray(size);
		System.out.println("최대값 : "+max);
	}

}
