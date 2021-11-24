package TestNG_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised_Test {
	@Parameters({"Username","Password"})
	@Test

	private void login(String Username, String Password) throws Throwable {
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\NewSelenium\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    mail.sendKeys(Username);
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(Password);
	     Thread.sleep(2000);
	     WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	     login.click();
	

	
	}
}
