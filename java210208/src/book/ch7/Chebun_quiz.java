package book.ch7;

import java.util.Random;

public class Chebun_quiz {
	int com[] = new int[3];
	void nansu() {
		Random r = new Random();
		com[0] = r.nextInt(10);
		do {
			com[1] = r.nextInt(10);
		}while(com[1] == com[0]);
		
		do {
			com[2] = r.nextInt(10);
		}while(com[2] == com[0]||com[2]==com[1]);
	}//////end of nansu
	public static void main(String[] args) {
		Chebun_quiz cb = new Chebun_quiz();
		cb.nansu();
		System.out.println(cb.com[0]+""
				 +cb.com[1]+""+cb.com[2]);
		
		//맞추기
		
	}

}
