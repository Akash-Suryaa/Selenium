package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//for sendkeys
		WebElement user= driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].value= 'Admin'",user);
		Thread.sleep(3000);
		
		WebElement pass= driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].value= 'admin123'",pass);
		Thread.sleep(3000);
		
		//for click operation
	WebElement login=	driver.findElement(By.id("btnLogin"));
	js.executeScript("arguments[0].click()",login);
		Thread.sleep(5000);
		driver.close();

	}

}
