package pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;


public class ListPage extends BasePage {

    public ListPage() {
        super(driver);
    }

    private String searchField = "//body/div[1]/div[7]/div[1]/span[1]/input[2]";
    private String searchResults = "tt-suggestion";

    public void navigateToListPage(){
        navigateTo("https://twitter.github.io/typeahead.js/examples/");
    }

    public void enterSearchCriteria() throws InterruptedException {
        try {
            Thread.sleep(600);//I use this "sleep" because in the list of this website is necessary (It is a particular case, it is not recommended to use it).
            write(searchField, "B");            
        } catch (NoSuchElementException e) {
            System.out.println("The WebElement Search couldn't be found.");
            e.printStackTrace();         
        }
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList = new ArrayList<String>();

        for (WebElement e: list){
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }
    
}
