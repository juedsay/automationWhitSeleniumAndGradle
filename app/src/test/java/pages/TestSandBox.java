package pages;

import org.openqa.selenium.WebDriver;

public class TestSandBox extends BasePage{

    private String categoryDropdown = "//select[@id='testingDropdown']";

    public TestSandBox() {
        super(driver);        
    }

    public void navigateToSandbox() {
        navigateTo("https://www.testanquiz.com/selenium/testing.html");
    }

    public void selectCategory(String category) {
        selectFromDropdownByValue(categoryDropdown, category);
    }

}
