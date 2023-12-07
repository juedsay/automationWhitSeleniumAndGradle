package steps;

import cucumber.api.java.en.*;
import pages.SandBoxPage;

public class SandBoxSteps {
    
    SandBoxPage sandboxPage = new SandBoxPage();

    @Given("I navigate to the sandbox")
    public void navigateToSandboxSite() {
        sandboxPage.navigateToSandbox();
    }

    @And("Select a value from the dropdown")
    public void selectState() {
        sandboxPage.selectCategory("FunctionTesting");
    }
}
