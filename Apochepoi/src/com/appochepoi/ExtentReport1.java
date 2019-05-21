package com.appochepoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {

	public static void main(String[] args) {
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("D://ExtentReport.html");
		ExtentReports report= new ExtentReports();
		report.attachReporter(path);
	    ExtentTest logger= report.createTest("verify titles");
	    		 
		System.setProperty("webdriver.chrome.driver", "D:\\surendrawebdriverrs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        logger.log(Status.INFO, "Browser started");
        
		driver.get("http:google.com");
		logger.log(Status.INFO, "Application is Running");
		
		String title= driver.getTitle();
		if (title.equalsIgnoreCase("google"))
		{
		logger.log(Status.INFO, "Title Mached");
		
		}else
		{
			logger.log(Status.INFO, "Title Mismached");
		}
				
			
	    
		report.flush();
			}
		
}
