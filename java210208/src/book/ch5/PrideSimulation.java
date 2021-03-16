package book.ch5;

public class PrideSimulation {

	public static void main(String[] args) {
		//private으로 했을 경우 인캡슐레이션이 적용되는 것이다.
		//생성자를 선언할때 private으로 선언했으므로 디폴트 생성자를 활용하고 싶다면
		//싱글톤패턴으로 정의하여 사용해야 한다.
		//Pride myCar = new Pride();
		Pride herCar = new Pride(10);
		Pride himCar = new Pride(100,4);
		himCar.wheelNum = 4; //4->14로 바뀜, 클래스변수임
		herCar.wheelNum = 14; //앞에 힘카 허카 붙이는게 의미가 없음.. 따라서
		Pride.wheelNum = 5; //이렇게 쓰면 ok
		himCar.speed = 10; //10->50으로 바뀌지 않아. 왜? 인스턴스 변수니까(non-static)
		herCar.speed = 50;
		System.out.println("herCar.wheelNum : "+herCar.wheelNum);
		System.out.println("himCar.wheelNum : "+himCar.wheelNum);
		System.out.println("Pride.wheelNum : "+Pride.wheelNum);
		System.out.println("herCar.speed : "+herCar.speed);
		System.out.println("himCar.speed : "+himCar.speed);
	}

}
