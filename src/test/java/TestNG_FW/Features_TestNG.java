package TestNG_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Features_TestNG {
	WebDriver driver;
    @BeforeClass
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\NewSelenium\\driver\\chromedriver.exe" );
	     driver = new ChromeDriver();
	     
	    }
	@BeforeMethod
	private void welcome() {
		System.out.println("welcome to the browsers");
	  }
	@Test
	private void amazon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		System.out.println("amazon page are opened");
		Thread.sleep(2000);

	}
	@Test(dependsOnMethods = "myntra")
     private void flipkart() throws InterruptedException {
	 driver.get("https://www.flipkart.com/");
	 System.out.println("flipkart page are opened");
	 Thread.sleep(2000);

	}
	@Test
	private void mnytra() throws Throwable {
		driver.get("https://www.myntra.com/");
		System.out.println("myntra pages are opened");
		Thread.sleep(2000);
	}
	@Test
	private void zomato() throws Throwable {
		driver.get("https://www.zomato.com/");
		System.out.println("zomato opened");
		Thread.sleep(2000);
	}
	@Test
	private void swiggy() {
		driver.get("https://www.swiggy.com/");
		System.out.println("swiggy opened");
	}
	
    @AfterMethod
    private void close() {
		System.out.println("close all the browsers");
	}}
   