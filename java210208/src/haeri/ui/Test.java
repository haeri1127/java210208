package haeri.ui;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	
	
	public static void main(String[] args) {
		Map<String, Integer> food = new HashMap<>();
		food.put("coffee", 1);
		food.put("hamburger", 2);
		food.put("sandwich", 3);
		
		food.remove("sandwich",3);
		
		
		System.out.println("키값들 : "+food.keySet());
		System.out.println("밸류들 : "+food.values());
	
	}

}
