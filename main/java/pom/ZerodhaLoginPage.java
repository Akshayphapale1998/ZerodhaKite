package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy (xpath = "//input[@id='userid']")private WebElement userID;
	@FindBy (xpath = "//input[@id='password']")private WebElement pass;
	@FindBy (xpath = "//button[@type='submit']")private WebElement login;
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy (xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp ;
	@FindBy (xpath = "//input[@type='password']")private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']")private WebElement submit;
	@FindBy (xpath = "//a[text()='Problem with PIN?']")private WebElement problemWithPin;
	@FindBy (xpath = "//a[text()='Forgot 2FA?']")private WebElement forgot2FA;
	@FindBy (xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUpNow;
	
	
	public ZerodhaLoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String user) {
		userID.sendKeys(user);
	}
	
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickOnLoginPage() {
		login.click();
	}
	
	public void clickOnForgot() {
		forgot.click();
	}
	
	public void clickOnSignUp() {
		signUp.click();
	}
	
    public void enterPin(String pincode) {
    	pin.sendKeys(pincode);  	
    }
    
    public void clickOnSubmit() {
    	submit.click();
    }
    
    public void clickOnProblemWithPin() {
    	problemWithPin.click();
    }
    
    public void clickOnForgot2FA() {
    	forgot2FA.click();
    	
    }
    public void clickOnSignUpNow() {
    	signUpNow.click();
    }

}
