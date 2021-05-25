package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;



public class Facebooklogin{
	Controller controller;
	LoginPage LoginPage;
	

	public Facebooklogin(Controller controller) {
		this.controller = controller;
		LoginPage = new LoginPage(this.controller);
		
	}
	
	@Given("user is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {
		LoginPage.confirmLoginButton();
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) {
		LoginPage.enterEmail(Email);
		LoginPage.enterPassword(Password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		LoginPage.clickLoginButton();
	}

	@Then("should be navigated to the dashboard")
	public void should_be_navigated_to_the_dashboard() {
		LoginPage.verifyLogin();
	}
	
	@And("post a message {string}")
	public void post_a_message_(String Status) {
		LoginPage.postStatus(Status);

	}
}