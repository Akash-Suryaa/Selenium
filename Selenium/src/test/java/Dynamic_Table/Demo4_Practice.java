package Dynamic_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	List<WebElement> rows =	driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
	int row_count =	rows.size();
		System.out.println("Total rows are " + row_count);
		
		List<WebElement> columns =	driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td"));
		int column_count =	columns.size();
			System.out.println("Total columns are " + column_count);
			
			int columnIndex  =0;
			for(int i=0;i<columns.size();i++) {
				System.out.println(columns.get(i).getText());
				
				if("Kajaria Ceramics".equalsIgnoreCase(columns.get(i).getText())){
					
					columnIndex =i;
					break;
				}
			}
			System.out.println("Test case passed");
			Thread.sleep(3000);
			
			System.out.println("column index is " + columnIndex);
			driver.close();
	}

}
