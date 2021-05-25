package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Controller;

public class Facebook_loginPage {
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
	WebElement dashboard;
	
	@FindBy(xpath = "//div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 kbf60n1y']")
	@CacheLookup
	WebElement btnStatus;
	
	@FindBy(xpath = "//div[@class='rq0escxv datstx6m k4urcfbm a8c37x1j']//div[@class='_1mf _1mj']")
	@CacheLookup
	WebElement txtPost;
	
	@FindBy(xpath = "//div[@class='k4urcfbm dati1w0a hv4rvrfc i1fnvgqd j83agx80 rq0escxv bp9cbjyn discj3wi']//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4']")
	@CacheLookup
	WebElement btnPost;
	
	
	public Facebook_loginPage(Controller controller) {
		this.controller = controller;
		
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void enterCreds() {
		txtEmail.sendKeys("");  //input valid email here
	}
	public void enterPassword() {
		txtPassword.sendKeys("");	//input a password here
	}
	public void clickLoginButton() {
		btnLogin.click();
	}
	public void verifyLogin() {
		dashboard.isDisplayed();
	
	}
	
	public void confirmLoginButton() {
		btnLogin.isDisplayed();
	}
	
	public void postStatus(String Status) {
		btnStatus.click();
		txtPost.sendKeys(Status);
		btnPost.click();
		
	}

}
	
	