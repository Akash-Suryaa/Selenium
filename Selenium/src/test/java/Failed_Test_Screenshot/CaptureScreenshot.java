package Failed_Test_Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenshot extends MainTest {
	
	
	@Test
	public void captureScreenshot() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
			String title =driver.getTitle();
		Assert.assertEquals("Gogle", title);
		driver.close();
		
	}

}
