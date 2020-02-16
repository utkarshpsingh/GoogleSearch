package stepDefinitions;

import java.io.IOException;

import com.Google.qa.ApplicationFunctions.UserDefinedFuntions;
import com.Google.qa.base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch extends TestBase {
	
	UserDefinedFuntions objUDF = new UserDefinedFuntions();
	public static String CurrentScenarioName;
	
//Taking out the scenario name before stating the execution	
  @Before 
  public void before(Scenario s) {
  
  System.out.println("Currently Executig Scenario " + s.getName());
  CurrentScenarioName= s.getName();
  }
	
	@Given("^User launched the URL for the google search website$")
	public void user_launched_the_URL_for_the_google_search_website() throws IOException {
		//Calling from the TestBase class
		initialization(CurrentScenarioName);
		
	}

	
	@When("^The title of the page is google$")
	public void the_title_of_the_page_is_google() throws Throwable {
	    //getting the title of the google page
		String pageTitle= objUDF.fngetTitleOfThePage();
		
		System.out.println("The tile of the google page is : "+pageTitle);
			
	}

	
	@Then("^User enters his name in the search field, click on the search button and iterate the same Hundred times$")
	public void user_enters_his_name_in_the_search_field_click_on_the_search_button_and_iterate_the_same_Hundred_times() {
	//calling the public function defined in the Application Function package	
	objUDF.fnGoogleNameSearching(globalmap.get("Total Iteration").toString(),globalmap.get("Search Value").toString(), "");	
		   
	}


	@Then("^User close the google page\\.$")
	public void user_close_the_google_page() throws Throwable {
	   //Closing the opened google page after executing the script 
	    objUDF.fnCloseCurrentBrowser();
		
	}
	

}
