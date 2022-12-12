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
        lumaHomePage = new LumaHomePage();
        lumaCreateAccountPage=new LumaCreateAccountPage();
        lumaMyAccountPage =new LumaMyAccountPage();
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
        lumaCreateAccountPage.waitElement(lumaMyAccountPage.locatorRegisteredMessage);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        System.out.println("Exit Test");
    }


}
