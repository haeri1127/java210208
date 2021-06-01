package di.step1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMain {

	public static void main(String[] args) {
		ApplicationContext context2 = 
				new ClassPathXmlApplicationContext
				("di\\step1\\insaBean.xml");
		InsaList insaList = (InsaList)context2.getBean("insa"); //객체 주입
		InsaMap mapBean = (InsaMap)context2.getBean("insaMap");
		/*
		System.out.println(insaList);
		System.out.println(insaList.insaBean);
		for(String s:insaList.insaBean) {
			System.out.println(s);
		}*/
		/*
		InsaList insaList2 = new InsaList(); //객체 주입 ㄴㄴ
		System.out.println(insaList2);
		System.out.println(insaList2.insaBean);
		*/
		
		System.out.println("mapBean ==> "+mapBean);
		System.out.println(mapBean.mapBean);
		for(String s:mapBean.mapBean.keySet()) {
			System.out.println(mapBean.mapBean.get(s));
		}
	}
}
