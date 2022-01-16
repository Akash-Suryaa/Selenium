package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Full_Page {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		File file =( ( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshot\\Homepage.png");
		
		FileUtils.copyFile(file, trg);
		
		

		driver.close();
	}
  
  
}
