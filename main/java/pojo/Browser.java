package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver OpenChromeBrowser()
	{
	//	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();   // it will take direct path 
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--Disable-Notifications");   // it will stop all windows pop Up notification
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://kite.zerodha.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		return driver;
	}
	
}
