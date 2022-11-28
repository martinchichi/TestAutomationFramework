package challenge;


import io.qameta.allure.Description;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class Challenge extends BasePage {
    //Reference variable for each field
    String url="https://magento.softwaretestingboard.com/";
    String firstName = RandomStringUtils.randomAlphabetic(8);
    String lastName = RandomStringUtils.randomAlphabetic(8);
    //Hardcoded alphanumeric password
    //String lettersAndNumbers = "Test1234!";
    //String password = RandomStringUtils.random(9,lettersAndNumbers);
    String password = RandomStringUtils.randomAlphanumeric(9);
    String email =RandomStringUtils.randomAlphabetic(8);

    //Initialize object 'locators'
    Locators locators = new Locators();

    //Message before test begins
    @BeforeTest
    public void beforeTestPrint(){
        System.out.println("Log in test with random data");
    }

    @Test
    @Description("Log in test with random data")

    public void loginTest () {
        //Initialize driver variable using ChromeDriver
        setUpBrowser();
        //Open and maximize browser
        openBrowser(url);
        //Search and click on 'create account' link
        WebElement createAnAccount = driver.findElement(locators.locatorCreateAnAccount);
        createAnAccount.click();
        //Enters data for each box
        driver.findElement(locators.locatorFirstName).sendKeys(firstName);
        driver.findElement(locators.locatorLastName).sendKeys(lastName);
        driver.findElement(locators.locatorEmail).sendKeys(email + "@test.net");
        driver.findElement(locators.locatorPassword).sendKeys(password);
        driver.findElement(locators.locatorPswdConfirmation).sendKeys(password);
        //Search and click on 'Create account' button
        WebElement createAccountButton = driver.findElement(locators.locatorCreateAccountButton);
        createAccountButton.click();

        //Explicit wait - to wait for 'Registered message' being displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.locatorRegisteredMessage));
        driver.findElement(locators.locatorRegisteredMessage);
        //Verify that account name is equal to the one created
        Assert.assertEquals(firstName,firstName);
    }

//    @AfterTest
//        public void closeBrowser(){
//        driver.quit();
//    }

    //Message after test was executed
    @AfterTest
    public void afterTestPrint(){
        System.out.println("Exit Test");
    }

}
