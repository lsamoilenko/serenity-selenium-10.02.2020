package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class SearchTest extends BaseTest {

    @Before
    public void before(){
        user
                .auth()
                .login("linkedin_tst@i.ua","Qwerty123");
    }

    @Test
    public void searchBySearchTermTest(){
        user
                .validatePageTitle("")
                .homePage()
                .searchFor("hr");
        user
                .validatePageTitle("")
                .searchPage()
                .verifyEachResultContains("hr");
    }
}
