package di.step1;

public class Sonata extends Object{
	private String carColor = null;
	private int speed = 0;
	private int wheelNum = 4;
	public Sonata() {}
	public Sonata(String carColar, int speed) {
		this.carColor = carColar;
		this.speed = speed;
	}
	public String toString(){
		return "그녀의 자동차는 "+this.carColor+
				"이고 현재 속도는 "+this.speed+"입니다.";
	}
	
}