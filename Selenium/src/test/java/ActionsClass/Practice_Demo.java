package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("newWindowBtn"))).click().build().perform();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("Test case passed");
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
