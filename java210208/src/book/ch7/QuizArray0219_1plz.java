package book.ch7;

import java.util.Random;

public class QuizArray0219_1plz {
	int nums[] = null;
	void initArray(int size) {
		
		Random r = new Random();
		nums = new int[size];
		for(int x=0;x<size;x++) {
			nums[x]=r.nextInt(50);
		}
	}
	
	
	int maxInArray(int size) {
		int max=0;
		max = nums[0];
		for(int i=1;i<size;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	void printArray(int size) {
		
		for(int a=0;a<nums.length;a++) {
			System.out.print(nums[a]+"  ");
		}
	}
	
	public static void main(String[] args) {
		QuizArray0219_1plz qa = new QuizArray0219_1plz();
		int size =10;
		for(int a=0;a<5;a++) {
		qa.initArray(size);
		qa.printArray(size);
		int max = qa.maxInArray(size);
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("=============================");
		}
	}

}
