package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	
	@FindBy (xpath ="(//input[@name='is-userid'])[1]']")private WebElement rememberUserId;
	@FindBy (xpath ="//input[@id='radio-31']")private WebElement forgotUserId;
	@FindBy (xpath ="//input[@placeholder='PAN']")private WebElement pancard;
	@FindBy (xpath ="//input[@placeholder='User ID']")private WebElement userId;
	@FindBy (xpath ="//input[@id='radio-35']")private WebElement eMail;
	@FindBy (xpath ="//input[@id='radio-3']")private WebElement sms;
	@FindBy (xpath ="//input[@placeholder='E-mail (as on account)']")private WebElement eMailAsAccount;
	@FindBy (xpath ="//button[@class='button-orange wide']")private WebElement reset;
	@FindBy (xpath ="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backToLogin;
	@FindBy (xpath ="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;


	public ZerodhaForgotPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRememberUserId() {
		rememberUserId.click();
	}
	
	public void clickOnForgotUserId() {
		forgotUserId.click();
	}
	
	public void enterPancardId(String pan) {
		pancard.sendKeys(pan);
	}
	
	public void eneterUserId(String UserID) {
		userId.sendKeys(UserID);		
	}
	
	public void clickOnEmail() {
		eMail.click();
	}
	
	public void clickOnSms() {
		sms.click();
	}
	
	public void enterEmailIdAccount(String emailid) { 	
		eMailAsAccount.sendKeys(emailid);
		
	}
	public void clickOnReset() {
		reset.click();
	}
	public void clickOnBackToLogin() {
		backToLogin.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
}


