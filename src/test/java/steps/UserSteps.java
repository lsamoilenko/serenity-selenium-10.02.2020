package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.LandingPage;

public class UserSteps extends ScenarioSteps {

    private LandingPage landingPage;
    private LoginChallenge loginChallenge;

    @Step
    public UserSteps login(String userEmail, String userPassword){
        landingPage.open();
        landingPage.login(userEmail,userPassword);
        waitABit(60000);
        return this;
    }

    @Step
    public UserSteps validatePageHeader(String expectedMessage) {
        //String actualMessage = loginChallenge.element(loginChallenge.headerMessage).getText();
        Assert.assertEquals("Wrong header message.",expectedMessage, loginChallenge.getHeaderMessageText());
        return this;
    }

}