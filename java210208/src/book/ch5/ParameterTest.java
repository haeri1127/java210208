package book.ch5;

public class ParameterTest {
	String g_rdname = null;
	
	static int methodA() {
		return 100;
	}
	static int methodA(int p_empno) {
		return 100;
	}
	void methodA(int p_empno, String rdname) {
		g_rdname = rdname;
	}
	public static void main(String[] args) {
	//	int x = ParameterTest.methodA();
		int x = ParameterTest.methodA(7566);
		//int x = methodA(7566); 스태틱이기 때문에 DOT(.)연산자 앞에 생략 가능, BUT묵시적인거 싫어. 
		//그래서 스태틱이라고 하더라도 앞에다 타입을 붙여주자.
		System.out.println(x);
		String rdname = "개발2팀";
		ParameterTest pt = new ParameterTest();//그림으로 그려보자-노트필기
		pt.methodA(7566, rdname);
		//그러나 요기#25에서는 메소드를 경유하지 않고 출력이 됨. 따라서 null출력!
		System.out.println(new ParameterTest().g_rdname); //null 아니 왜 널이지???????왜???????진짜 왜지
		//여기#28서는 전역변수의 값이 출력되니까 개발2팀이 출력되구요
		//당연하게 23에서 methodA를 경유할때 새로운 값으로 초기화가 일어나기 때문임
		System.out.println(pt.g_rdname); //개발2팀 
	
	}

}
