package BootsTrap_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	
	System.out.println(list.size());

	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if("Java".equals(list.get(i).getText())) {
			list.get(i).click();
		
			
		}
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Bootstrap']")).click();
		
	}
	driver.close();
	}
	
	
	
			
		}
	
	
	
	
	
	

