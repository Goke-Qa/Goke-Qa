package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Controller;

public class Wallet_Hub_reviewPage {
	
	Controller controller;
	
	@FindBy(xpath = "//span[@class='logo-anchor-text']")
	@CacheLookup
	WebElement imageWalletHub;
	
	@FindBy(xpath = "//span[@class='brgm-button brgm-signup brgm-signup-login']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='btn blue center reg-tabs-bt touch-element-cl']")
	@CacheLookup
	WebElement btnLogin1;
	
	@FindBy(xpath = "//nav[@class='burger-menu-right-menu']/a[.='My Wallet']")
	@CacheLookup
	WebElement myWallet;
	
	@FindBy(xpath = "//button[@class='btn blue-brds']")
	@CacheLookup
	WebElement btnWriteareview;
	
	@FindBy(xpath = "//span[@class='sbn-back-txt semi-bold-font inline-block']")
	@CacheLookup
	WebElement imageBack;
	
	@FindBy(css = "write-review svg:nth-of-type(1) > g")
	@CacheLookup
	WebElement firstStar;
	
	@FindBy(css = "write-review svg:nth-of-type(2) > g")
	@CacheLookup
	WebElement secondStar;
	
	@FindBy(css = "write-review svg:nth-of-type(3) > g")
	@CacheLookup
	WebElement thirdStar;
	
	@FindBy(css = "write-review svg:nth-of-type(4)")
	@CacheLookup
	WebElement fourthStar;
	
	@FindBy(xpath = "//span[.='Select...']")
	@CacheLookup
	WebElement btnSelect;
	
	@FindBy(xpath = "//li[.='Health Insurance']")
	@CacheLookup
	WebElement btnHealthInsurance;
	
	@FindBy(xpath = "//textarea[@class='textarea wrev-user-input validate']")
	@CacheLookup
	WebElement txtReview;
	
	@FindBy(xpath = "//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")
	@CacheLookup
	WebElement btnSubmit;
	
	public Wallet_Hub_reviewPage(Controller controller) {
		this.controller = controller;
		
		PageFactory.initElements(controller.getDriver(), this);
	}
	
	public void verifyURLlaunch() {
		imageWalletHub.isDisplayed();
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void enterEmail() {
		txtEmail.sendKeys("theseleniumtest@gmail.com");
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Banking1!");
	}
	
	public void clickLogin1() {
		btnLogin1.click();
	}
	
	public void verifyDashboard() {
		myWallet.isDisplayed();
	}
	
	public void clickWriteReview() {
		btnWriteareview.click();
	}
	
	public void verifyReviewPage() {
		imageBack.isDisplayed();
	}
	
	public void mouseHover() {
		Controller driver = controller;
		Actions act=new Actions(controller.getDriver());
		act.moveToElement(firstStar).build().perform();
		act.moveToElement(secondStar).build().perform();
		act.moveToElement(thirdStar).build().perform();
		act.moveToElement(fourthStar).click().build().perform();
	}
	
	public void clickSelect() {
		btnSelect.click();
	}
	
	public void clickHealth() {
		btnHealthInsurance.click();
	}
	
	public void typeReview() {
		txtReview.sendKeys("In 2020, the average national cost for health insurance is $456 "
				+ "for an individual and $1,152 for a family per month. However, costs vary "
				+ "among the wide selection of health plans. Understanding health.");
	}
	
	public void clickSubmit() {
		btnSubmit.click();

		
	}

}
