package window_Handles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_One {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		String parent =driver.getWindowHandle();
		System.out.println("Parent window is " + parent);
		driver.findElement(By.id("newWindowBtn")).click();
		
	Set<String>	child_Windows =driver.getWindowHandles();
	for (String child : child_Windows) {
		System.out.println(child);
		if(!child.equals(parent)) {
			driver.switchTo().window(child);
			
			driver.findElement(By.id("firstName")).sendKeys("Akash");
			Thread.sleep(4000);
			driver.close();
		}
		
	}
	driver.switchTo().window(parent);
	driver.findElement(By.id("name")).sendKeys("Selenium");
	
	
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	

	}

	}


