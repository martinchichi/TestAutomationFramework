package challengePom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class LumaCreateAccountPage extends BasePage{

//    WebDriver driver;
    By locatorFirstName = By.id("firstname");
    By locatorLastName = By.id("lastname");
    By locatorEmail = By.id("email_address");
    By locatorPassword= By.id("password");
    By locatorPswdConfirmation= By.id("password-confirmation");
    By locatorCreateAccountButton = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    By locatorCreateNewCustomerAccountMsg= By.cssSelector("body.customer-account-create.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.page-title-wrapper:nth-child(2) h1.page-title > span.base");

    public LumaCreateAccountPage() {
        super(driver);
    }
    public void createNewCustomerAccountMsg(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorCreateNewCustomerAccountMsg));
//        String getCreateNewCustomerAccountMsg = driver.findElement(locatorCreateNewCustomerAccountMsg).getText().contains("Create");
        getElement(locatorCreateNewCustomerAccountMsg).getText().contains("Create");
        assertEquals(locatorCreateNewCustomerAccountMsg,locatorCreateNewCustomerAccountMsg);
    }
    public void enterFirstName(){
        String firstName = RandomStringUtils.randomAlphabetic(8);
        driver.findElement(locatorFirstName).sendKeys(firstName);
    }
    public void enterLastName(){
        String lastName = RandomStringUtils.randomAlphabetic(8);
        driver.findElement(locatorLastName).sendKeys(lastName);
    }
    public void enterEmail(){
        String email = RandomStringUtils.randomAlphabetic(8);
        driver.findElement(locatorEmail).sendKeys(email+ "@test.net");
    }
    public void enterPassword(){
        String password = RandomStringUtils.randomAlphanumeric(9);
        driver.findElement(locatorPassword).sendKeys(password);
        driver.findElement(locatorPswdConfirmation).sendKeys(password);
    }
    public void clickOnCreateAccountButton(){
//        driver.findElement(locatorCreateAccountButton).click();
        getElement(locatorCreateAccountButton).click();
    }





}
