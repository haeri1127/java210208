package book.ch4;

public class Gugudan {
	
	public static void main(String[] args) {
		System.out.println("for구구단");
		int i = 2;
		int j = 1;
		for(i = 2; i<=9; i++) {
			System.out.println(i+"단");
			for(j = 1; j<=9; j++) {				
				System.out.println(i +" x "+ j +" = "+ i*j);
			}
			System.out.println("------------");
			j = 1;
		}///////end of for문
	
	
	System.out.println("while 구구단");	
	int a = 2;
	int b = 1;
	
	while(a<=9) {
		System.out.println(a+"단");
		while(b<=9) {
			System.out.println(a +" x "+ b +" = "+ a*b);
			b++;
			}
		a++;
		System.out.println("------------");
		b=1;
		}/////end of while
	
	}////////end of main	

}
