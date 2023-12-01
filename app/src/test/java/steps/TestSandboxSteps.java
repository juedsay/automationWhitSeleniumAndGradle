package steps;

import io.cucumber.java.en.*;
import pages.SandBoxPage;

public class TestSandBoxSteps {
    
    SandBoxPage sandboxPage = new SandBoxPage();

    @Given("I navigate to the sandbox page")
    public void navigateToSandboxPage() {
        sandboxPage.navigateToSandbox();
    }

    @And("Select a value from the dropdown")
    public void selectState() {
        sandboxPage.selectCategory("FunctionTesting");
    }
}
