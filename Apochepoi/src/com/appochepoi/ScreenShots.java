package com.appochepoi;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "D:\\surendrawebdriverrs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("D:/SreenShot.jpg"));
	    	
		
		

	}

}
