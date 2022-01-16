package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	WebElement sourceElemnt=	driver.findElement(By.id("draggable"));
		
	WebElement targetElemnt=	driver.findElement(By.id("droppable"));
		
     Actions action = new Actions(driver);
     action.clickAndHold(sourceElemnt).moveToElement(targetElemnt).release().build().perform();
       Thread.sleep(3000);
	}

}
