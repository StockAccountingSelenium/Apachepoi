package com.appochepoi;

import java.io.File;
import java.io.IOException;

public class DemoTest {

	public static void main(String[] args) throws IOException {
	
	//int s=XLUtills.getrowCount("C:\\Users\\SURENDRA\\Documents\\MSEXEL.xlsx", "santhi");
	//System.out.println(s);
		
	//	int s;
	//s=XLUtills.getcolCount("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx", "logindata",1);
	//System.out.println(s);
	
	/*	String s=XLUtills.getCelldata("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx", "logindata",1,2);
		System.out.println(s);*/
		
	//XLUtills.setCelldata("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx", "logindata",1,4,"howw");
	
	//XLUtills.fillGreeencolor("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx", "logindata", 2,2);
		
	XLUtills.fillRedcolor("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx", "logindata", 2,2);

	}

}
