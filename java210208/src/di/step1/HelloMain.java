package di.step1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
/*
 * spring-core.jar는 IoC를 제공하는 역할을 하였음.
 * IoC는 Inversion of Conversion의 약자임 - 번역하면 역제어 또는 제어 역행이라고 한다.
 * 최근에나 사용되는 모든 컨테이너들이 공통으로 사용하고 있는 개념이다.
 * 기존 방식
 * 자바 기반으로 어플리케이션을 개발할 떄 자바 객체를 생성하고 서로간의 의존관계를
 * 연결시키는 작업에 대한 제어권은 보통 개발되는 어플리케이션에 잇음
 * 
 * 문제 제기
 * 컴포넌트간의 결합도가 높아서 컴포넌트의 확장 및 재사용이 어려운 문제점 발생함.
 * 
 * 해결 방법은?
 * IoC사용
 * 제어권이 Container에게 넘어가 객체의 생명 주기를 Container가 전담하게 됨.
 * 
 * 해결 내용
 * 컴포넌트 간의 결합도가 낮아져 컴포넌트의 재사용 및 확장이 쉽고
 * 컴포넌트의 의존관계 변경이 쉬움.
 * 
 * 
 */

// spring-bean.jar    BeanFactory 관리
// 스프링에서 Bean == class 이다. Beans는 클래스여러개, 복수로 생각.
// 결정이 안됨.

public class HelloMain {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext는 ApplicationContext의 구현체 클래스임
		//생성자의 파라미터로 xml문서를 스캔함
		//spring-context.jar
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
					("di\\step1\\helloBean.xml");
		ApplicationContext context2 = 
				new ClassPathXmlApplicationContext
				("di\\step1\\sonataBean.xml");
		Sonata himCar = (Sonata)context2.getBean("himCar");
		Sonata herCar = (Sonata)context2.getBean("herCar");
		System.out.println(himCar);
		System.out.println(herCar);
		Resource resource = new FileSystemResource("C:\\git_java210208\\java210208\\java210208\\src\\di\\step1\\helloBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean helloBean2 = (HelloBean)factory.getBean("helloBean222");
		HelloBean helloBean = (HelloBean)context.getBean("helloBean222");
		System.out.println(helloBean.getGreeting("Hi~~~"));
		System.out.println(helloBean2.getGreeting("Hi~~~"));
	}

}
