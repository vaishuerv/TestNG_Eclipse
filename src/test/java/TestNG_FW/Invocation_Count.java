package TestNG_FW;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Invocation_Count {
	WebDriver driver;
	@BeforeClass
	private void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\NewSelenium\\driver\\chromedriver.exe");
         driver = new ChromeDriver();
	}
	@BeforeMethod
	private void flipkart_Page() throws Throwable {
		System.out.println("welcome to browsers");
	}
	
    
    @Test
    private void mobile_Search() throws Throwable {
    	driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		element.click();
    	WebElement sm = driver.findElement(By.xpath("//input[@type='text']"));
    	sm.sendKeys("Iphone");
    	WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
    	click.click();
    	Thread.sleep(2000);
    	driver.navigate().refresh();
    	System.out.println("iphone");
    
    }
    @Test(invocationCount = 2,priority = -1)
   private void fashion() throws InterruptedException {
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);

}
    @Test
    private void amazon_Launch() throws Throwable {
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop");
		search.click();
		Thread.sleep(2000);

	}
    @Test(enabled = false)
    private void facebook_Launch() {
		driver.get("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.navigate().refresh();
		

	}
    @Test(priority = -2)
    private void insta_Launch() {
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

	}
   @AfterMethod
   private void browser_Close() {
	
	   System.out.println("close all the browwser");

}
	}
    
    
	
   
		
    
    
    




