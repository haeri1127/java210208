package book.ch4;

public class FizzBuzz {

	public static void main(String[] args) {
	
	
		for(int i =1; i<=100; i++) {
			
			switch(i%35) {
			case 0:
				System.out.println("fizzbuzz");
				break;
			case 5:
				System.out.println("fizz");
				break;
			case 7:
				System.out.println("buzz");
				break;
			default:
				System.out.println(i);
				break;
			}////////////end of switch
		}
		
		
	}/////////end of main

	
	
	
}
