package pages;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;


public class ListPage extends BasePage {

    public ListPage() {
        super(driver);
    }

    private String searchField = "//body/div[1]/div[1]/div[1]/span[1]/input[2]";
    private String searchResults = "tt-suggestion";

    public void navigateToListPage(){
        navigateTo("https://twitter.github.io/typeahead.js/examples/");
    }

    public void enterSearchCriteria() throws InterruptedException {
        Thread.sleep(600);//I use this "sleep" because in the list of this website is necessary
        write(searchField, "Washington");
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFormList = new ArrayList<String>();
        for (WebElement e: list){
            stringFormList.add(e.getText());
        }
        return stringFormList;
    }
    
}
