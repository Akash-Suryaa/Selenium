package Failed_Test_Screenshot;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	
    public void onTestFailure(ITestResult result) {	
    	
        				try {
							GetScreenshot.capture(result.getName());
						} catch (Exception e) {
							
							e.printStackTrace();
						}
        		
    }		

    
}

