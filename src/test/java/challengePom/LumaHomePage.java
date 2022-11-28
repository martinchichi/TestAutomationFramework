package challengePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class LumaHomePage {

    WebDriver driver;
    By welcomeMsg= By.cssSelector("body.cms-home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) header.page-header div.panel.wrapper div.panel.header ul.header.links li.greet.welcome:nth-child(1) > span.not-logged-in");
    By locatorCreateAnAccountLink = By.xpath("body.cms-home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) header.page-header div.panel.wrapper div.panel.header ul.header.links li:nth-child(3) > a:nth-child(1)");

    //Constructor for page object
    public LumaHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void welcomeMsg(){
        String getWelcomeMsg = driver.findElement(welcomeMsg).getText();
        assertEquals(welcomeMsg,welcomeMsg);
    }

    public void clickCreateAnAccountLink(){
        driver.findElement(locatorCreateAnAccountLink).click();
    }
}
