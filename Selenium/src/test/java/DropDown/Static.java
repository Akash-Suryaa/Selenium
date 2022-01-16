package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Static {
	
	@Test
	public void selectDropDown() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	WebElement ddvalues =	driver.findElement(By.id("Skills"));
		Select sel = new Select(ddvalues);
		sel.selectByIndex(6);
		
		//getFirstSelectedOption is used to return one selected option
	WebElement selectedValue=	sel.getFirstSelectedOption();
		System.out.println("After selection selected value is " +selectedValue.getText());
		
		//getOptions is used to return all values
		
		List<WebElement> allSelectedValues = sel.getOptions();
		int totalValues = allSelectedValues.size();
		System.out.println("All the values are "+ totalValues );
		
	//for capturing all the values we use loops
		
		for(WebElement ele:allSelectedValues) {
			
		String values=	ele.getText();
			System.out.println("Total months are"+values);
		}
		
		
		
		
		
	}
	

}
