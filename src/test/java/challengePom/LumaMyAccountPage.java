package challengePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.testng.Assert.assertEquals;

public class LumaMyAccountPage  extends BasePage{
//    WebDriver driver;
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    By locatorRegisteredMessage= By.cssSelector("div.message-success.success.message");
//    By locatorRegisteredMessage= By.cssSelector("body.account.customer-account-index.page-layout-2columns-left:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.page.messages:nth-child(2) div:nth-child(2) div.messages div.message-success.success.message > div:nth-child(1)");

    public LumaMyAccountPage(){
        super(driver);
    }

    public void myAccountWelcomeMsg(){

//        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRegisteredMessage));
//        getElement(locatorRegisteredMessage).getText().contains("registering");
//        assertEquals(locatorRegisteredMessage,locatorRegisteredMessage);
        getElement(locatorRegisteredMessage).getText().contains("registering");
        String registeredMessage = driver.findElement(locatorRegisteredMessage).getText();
//        assertEquals(registeredMessage,registeredMessage);
        assertEquals(locatorRegisteredMessage,locatorRegisteredMessage);

    }
}
