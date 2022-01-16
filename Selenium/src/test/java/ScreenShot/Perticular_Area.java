package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perticular_Area {

	//use Same code for capturing Screenshot of Perticular WebElement
	//Applicable for only Selenium 4 not for 3 
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	WebElement section =	driver.findElement(By.id("input"));
		File file =section.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshot\\Homepage.png");
		
		FileUtils.copyFile(file, trg);
		driver.close();

	}

}
