package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends ZerodhaPageElement implements ITestListener{

	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Test Is Succesfull :"+result.getName());
		
	}		
	public void OnTestFailuer(ITestResult result) {
		try {
			
		Screenshot.takeScreenshot(driver,result.getName());   
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void onTestSkipped(ITestResult result)	{
		
		System.out.println("Test is Skipped"+result.getName());
		
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test Is Started "+ result.getName());
		
	}		
}


