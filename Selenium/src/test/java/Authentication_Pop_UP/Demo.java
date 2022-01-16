package Authentication_Pop_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Basic url= http://the-internet.herokuapp.com/basic_auth
		//username= admin;password = admin
		// we need to pass username and password in url directly and write @
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text =driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(text);
		Thread.sleep(5000);
		
		
	}
	
	

}
