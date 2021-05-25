package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Controller;

public class LoginPage {
	Controller controller;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name = "login")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")
	@CacheLookup
	WebElement dashboardSearch;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div")
	@CacheLookup
	WebElement txtStatus;

	public LoginPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void enterEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	public void enterPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	public void clickLoginButton() {
		btnLogin.click();
	}
	public void verifyLogin() {
		dashboardSearch.isDisplayed();
	
	}
	
	public void confirmLoginButton() {
		btnLogin.isDisplayed();
	}
	
	public void postStatus(String Status) {
		txtStatus.sendKeys(Status);
	}
//	// This function handles the full login and token validation process
//	public void successfulLogin() throws InterruptedException {
//		httpErrorPage.clickAdvancedButton();
//		httpErrorPage.clickRedirectLink();
//		this.setLoginUserID("0015969269");
//		this.setPassword("Test123@4");
//		this.clickLoginButton();
//		tokenPage.getTokenPageName();
//		controller.getDriver().getPageSource().contains("WELCOME");
//		tokenPage.setTokenInput("12345");
//		tokenPage.clickContinueButton();
//	}
//
}
