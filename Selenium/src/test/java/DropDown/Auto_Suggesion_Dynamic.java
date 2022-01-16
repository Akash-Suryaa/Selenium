package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto_Suggesion_Dynamic {

	@Test
	public void HandleDD() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("cricbuzz");
		Thread.sleep(2000);

		List<WebElement> list =	driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

		for(WebElement ele:list) {
			System.out.println(ele.getText());
			
		if(list.equals("cricbuzz")) {
			
			ele.click();
			
			
			
		}
		





	}

}
}