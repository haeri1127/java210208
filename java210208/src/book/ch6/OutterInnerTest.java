package book.ch6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

class Outter{
	//Logger logger = LogManager.getFormatterLogger(Outter.class);
	Logger logger = LogManager.getLogger(Outter.class);
	int i=5;
	Outter(){
		System.out.println("Outter호출 성공");
	}
	class Inner{
		int j=10;
		public void go() {
			logger.info("go() 호출 성공");
		}
	}///////////////////end of Inner
	public void print() {
		logger.info("print() 호출 성공");
	}
}//////////////////////end of Outer

public class OutterInnerTest {
	Logger logger = LogManager.getLogger(OutterInnerTest.class);
		public void methodA() {
			logger.info("methodA 호출 성공");
		}
		public static void main(String[] args) {
		System.setProperty(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "C:\\git_java210208\\java210208\\java210208\\log4j.xml");
		  //insert here 이너 클래스에 접근해보자
		OutterInnerTest oit = new OutterInnerTest();
		oit.methodA();
		Outter outter = new Outter();
		outter.print();
		Outter.Inner inner = outter.new Inner();
		inner.go();
		
	}

}
