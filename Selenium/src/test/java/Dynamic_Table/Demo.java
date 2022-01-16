
package Dynamic_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

public class Demo {

	@Test
	public static void DDHandle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
	List<WebElement> columnList =	driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		System.out.println("Total columns are " +columnList.size());
		
		int columnIndex = 0;
		for(int i=0;i<columnList.size();i++) {
			System.out.println(columnList.get(i).getText());
			
			if("UCO Bank".equalsIgnoreCase(columnList.get(i).getText())){
				columnIndex=i
						;
				break;
			}
			
		}
		System.out.println("Column Index is  " +columnIndex);
		
		
		
			List<WebElement> rowList =	driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
			System.out.println("Total rows are " +rowList.size());
			
//			for(int i=1;i<rowList.size();i++) {
//				
//			String rowValues=	driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" +i+"]//td[" +columnIndex+"]")).getText();
//		
//			System.out.println(rowValues);
			
			String BeforeXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
	         String AfterXpath ="]/td[1]/a";
			
	        // boolean f = false;
	         for(int i=1;i<=26;i++) {
	        	String names= driver.findElement(By.xpath(BeforeXpath +i+AfterXpath)).getText();
	        	System.out.println(names);
	        	if("Welspun Corp".equalsIgnoreCase(names)) {
	        		System.out.println("Name verified");
//	        	f=true;
	        	break;
	        		
	        	}else {
	        		System.out.println("Test case Failed");
	        	}
	        	
	         }
	         
	         
			//Assert.assertTrue(f, "Name is verified");
			  
		
			
			
			}
		
	
	}
    

