package pages;

public class SandBoxPage extends BasePage {

    private String categoryDropdown = "//select[@id='testingtypes']";

    public SandBoxPage() {
        super(driver); 
    }

    public void navigateToSandbox() {
        navigateTo("https://automationpractice.qualitytestinghub.com/dropdown-list/");
    }

    public void selectCategory(String category) {
        selectFromDropdownByValue(categoryDropdown, category);
    }

}
