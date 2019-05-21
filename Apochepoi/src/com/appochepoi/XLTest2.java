package com.appochepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLTest2 {
	public static void main(String[] args) throws IOException
	{
		//counting no.of rows in a sheet
		
		/*FileInputStream fi= new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb= new XSSFWorkbook(fi);
	    Sheet ws1=wb.getSheet("logindata");
	    Sheet ws2=wb.getSheet("empdata");
	    
	     int rc=ws1.getLastRowNum();
	     System.out.println(rc);
	     rc=ws2.getLastRowNum();
	     System.out.println(rc);
	      
	     wb.close();
	     fi.close();*/
		
		
		//2.counting no. columns in a row
				
	/*	FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("logindata");
		
		Row r1=ws.getRow(0);
		Row r2=ws.getRow(1);
		
		int colcount=r1.getLastCellNum();
		System.out.println(colcount);
		colcount =r2.getLastCellNum();
		System.out.println(colcount);
		
		wb.close();
		fi.close();*/
		
		
		//3.how to read data from exel sheet
		
		/*FileInputStream fi= new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("logindata");
        Row r=ws.getRow(2);
        Cell c1=r.getCell(1);
        Cell c2=r.getCell(2);
        
        String uid=c1.getStringCellValue();
        String pwd=c2.getStringCellValue();
        System.out.println(uid+"  "+pwd);
        
        wb.close();
        fi.close();*/
		
		
		//4.how to read data from all rows in a excel sheet
		
    /*  FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
        Workbook wb=new XSSFWorkbook(fi);
        Sheet ws=wb.getSheet("logindata");
        int rc=ws.getLastRowNum();
       
        for(int i=1; i<=rc; i++)
        {
    	   Row r=ws.getRow(i);
    	   Cell c1=r.getCell(0);
    	   Cell c2=r.getCell(1);
           String uid =c1.getStringCellValue();
           String pwd=c2.getStringCellValue();
           System.out.println(uid+"  "+pwd);
    	   
        }
        wb.close();
        fi.close();*/
		
		
		//5. trying to fech the data from empty cell using "try_ catch" blocks
		
	/*	FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("empdata");
		Row r=ws.getRow(2);
	
		Cell c;
		String data;
		try {
		  c=r.getCell(1);
		  data=c.getStringCellValue();
			
		} catch (Exception e) {
		data="";
		}
	    System.out.println(data);
	     
	    wb.close();
	    fi.close();*/
                
  	 
		//6.writing data into exel sheet
		
		/*FileInputStream fi= new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb= new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("empdata");
		Row r1=ws.getRow(0);
		Row r2=ws.getRow(1);  
		
		Cell c1=r1.createCell(3);
	    c1.setCellValue("pass");
	    Cell c2=r2.createCell(2);
	    c2.setCellValue(" fail");
	    
	    FileOutputStream fo=new FileOutputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
	    wb.write(fo);
	    
	    wb.close();
	    fi.close();
	    fo.close();*/
		
		
		//7.filling the cell color
		
		FileInputStream fi=new FileInputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws=wb.getSheet("empdata");
		Row r1=ws.getRow(0);
		Cell c1=r1.createCell(3);
		c1.setCellValue("pass");
		
		//Row r2=ws.getRow(2);
		//Cell c2=r2.createCell(3);
		//c2.setCellValue("fail");
		
		CellStyle style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		c1.setCellStyle(style);
		//c2.setCellStyle(style);
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\SURENDRA\\Documents\\testdata.xlsx");
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	    
	}

}

