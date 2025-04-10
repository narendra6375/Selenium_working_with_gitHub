package com.shopperstack_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shopperstack_POM.Home_page;
import com.shopperstack_POM.Login_Page;
import com.shopperstack_POM.Welcome_Page;

public class Base_Test {
	public  WebDriver driver;
	public  static WebDriver sDriver;
	public  ExtentSparkReporter spark;
	public  ExtentReports reports;
	public  ExtentTest test;
	public  File_Utility fileUtility = new File_Utility();

	public  Welcome_Page welcomepage;
	public  Login_Page loginPage;
	public  WebDriverWait wait;
	public  Home_page homePage;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		spark = new ExtentSparkReporter(FrameWorkConstants.Reports_Path);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("Demo");
	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("BeforeClass");
		
		String browser = fileUtility.ReadPropertyFile("browser");
		String url = fileUtility.ReadPropertyFile("url");
		
		System.out.println(url);
		System.out.println(browser);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} 
		
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
		
		else {
			System.out.println("Please enter a valid Browser Name");
			return;
		}

		sDriver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get(url);
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		System.out.println("BeforeMethod");

		welcomepage = new Welcome_Page(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(14));
		wait.until(ExpectedConditions
				.visibilityOf(welcomepage.getLoginBtnElement()));
		Thread.sleep(3000);

		welcomepage.getLoginBtnElement().click();

		loginPage = new Login_Page(driver);
		String username = fileUtility.ReadPropertyFile("username");
		String password = fileUtility.ReadPropertyFile("password");
		loginPage.getEmailTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getLogin_BtnElement().click();

		homePage = new Home_page(driver);
	}

	//last part of base class
	@AfterMethod
		public void afterMethod() {
			System.out.println("AfterMethod");

			homePage.getAccountSettingElement().click();
			homePage.getLogoutBtn().click();
		}

		@AfterClass
		public void afterClass() throws InterruptedException {
			System.out.println("AfterClass");
			Thread.sleep(1000);
			driver.quit();
		}

		@AfterTest
		public void afterTest() {
			System.out.println("AfterTest");
			reports.flush();
		}
	

}
