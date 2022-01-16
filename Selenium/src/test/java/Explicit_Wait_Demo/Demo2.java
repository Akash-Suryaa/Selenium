package Explicit_Wait_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
     
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement username =driver.findElement(By.id("txtUsername"));
		WebElement password =driver.findElement(By.id("txtPassword"));
		WebElement button =driver.findElement(By.id("btnLogin"));
		sendKeys(username, 10, "Admin", driver);
		sendKeys(password, 5, "admin123", driver);
		click(button, 10, driver);
		System.out.println("Test case passed");
		driver.close();
	}
     
	
	public static void sendKeys(WebElement element, int timeout, String value,WebDriver driver) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
	}
	

	public static void click(WebElement element, int timeout, WebDriver driver) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
