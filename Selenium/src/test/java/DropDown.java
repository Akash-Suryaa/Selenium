import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		driver.manage().window().maximize();

	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='nav nav-treeview']//li//a//i"));
		
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
	}
		
		
	}

}
