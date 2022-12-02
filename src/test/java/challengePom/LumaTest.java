package challengePom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class LumaTest {

    WebDriver driver;
    LumaHomePage lumaHomePage;
    LumaCreateAccountPage lumaCreateAccountPage;
    LumaMyAccountPage lumaMyAccountPage;

    String url="https://magento.softwaretestingboard.com/";

    @BeforeTest
    public void setUp(){
        driver.get(url);
        lumaHomePage.openBrowser(url);
        System.out.println("Log in test with random data");
    }
    @Test (priority = 1)
    public void navigateHomePageAndCreateAnAccount(){
        lumaHomePage = new LumaHomePage(driver);
        lumaHomePage.welcomeMsg();
        lumaHomePage.clickCreateAnAccountLink();
    }
    @Test (priority = 2)
    public void createAnAccount(){
        lumaCreateAccountPage=new LumaCreateAccountPage(driver);

        lumaCreateAccountPage.createNewCustomerAccountMsg();
        lumaCreateAccountPage.enterFirstName();
        lumaCreateAccountPage.enterLastName();
        lumaCreateAccountPage.enterEmail();
        lumaCreateAccountPage.enterPassword();
        lumaCreateAccountPage.clickOnCreateAccountButton();
    }

    @Test (priority = 3)
    public void verifyAccountCreation(){
        lumaMyAccountPage=new LumaMyAccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lumaMyAccountPage.locatorRegisteredMessage));
        lumaMyAccountPage.myAccountWelcomeMsg();
    }

    @AfterTest
    public void closeBrowser() {
        //  driver.quit();
        System.out.println("Exit Test");
    }


}
