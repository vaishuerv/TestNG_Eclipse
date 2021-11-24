package TestNG_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider  =  "login_Credentials")
	private void facebook_Login(String username,String password) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\NewSelenium\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement mail = driver.findElement(By.id("email"));
	    mail.sendKeys(username);
	    Thread.sleep(2000);
	    WebElement passwor = driver.findElement(By.id("pass"));
	    passwor.sendKeys(password);
	    Thread.sleep(2000);
	}
	@DataProvider
	private Object[][] login_Credentials() {
		return new Object[][] {
			{"AAAAAAAAAA","1111111111"},
			{"BBBBBBBBBB","2222222222"},
			
		};

	}
}
	   
	    

		

	
	
	
	
	


