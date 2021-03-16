package book.ch4;

public class WhileTest {

	public static void main(String[] args) {
		//파라미터 자리에 true같은 상수를 사용하지 않기
		/*while(true) {//항상 무한루프 방지 코드를 작성할 것.
			break;
		}
		boolean isStop = false;
		while(!isStop) {//권장 사항이다.
	
			
		}
		while(true) {//요거는 별로..
			
		}
		int i = 5;*/
	
		int isum=0;
		int i = 0;
		for(i=0;i<100;i++) {
			isum=isum+i;	
		}		
		System.out.println(i);
		System.out.println(isum);
		
	}///////////////////end of main
	
}///////////////////////end of WhileTest
