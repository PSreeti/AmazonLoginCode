package com.qa.opencart.base;

import java.util.Properties;

import com.qa.opencart.pages.HomePage;
//import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.RegisterPage;

public class BaseTest {
	
	private WebDriver driver;
	DriverFactory df;
	Properties prop;
	
	public LoginPage loginPage;
	//public AccountPage acctPage;
	//public RegisterPage registerPage;

	public HomePage homePage;
	
	Logger logger = LogManager.getLogger(BaseTest.class);
			
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop.getProperty("browser"));	
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
