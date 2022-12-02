package challengePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;


public class LumaHomePage extends  BasePage {

    //    ChromeDriver driver;
    WebDriver driver;
    By welcomeMsg= By.cssSelector("header>div> div > ul > .greet.welcome > .not-logged-in");
    By locatorCreateAnAccountLink = By.cssSelector("header>div>div>ul>li:nth-child(3)");

    //    Constructor for page object
    public LumaHomePage(WebDriver driver) {
        super.driver = driver;
    }
    public void welcomeMsg(){
        getElement(welcomeMsg).getText().contains("welcome");
        assertEquals(welcomeMsg,welcomeMsg);
    }

    public void clickCreateAnAccountLink(){
        getElement(locatorCreateAnAccountLink).click();
    }
}
