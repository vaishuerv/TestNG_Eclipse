package TestNG_FW;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	@BeforeSuite
	private void set_Up() {
		System.out.println("Browser SetUp");

	}
	@BeforeTest
	private void browser_setUp() {
		System.out.println("Chrome Launch");
	}
	@BeforeClass
	private void chrome_Launch() {
		System.out.println("Url");
	}
	@BeforeMethod
	private void log_In() {
		System.out.println("Amazon Login");

	}
	@Test
	private void mobileSearch() {
		System.out.println("IPhone");

	}
	@Test
	private void laptopSearch() {
		System.out.println("lenova");
	}
	@Test
	private void searchTabs() {
		System.out.println("samsung");
	}
	@Test
	private void SearchTv() {
		System.out.println("Sony");
	}
	@AfterMethod
	private void verifyHome_Page() {
		System.out.println("Amazon Homepage");

	}
	@AfterClass
	private void log_Out() {
		System.out.println("amazon logout");

	}
	@AfterTest
	private void browser_Close() {
		System.out.println("close browser");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("DeleteCookies");
	}
	
	
	
	

}
