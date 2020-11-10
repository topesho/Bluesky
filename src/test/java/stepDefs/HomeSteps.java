package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utilities.Hooks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertTrue;

public class HomeSteps {
    public WebDriver driver;

    HomePage homePage;

    public HomeSteps(Hooks hooks) {
        this.driver = hooks.getDriver();
        homePage = new HomePage(hooks);
    }

    @Given("^a user navigate to (.*)")
    public void aUserNavigateTo(String url)  {
     homePage.navigateToUrl(url);
    }

    @And("^a user click on run button$")
    public void aUserClickOnRunButton() {homePage.clickRunButton();
    }

    @Then("^the text (.*) is displayed in the Output Window$")
    public void theTextIsDisplayedInTheOutputWindow(String windowOutput)  {

        /**
         * hamcrest assertion
         */
          assertThat(homePage.getWindowOutputText(), equalToIgnoringCase(windowOutput));
          assertThat(homePage.isWindowOutputDisplayed(),equalTo(true));

        /**
         * Junit assertion
         */
        assertTrue(homePage.isWindowOutputDisplayed());
        assertTrue(homePage.getWindowOutputText().contentEquals(windowOutput));

    }
}
