package Window_Based_Popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String parentwindow =driver.getWindowHandle();
		System.out.println("The parent window Id is " +parentwindow);

		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);

		Set<String> allwindows= driver.getWindowHandles();

		for (String child : allwindows) {

			System.out.println(child);
			System.out.println("The title is " +driver.getTitle());
			if(!child.equals(parentwindow)) {

				driver.switchTo().window(child);
				driver.manage().window().maximize();
				Thread.sleep(3000);

			}
		}
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Akash");
		Thread.sleep(3000);

		System.out.println("Test case passed");
		driver.quit();

	}

}
