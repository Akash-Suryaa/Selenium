package Dynamic_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_Naveen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		//*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a
		//*[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a
		
		
		String BeforeXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
         String AfterXpath ="]/td[1]/a";
		
         for(int i=1;i<26;i++) {
        	String names= driver.findElement(By.xpath(BeforeXpath +i+AfterXpath)).getText();
        	System.out.println(names);
        	if(names.contains("Bata India")) {
        		System.out.println("Test case passed");
        	}else
        	{
        		System.out.println("Test case Failed");
        	}
         }
		driver.close();
	}

}
