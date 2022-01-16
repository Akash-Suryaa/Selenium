package HandleHiddenElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("displayed-text")).sendKeys("Akash");

		//we have to use javaScriptExicutor

		JavascriptExecutor js =	(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('displayed-text').value='Akash Suryawanshi';");
		Thread.sleep(3000);
		

	}

}
