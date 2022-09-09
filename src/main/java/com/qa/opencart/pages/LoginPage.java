package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	//1. create all the locators and 2. perform the action (Creating various methods)
	public String  welcomeText;
	By signin = By.linkText("Sign in");
	By username = By.id("ap_email");

	By button = By.id("continue");
	By password = By.id("ap_password");
	By loginBtn = By.id("signInSubmit");

	By logout = By.linkText("Sign Out");

	By Welcome = By.id("nav-link-accountList-nav-line-1");

	By forgotPassword = By.xpath("//div[@class='form-group']/a");
	By registerLink = By.xpath("//div[@class='list-group']/a[text()='Register']");


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		
	}
	
//	//public String getLoginPageTitle() {
//		return elementUtil.waitForTitleIsToLoad(5, Constants.LOGIN_PAGE_TITLE);
//	}
//
	//public boolean isForgotPasswordDisplayed() {
//		return elementUtil.doIsDisplayed(forgotPassword);
//	}
	
	public AccountPage doLogin() {
		//elementUtil.doClick(logout);
		elementUtil.doClick(signin);
		elementUtil.doSendKeys(username, "joshipreeti90@gmail.com");
		elementUtil.doClick(button);
		elementUtil.doSendKeys(password, "Pjoshishail@19");
		elementUtil.doClick(loginBtn);
		welcomeText = elementUtil.doGetText(Welcome);
		
		return new AccountPage(driver);
	}

//	public String Welcome()
//	{
//		elementUtil.doGetText(Welcome);
//		return elementUtil.doGetText(Welcome);
//	}
	
//	public RegisterPage navigatingToRegisterPage() {
//		elementUtil.doClick(registerLink);
//
//		return new RegisterPage(driver);
//	}
}
