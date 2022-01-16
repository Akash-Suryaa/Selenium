package DesiredCapabities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		ChromeOptions option = new ChromeOptions();
		
		// for browser maximize
		option.addArguments("--start-maximize");
		option.merge(caps);
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(caps);
		driver.get("https://www.cacert.com");
		

	}

}
