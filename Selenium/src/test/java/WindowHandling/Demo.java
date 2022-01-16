package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
	String parentWindowHandle =	driver.getWindowHandle();
	
	
		
	System.out.println("The parent window is " + parentWindowHandle);
		
	WebElement elementClick =	driver.findElement(By.id("tabButton"));
		
		for (int i=0;i<3;i++) {
			elementClick.click();
			Thread.sleep(3000);
		}
	Set <String> AllWindowHandle =	driver.getWindowHandles();
	for(String handle :AllWindowHandle) {
		
		System.out.println("Window handle " + handle);
	}

	}

}
