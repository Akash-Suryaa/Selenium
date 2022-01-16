package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		WebDriver driver  = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;		
		
		// for scroll down
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(4000);
		
		// for scroll up
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(4000);
		
		//for scroll down at the end 
		js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		
		//for scroll down particular WebElement
//		WebElement facebook =driver.findElement(By.xpath("//a[@title='Facebook']"));
//		JavascriptExecutor js =  (JavascriptExecutor)driver ;
//		js.executeScript("arguments[0].scrollIntoView()",facebook);
//		Thread.sleep(3000);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
