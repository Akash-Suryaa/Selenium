package window_Handles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_One_Window {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String parent =	driver.getWindowHandle();
		System.out.println("The parent window is " + parent);

		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(5000);

		Set<String> allWindows =	driver.getWindowHandles();

		for (String child : allWindows) {
			
			System.out.println(child);
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
			}
		}
         driver.switchTo().window(parent);
         Thread.sleep(2000);
         System.out.println("Window handles successFully");
		driver.quit();














	}

}
