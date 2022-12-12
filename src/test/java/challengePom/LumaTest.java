package challengePom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class LumaTest {

    //inicializar el driver
    public WebDriver driver = new ChromeDriver();
    LumaHomePage lumaHomePage;
    LumaCreateAccountPage lumaCreateAccountPage;
    LumaMyAccountPage lumaMyAccountPage;

    String url="https://magento.softwaretestingboard.com/";

    @BeforeTest
    public void setUp(){
        lumaHomePage = new LumaHomePage(driver);
        lumaCreateAccountPage=new LumaCreateAccountPage(driver);
        lumaMyAccountPage =new LumaMyAccountPage(driver);
        lumaHomePage.openBrowser(url);
        System.out.println("Create an account with random data and log in");
    }

    @Test (priority = 1)
    public void navigateHomePageAndCreateAnAccount(){
        lumaHomePage.welcomeMsg();
        lumaHomePage.clickCreateAnAccountLink();
    }

    @Test (priority = 2)
    public void createAnAccount(){
        lumaCreateAccountPage.createNewCustomerAccountMsg();
        lumaCreateAccountPage.enterFirstName();
        lumaCreateAccountPage.enterLastName();
        lumaCreateAccountPage.enterEmail();
        lumaCreateAccountPage.enterPassword();
        lumaCreateAccountPage.clickOnCreateAccountButton();
    }

    @Test (priority = 3)
    public void verifyAccountCreation(){
//        lumaMyAccountPage=new LumaMyAccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lumaMyAccountPage.locatorRegisteredMessage));
//        lumaMyAccountPage.myAccountWelcomeMsg();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        System.out.println("Exit Test");
    }


}
