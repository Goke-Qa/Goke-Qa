package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Wallet_Hub_reviewPage;


public class Post_Review_on_Wallet_Hub {
	Controller controller;
	Wallet_Hub_reviewPage Wallet_Hub_reviewPage;
	
	public Post_Review_on_Wallet_Hub(Controller controller) {
		this.controller = controller;
		Wallet_Hub_reviewPage = new Wallet_Hub_reviewPage(this.controller);
	}
		
		@Given("user has lauched the Wallet Hub URL")
		public void user_has_lauched_the_wallet_hub_url() {
		    Wallet_Hub_reviewPage.verifyURLlaunch();
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
		    Wallet_Hub_reviewPage.clickLogin();
		    Wallet_Hub_reviewPage.enterEmail();
		    Wallet_Hub_reviewPage.enterPassword();
		    Wallet_Hub_reviewPage.clickLogin1();
		}

		@And("user is navigated to the dashboard")
		public void user_is_navigated_to_the_dashboard() {
		   Wallet_Hub_reviewPage.verifyDashboard();
		}

		@Then("click on write a review")
		public void click_on_write_a_review() {
		    Wallet_Hub_reviewPage.clickWriteReview();
		    Wallet_Hub_reviewPage.verifyReviewPage();
		}
		
		@And("hover on the rating")
		public void hover_on_the_rating() {
			 Wallet_Hub_reviewPage.mouseHover();
		}


		@And("write a review")
		public void write_a_review() {
		    Wallet_Hub_reviewPage.clickSelect();
		    Wallet_Hub_reviewPage.clickHealth();
		    Wallet_Hub_reviewPage.typeReview();
		}

		@Then("submit")
		public void submit() {
		   Wallet_Hub_reviewPage.clickSubmit();
		}

	}


