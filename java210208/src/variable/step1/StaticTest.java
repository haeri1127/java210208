package variable.step1;

public class StaticTest {
	/*
	 * non-static타입은 static영역에서 접근 불가, 호출 안돼, 사용 못해
	 */
	static void avg() { //사용자 정의 메소드 입니다.
		System.out.println("avg호출 성공");
	}
	public static void main(String[] args) {
		//if(args[0]==null | args.length>0) {
		if(args.length==0) {
			//아래 문장은 조건에 따라 한 번도 실행기회를 못 가질 수도 있다.
			System.out.println("야 입력해야쥐");
			return;//main메소드 탈출하기
		}
		System.out.println(args[0]+10); //20이 출력되도록 코드를 출력하시오.1010말고 20이 출력되는 걸 보고 싶다면 어떡하지?
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);
		System.out.println("=======>"+imsi+10);
		//주소번지 없이도 호출할 수 있는 메소드가 있다. 메소드 이름 앞에 static이 있다면..
		//main메소드는 자바가 제공하는 메소드입니다.->O
		//사용자 정의 메소드도 가능하다.
		//내가 필요한 메소드는 문자열을 집어(파라미터로) 넣으면 int타입으로 변환하여서 반환(리턴해주는, 돌려주는, 대입연산자로 받을 수)해주는 메소드가 필요해요.
		//parseInt()입니다.
		//네이버나 구글링을 해서 위 요구사항을 만족하는 코드를 작성해보시오.
		StaticTest.avg();
	}

}


//결국 parseInt 는 static으로 정의된 Integer 메소드의 기능중 하나라서 parseInt 앞에 위치를 나타내는 Integer을 입력해줘야 사용할 수 있다는 뜻인가요?
//동의
//그럼 java.lang은 패키지 정도로 이해하면 되나요
/*김승수님이 모두에게:  05:55 PM
java.lang에 있는 것은 따로 import문을 쓰지 않아도 된다.
javax.swing.JFrame같은 것들은 반드시 import문을 써주어야 합니다.
*/


