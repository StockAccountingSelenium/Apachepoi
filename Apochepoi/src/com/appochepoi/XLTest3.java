package com.appochepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLTest3 {
	public static void main (String[] args) throws IOException
	{
		//count no. of columns in a row
		FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("logindata");
		
		Row r1=ws.getRow(0);
		Row r2=ws.getRow(1);
		
		int colcount=r1.getLastCellNum();
		System.out.println(colcount);
		colcount =r2.getLastCellNum();
		System.out.println(colcount);
		
		wb.close();
		fi.close();
	}

}
