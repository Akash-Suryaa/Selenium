package Handle_Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void handleCalender() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.className("hasDatepicker")).click();
	
	
	
  List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	
  for(WebElement ele:dates) {
	  
	  System.out.println(ele.getText());
	  String date = ele.getText();
	  if(date.equals("10")) {
		  
		  ele.click();
		  break;
	  }
  }
  
  System.out.println("Test case Passed");
  
  Thread.sleep(4000);
 driver.close();
}
}