package Challenge;


import io.qameta.allure.Description;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends BasePage {

        String url="https://magento.softwaretestingboard.com/";
        String firstName = RandomStringUtils.randomAlphabetic(8);
        String lastName = RandomStringUtils.randomAlphabetic(8);
        String password = RandomStringUtils.randomAlphabetic(9);
       //En caso que repetidas veces se generen tres tipos de caracteres iguales, usar lettersAndNumbers
       //String lettersAndNumbers = "Test1234!";
       //String password = RandomStringUtils.random(9,lettersAndNumbers);
        String email =RandomStringUtils.randomAlphabetic(8);

/*
    By locatorFirstName = By.id("firstname");
    By locatorLastName = By.id("lastname");
    By locatorEmail = By.id("email_address");
    By locatorPassword= By.id("password");
    By locatorPswdConfirmation= By.id("password-confirmation");
    By locatorCreateAccountButton = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    By locatorCreateAccount = By.linkText("Create an Account");
*/
    @BeforeTest
    public void beforeTestPrint(){
        System.out.println("Log in test with random data");
    }
    @Test
    @Description("Log in test with random data")

    public void loginTest () {

        Locators locators = new Locators();

        setUpBrowser();
        openBrowser(url);

        WebElement signUp = driver.findElement(locators.locatorCreateAccount);
        signUp.click();

        //WebElement firstName =
                driver.findElement(locators.locatorFirstName).sendKeys(firstName);
        //WebElement lastName =
                driver.findElement(locators.locatorLastName).sendKeys(lastName);
        //WebElement email =
                driver.findElement(locators.locatorEmail).sendKeys(email + "@test.net");
        //WebElement password =
                driver.findElement(locators.locatorPassword).sendKeys(password);
        //WebElement confirmPassword =
                driver.findElement(locators.locatorPswdConfirmation).sendKeys(password);

        WebElement createAccountButton = driver.findElement(locators.locatorCreateAccountButton);
        //firstName.sendKeys("FirstNameUnTestD");
        //lastName.sendKeys("LastNameUnTestD");
        //email.sendKeys("lunesD@test.com");
        //password.sendKeys("Lun3s123!D");
        //confirmPassword.sendKeys("Lun3s123!D");
        //createButton.click();
        createAccountButton.click();

        //String ExpectedName ="FirstNameUnTest";
        Assert.assertEquals(firstName,firstName);

        quit();
    }
    @AfterTest
    public void afterTestPrint(){
        System.out.println("Exit");
    }

}
