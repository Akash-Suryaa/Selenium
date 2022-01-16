package Dynamic_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> colList =	driver.findElements(By.xpath("//table[@class='tsc_table_s13']//thead//tr//th"));
		System.out.println("Total columns are " +colList.size());
		
		
		List<WebElement> rowList =	driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr"));
		System.out.println("Total rows are " +rowList.size());
		
		for(int i=0;i<=rowList.size();i++) {
			System.out.println( rowList.get(i).getText());
			
			if(rowList.contains("Dubai")) {
				System.out.println("Test case passed");
				break;
				
			}else
			{
System.out.println("Test case Failed");
				
			}
			
		}
		
		
		
	}
	
}
