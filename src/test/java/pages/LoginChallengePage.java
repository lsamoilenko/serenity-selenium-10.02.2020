package pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginChallengePage extends PageObject {
    @FindBy(xpath = "//h1/../p")
    private WebElement headerMessage;
    public String getHeaderMessageText(){
        return headerMessage.getText();
    }
}