package KeyBoardEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.id("firstName")).sendKeys("Akash");
		
		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("Suryawanshi")
		.sendKeys(Keys.TAB).sendKeys("akashsury@gmail.com")
		.build().perform();
		
		
		
		
		
		
		
	}
	
	

	
}
