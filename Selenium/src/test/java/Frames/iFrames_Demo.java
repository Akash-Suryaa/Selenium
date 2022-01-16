package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames_Demo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.switchTo().frame("frame1");
//		String text =driver.findElement(By.id("sampleHeading")).getText();
//		System.out.println(text);
		
		driver.switchTo().frame(1);
		String text1 =driver.findElement(By.id("sampleHeading")).getText();
		Thread.sleep(2000);
		System.out.println(text1);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
