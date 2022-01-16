package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("frame1").switchTo().frame(0);
		
		String text =driver.findElement(By.tagName("p")).getText();
		
		System.out.println("Child iframe text "  +  text);
		
		driver.switchTo().parentFrame();
		System.out.println("Parent iframe documents" +  driver.getPageSource());
		
		driver.switchTo().defaultContent();
		
		
		
		driver.close();
		

	}

}
