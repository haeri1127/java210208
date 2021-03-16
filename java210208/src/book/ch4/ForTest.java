package book.ch4;

public class ForTest {

	public static void main(String[] args) {
		int i=11;
		int hap1 = 0;
		int hap2 = 0;
		for(i=1; i<=10; i=i+1) {
			//System.out.println(i); 출력하는 문장이 for문 안에 있는 경우 10번 반복 출력되니까
			if(i%2==1) {//너 i로 나눈 나머지가 0하고 같은 거야?
				hap1 = hap1 + i;
				System.out.println("1부터 10까지 세면서 홀수의 합을 구한 결과는 : "+hap1);
			}
			else{
				hap2 = hap2 + i;
				System.out.println("1부터 10까지 세면서 짝수의 합을 구한 결과는 : "+hap2);
			}
		}
		//나는 for문 밖에서 한번만 30을 출력하고 싶어요
		System.out.println("=================");		
	}
	
}
