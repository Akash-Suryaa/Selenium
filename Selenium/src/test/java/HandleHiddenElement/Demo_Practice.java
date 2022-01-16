package HandleHiddenElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Practice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(3000);
		
		//if element is hidden then exception occure if we use this without javascriptExecutor
//		driver.findElement(By.id("displayed-text")).sendKeys("Akash");
//		Thread.sleep(3000);
//		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('displayed-text').value='Akash Suryawanshi';");
		
		
		
		
		
		driver.close();
		
		
		
		

	}

}
