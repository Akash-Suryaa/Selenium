	package Window_Based_Popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Selenium\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=13130943214691748627&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062117&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiAv_KMBhAzEiwAs-rX1Au1hp2NLBnKET0vhXe8SU-qAEr6ocDPJaa1jfzwnRAcKeyQ8yIGiRoCJQQQAvD_BwE");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String parent =driver.getWindowHandle();
		System.out.println("The parent window is "+ parent);
		System.out.println(driver.getTitle());


		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[text()='Mobiles']"))).click().build().perform();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[text()=' Electronics ']"))).click().build().perform();
		Thread.sleep(1000);
		action.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		Set<String> allwindows =	driver.getWindowHandles();

		//using iterator
		
//		Iterator<String> itr =	allwindows.iterator();
//
//		while(itr.hasNext()) {
//			driver.switchTo().window(itr.next());
//			Thread.sleep(1000);
//			System.out.println("The title is " +driver.getTitle());
//
//		}
		
		
		for (String child : allwindows) {
			
			System.out.println(child);
			
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
			}
			
			
			
			
		}

		driver.quit();













	}

}
