package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utilities.Hooks;

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
    public void aUserClickOnRunButton() {
    }

    @Then("^the text (.*) is displayed in the Output Window$")
    public void theTextIsDisplayedInTheOutputWindow(String windowOutput)  {

    }
}
