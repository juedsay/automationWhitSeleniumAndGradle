package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    
    @Given("I am on the Google search page")
    public void navigateToGoogle() {
        
        google.navigateToGoogle();
    }

    @When("I search for a criteria")
    public void enterSearchCriteria(String query) {
        
    }

    @And ("Click on the search button")
    public void clickSearchButton() {
        
    }

    @Then ("The results match the criteria")
    public void validateResults(String query) {
        
    }
}
