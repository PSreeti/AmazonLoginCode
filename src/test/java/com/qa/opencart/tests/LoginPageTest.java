package com.qa.opencart.tests;

import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import java.util.HashMap;

public class LoginPageTest extends BaseTest {

//	@Test(priority = 1)
//	public void loginPageTitleTest() {
//
//		String title = loginPage.getLoginPageTitle();
//		System.out.println("Login Page Title is : " + title);
//		Assert.assertEquals(title, "Account Login");
//	}
//
//	@Test(priority = 2)
//	public void forgotPasswordLinkTest() {
//		Assert.assertTrue(loginPage.isForgotPasswordDisplayed());
//	}

	@Test(priority = 1)
	public void doLoginTest() {
		loginPage.doLogin();

		String expected = "Hello, preeti" ;

		Assert.assertEquals(loginPage.welcomeText,expected);
		System.out.println("Login Success");



	}
	@Test (priority = 2)
	public void additems()
	{

		homePage.selectItem();

		String expectedItem1= "HIT Crawling Insect Killer – Cockroach Killer Spray (700ml) | Instant Kill | Deep-Reach Nozzle | Fresh Fragrance";

		Assert.assertEquals(homePage.Product1,expectedItem1);

		String expectedItem2= "GLUN Bolt Electronic Portable Fishing Hook Type Digital LED Screen Luggage Weighing Scale, 50 kg/110 Lb (Black)";

		Assert.assertEquals(homePage.Product2,expectedItem2);

		String expectedItem3= "URBAN FOREST Black Leather Men's Card Holder With Pen Combo (UBF126BLK10208)";

		Assert.assertEquals(homePage.Product3,expectedItem3);

		String Total= "Subtotal (3 items):";
		Assert.assertEquals(homePage.TotalItem,Total);

	}






}

