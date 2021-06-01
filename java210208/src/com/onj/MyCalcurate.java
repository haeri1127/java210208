package com.onj;

public class MyCalcurate {
	public static String calcurate(String sValue1, String sValue2, String sOP) {
		
		double v1 = Double.parseDouble(sValue1);
		double v2 = Double.parseDouble(sValue2);
		
		System.out.println("sValue1 : "+sValue1+"  sValue2 : "+sValue2+"==>"+sOP);
		if(sOP.equals("+")) {
			return ""+(v1+v2);
		}
		else {
			return "error";
		}
		
	}
}
