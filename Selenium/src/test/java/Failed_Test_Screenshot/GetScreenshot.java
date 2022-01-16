package Failed_Test_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {
	
	public static void capture(String screenshot) throws Exception {
		
//	File file =( ( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	String dest =System.getProperty("user.dir")+ "/Screenshot/" +screenshot +".png";
//	File destination = new File(dest);
//	
//	FileUtils.copyFile(file,destination );
//	
		File file =( ( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshot\\Homepage "+ screenshot+".png");
}
}