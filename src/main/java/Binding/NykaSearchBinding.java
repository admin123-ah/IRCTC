package Binding;

import org.openqa.selenium.WebDriver;

import Pages.NykaaHomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaSearchBinding {
	
	public static WebDriver driver;
	public static String URl="https://www.nykaa.com/";

	 @Given("^Launch the Application$")
	    public void launch_the_application() throws Throwable {
	        
	    }

	    @When("Click search area$")
	    public void lick_search_area() throws Throwable {
	    	
	    	NykaaHomePage.ClickAndEnterTextInSearchArea(null, null);
	      
	    }

	    @When("^I enterd th prodct$")
	    public void i_enterd_th_prodct() throws Throwable {
	        
	    }

	    @When("^I selected data from suggested$")
	    public void i_selected_data_from_suggested() throws Throwable {
	        
	    }

	    @Then("^I verified the seach result$")
	    public void i_verified_the_seach_result() throws Throwable {
	      
	    }

}

