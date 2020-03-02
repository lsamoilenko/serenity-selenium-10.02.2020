package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@At("https://www.linkedin.com/feed/")

public class HomePage extends PageObject {

    @FindBy(xpath = "//li[@id='profile-nav-item']")
    private WebElement profileNavItem;
    @FindBy (xpath  ="//div[@data-control-name='identity_welcome_message']")
    private WebElement welcomeMessage;
    @FindBy(xpath = "//form[@id='extended-nav-search']//input")
    private WebElement searchField;

    public void searchFor(String searchTerm){
        searchField.sendKeys(searchTerm);
        searchField.sendKeys(Keys.ENTER);
    }

    public  boolean isPageLoaded(){
        return profileNavItem.isDisplayed();
    }
}
