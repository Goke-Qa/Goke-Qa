package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Facebook_loginPage;



public class Login_to_facebook{
	Controller controller;
	Facebook_loginPage Facebook_loginPage;
	

	public Login_to_facebook(Controller controller) {
		this.controller = controller;
		Facebook_loginPage = new Facebook_loginPage(this.controller);
		
	}

	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    Facebook_loginPage.confirmLoginButton();
	}

	@When("user inputs valid login credentials")
	public void user_inputs_valid_login_credentials() {
		Facebook_loginPage.enterCreds();
		Facebook_loginPage.enterPassword();
	}

	@When("click on login button")
	public void click_on_login_button() {
	    Facebook_loginPage.clickLoginButton();
	}

	@Then("user should be navigated to the dashboard")
	public void user_should_be_navigated_to_the_dashboard() {
	    Facebook_loginPage.verifyLogin();
	}

	@Then("post a message {string}")
	public void post_a_message(String Status) {
	   Facebook_loginPage.postStatus(Status);
	}

}
