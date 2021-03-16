package book.ch5;
/***********************************
 * 싱글톤 패턴의 정의
 * 해당 클래스의 인스턴스가 하나(정적)만 만들어지고 어디서든지(public) 그 인스턴스에 접근할 수 있도록 하기 위한
 * 패턴이다.
 * 클래스변수
 * 인스턴스변수 - 인스턴스화에서 만들어진다
 * 방법1 - 고전적인 싱글톤 패턴 구현법
 * 방법2 - 성능이나 병목현상을 고려하여 구현하기
 * 방법3 - 
 * @author HAERI
 *
 ***********************************/
public class Pride {
	static int 	wheelNum	= 0;	//클래스 변수, 공유, 하나뿐(only)
	int			speed 		= 0;
	private Pride() {
	
	}
	public Pride(int speed) {
		this.speed = speed;
	}
	public Pride(int speed, int wheelNum) {
		this.speed = speed;
		this.wheelNum = wheelNum;
	}
	void speedUp(){
		speed = speed + 1;
	}
	/* 이 경우는 문법 에러가 발생함.
	static void stop() {
		speed = 0; //고려대상x, 
		//스태틱이 붙은 메소드에는 클래식변수만 올 수 있다.(전역변수일 경우)
		//스태틱 변수 - 값이 하나, 공유가 된다.
	}
	*/
	static void change() {
		wheelNum = 2;
	}
}
