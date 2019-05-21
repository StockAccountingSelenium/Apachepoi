package com.appochepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLTest {

	public static void main(String[] args) throws IOException {
		
       /* FileInputStream fi= new FileInputStream("C:\\Users\\SURENDRA\\Documents\\msexel1.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
	    wb.createSheet("Sheet11133");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\SURENDRA\\Documents\\msexel1.xlsx");
		wb.write(fo); 
		
		wb.close();
		fi.close();
		fo.close();*/
		
		//  same program only but  one file transferd to another file
        FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\msexel1.xlsx");
        Workbook wb= new XSSFWorkbook(fi);
      // wb.createSheet("MIN5");
       
       
        FileOutputStream fo=new FileOutputStream("C:\\Users\\SURENDRA\\Documents\\msexel2.xlsx");
        wb.write(fo);
         wb.close();
         fi.close();
         fo.close();
        
        
		
		
		
		
		
		
	}

}
