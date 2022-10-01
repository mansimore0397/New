package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepGuide {
	
	@Given("User Opens {string}")
	public void user_opens(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User entred url " + string);
	   
	}

	@Given("User Enters UserName {string}")
	public void user_enters_user_name(String string) {
		System.out.println("User entred Username " +string);
	   
	}

	@Given("User Enters Password {string}")
	public void user_enters_password(String string) {
		System.out.println("User entred password " +string);
	    
	}

	@Then("User Clicked Login Button")
	public void user_clicked_login_button() {
		System.out.println("User click on login ");
	    
	}
	@Given("user opens1 {string}")
	public void user_opens1(String string) {
		System.out.println("User entred URL1 " +string);
	}

	@Then("user search {string}")
	public void user_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User entred search parameter " +string);
	}

	@Then("user clicks search Button")
	public void user_clicks_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User see paramter  ");
	}
	


}
