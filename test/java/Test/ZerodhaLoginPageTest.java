package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.ExtentReport;
import utility.Parametrization;
import utility.ZerodhaPageElement;

@Listeners(utility.Listeners.class)
public class ZerodhaLoginPageTest extends ZerodhaPageElement{
	
//	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
		reports= ExtentReport.getReports();
	}
	
	@BeforeMethod
	public void openBrowser() {
	 	driver =Browser.OpenChromeBrowser();
	}
	
	@Test(dependsOnMethods= "valiDateZerodhaLogin")
	public void forgot() {
		test=reports.createTest("forgot");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
	}
	
	@Test
	public void valiDateZerodhaLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		
		test= reports.createTest("valiDateZerodhaLogin");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData(0, 0, "Credentials"));
		zerodhaLoginPage.enterPassword(Parametrization.getExcelData(1, 0, "Credentials"));
	//	zerodhaLoginPage.clickOnLoginPage();
		zerodhaLoginPage.enterPin(Parametrization.getExcelData(2, 0, "Credentials"));
	//	zerodhaLoginPage.clickOnSubmit();	
	}
	
	@AfterMethod
	public void captureresult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}			
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
	
	
	
}
