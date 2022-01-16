package Handle_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public static void handleCalender() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();	
		
		
		List<WebElement> AllDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
			
		for(WebElement ele:AllDates) {
			
			System.out.println(ele.getText());
		String date = ele.getText();
		
		if(date.equalsIgnoreCase("10")) {
			ele.click();
			
			
		}
		
		}
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
