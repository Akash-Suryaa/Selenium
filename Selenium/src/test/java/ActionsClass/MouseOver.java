package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Teams')]"))).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[3]/nav[1]/div[1]/div[1]/a[4]")).click();
		Thread.sleep(5000);
		System.out.println("Test passed ");
		
		driver.close();

	}

}
