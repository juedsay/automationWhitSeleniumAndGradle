package steps;

import java.util.List;
import cucumber.api.java.en.*;
import pages.ListPage;

public class ListSteps {
    
    ListPage list = new ListPage();

    @Given("I navigate to the list page")
    public void navigateToListPage(){
        list.navigateToListPage();
    }

    @When("I search (.+) in the list")
    public void searchTheList(String state) throws InterruptedException {
        list.enterSearchCriteria(state);
    }

    @Then("I can find (.+) in the list")
    public void theCityIsThere(String team){
        List<String> lista = list.getAllSearchResults();
        boolean textIsThere = lista.contains(team);

        if(textIsThere){
            System.out.println("The team is on the list: PASSED.");
        }else{
            throw new Error("The team is not on the list: FAILED!");
        }        
    }
}
