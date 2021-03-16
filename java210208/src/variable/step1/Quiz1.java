package variable.step1;

public class Quiz1 {
	int x; //전역변수는 선언과 초기화를 함께 해야함 = 두줄로 나누면 안된다는 이야기. 초기화를 생략하는건 가능.
	//메소드에는 2가지 종류가 있다.
	//JVM에서 제공되는 메소드와 사용자 정의 메소드
	//메소드 선언 순서는 리턴타입 메소드이름(){  실행문;} -기초가 있다.
	//메소드 선언할 때 리턴타입과 반환타입을 결정할 수 있다. -기초가 아니다. 코딩을 해봐야 함. 책으로 공부할 수 없다. 연습만이 살 길이다.
	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		System.out.println("methodA(int x)호출 성공=======>"+q.x);
		q.methodA(); //다음 문법 에러를 해결하시오.
		q.methodA(5); //다음 문법 6에러를 해결하시오.
	}
//methodA의 호출이 선언 앞에 오더라고 에러가 아님.
//왜냐하면 자바는 절차지향의 프로그램 언어가 아니니까
//왜냐하면 객체지향 언어이므로 호출순서와는 상관이 없다.
//자바에서는 같은 이름의 메소드를 중복하여 선언할 수 있다.
//이것을 가능하게 하는 규칙은 메소드 오버로딩이다.
//메소드 오버로딩은 반드시 파라미터의 타입이 다르거나(합집합:둘 중의 하나만 만족해도 참) 파라미터의 갯수가 달라야 한다.
//주의사항 : 리턴타입이 있고 없고는 영향을 주지 않음.
	private void methodA() { //private으로 하면 내 안에서만 사용할 수 있다. 외부의 클래스에서는 접근이 불가능하다. 호출이 안된다. 재사용 불가능하다.
		System.out.println("methodA호출 성공");
	}
	//파라미터 x에는 누가 값을 정해주는 걸까요?
	//언제 결정되는 걸까요? q.methodA(); 호출할때
	private void methodA(int x) { //private으로 하면 내 안에서만 사용할 수 있다. 외부의 클래스에서는 접근이 불가능하다. 호출이 안된다. 재사용 불가능하다.
		System.out.println("methodA(int x)호출 성공=======>"+x);
	}
	private int methodA(float y) { //private으로 하면 내 안에서만 사용할 수 있다. 외부의 클래스에서는 접근이 불가능하다. 호출이 안된다. 재사용 불가능하다.
		System.out.println("methodA(int x)호출 성공=======>"+x);
		return 0;
	}

}
