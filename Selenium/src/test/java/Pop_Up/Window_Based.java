package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_Based {


	@Test
	public void windowBasePopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Akash\\Pictures\\Screenshots");

		driver.findElement(By.xpath("//input[@type='submit' and @ value='submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
System.out.println("Test case passed");

	}

}
