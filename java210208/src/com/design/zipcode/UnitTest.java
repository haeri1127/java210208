package com.design.zipcode;

import java.util.ArrayList;

public class UnitTest {

	public static void main(String[] args) {
		ZipCodeDao zcd = new ZipCodeDao();
		ArrayList<ZipCodeVO> zipcodeList = null;
		zipcodeList = zcd.getZipCodeList("가산동"); //////////주소번지 출력해서 확인해볼래
		zipcodeList = zcd.getZipCodeList("당산동");
		zipcodeList = zcd.getZipCodeList("개봉동");
		System.out.println(zipcodeList);
	}

}
