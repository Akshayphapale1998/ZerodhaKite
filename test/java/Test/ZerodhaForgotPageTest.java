package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotPage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;

public class ZerodhaForgotPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		
		driver=Browser.OpenChromeBrowser();
	}
	
	@Test
	public void forgotPasswordAsIRememberMyUserId() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ZerodhaLoginPage zerodhaLoginPage =new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
		
		
		ZerodhaForgotPage zerodhaForgotPage=new ZerodhaForgotPage(driver);
	//	zerodhaForgotPage.clickOnForgotUserId();
		
	//	zerodhaForgotPage.clickOnRememberUserId();
		
		zerodhaForgotPage.eneterUserId(Parametrization.getExcelData(0, 0, "Zerodha"));
		zerodhaForgotPage.enterPancardId(Parametrization.getExcelData(1, 0, "Zerodha"));
	//	zerodhaForgotPage.clickOnEmail();
		zerodhaForgotPage.enterEmailIdAccount(Parametrization.getExcelData(2, 0, "Zerodha"));
		zerodhaForgotPage.clickOnReset();
	}

}
