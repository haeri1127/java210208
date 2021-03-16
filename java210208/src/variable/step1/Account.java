package variable.step1;

public class Account {
	double kor = 0; //국어점수 담기
	double math = 0; //수학점수 담기
	double eng = 0; //영어점수 담기
	/****************************************
	 * 총점을 구하는 메소드 입니다.
	 * @param kor2 - 학생의 국어 점수
	 * @param math2 - 학생의 수학 점수
	 * @param eng2 - 학생의 영어 점수
	 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수의 값을 반환한다.
	 ***************************************/
	
	private double hap(double kor2, double math2, double eng2) {
		double tot = 0;
		tot = kor2 + math2 + eng2;
		return tot;
	}
	/******************************************
	 * 평균을 구하는 메소드입니다.
	 * @param tot - hap메소드를 호풀하여 tot를 받아온다.
	 * @return
	 ****************************************/
	private double avg(double tot,int subNum) {
		//메소드에서 파라미터를 사용할 때 배달사고 이런것들을 주의하기
		System.out.println("파라미터로 넘어온 tot값 출력해보기 ----> " +tot);
		return tot/(double)subNum;
	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		int subNum = 3;
		double tot = ac.hap(ac.kor, ac.math, ac.eng);
	//위에서 계산한 총점을 avg메소드에 파라미터로 넘기려면
	//반드시 리턴타입이 필요함
		double test_avg = ac.avg(tot, subNum); //평균 계산됨
		//double test_avg2 = ac.avg(tot, 3); //평균 계산됨
		System.out.println("평균은 "+test_avg+"입니다.");
	}


}
