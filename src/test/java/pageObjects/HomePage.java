package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Hooks;


public class HomePage {

    public WebDriver driver;

    By runButton = By.id("run-button");
    By windowOutPut = By.cssSelector("div[id='output']");

    public HomePage(Hooks hooks) {
        driver = hooks.getDriver();
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void clickRunButton(){
       driver.findElement(runButton).click();
    }

    public Boolean isWindowOutputDisplayed(){
        return driver.findElement(windowOutPut).isDisplayed();
    }

    public String getWindowOutputText(){
        return driver.findElement(windowOutPut).getText();
    }

}
