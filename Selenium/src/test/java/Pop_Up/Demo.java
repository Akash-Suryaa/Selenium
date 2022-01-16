package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		if(text.equals("Hello , share this practice page and share your knowledge")) {
			System.out.println("Corrct alert message");
		}else {
			System.out.println("In-Corrct alert message");
		}
		
		alert.accept(); // for click on ok button
		//alert.dismiss();// for click on cancel button
		driver.close();

	}

}
