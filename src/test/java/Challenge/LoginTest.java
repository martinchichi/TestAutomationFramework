package Challenge;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends TestBase {
    String url="https://magento.softwaretestingboard.com/";


    @Test
    public void loginTest () {

        setUpBrowser();
        openBrowser(url);

        WebElement signUp = driver.findElement(By.linkText("Create an Account"));
        signUp.click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        WebElement lastName = driver.findElement(By.id("lastname"));
        WebElement email = driver.findElement(By.id("email_address"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
        WebElement createButton = driver.findElement(By.cssSelector("body.customer-account-create.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.columns:nth-child(4) div.column.main form.form.create.account.form-create-account:nth-child(3) div.actions-toolbar:nth-child(4) div.primary button.action.submit.primary > span:nth-child(1)"));


        firstName.sendKeys("FirstNameUnTestD");
        lastName.sendKeys("LastNameUnTestD");
        email.sendKeys("lunesD@test.com");
        password.sendKeys("Lun3s123!D");
        confirmPassword.sendKeys("Lun3s123!D");
        createButton.click();

        //String ExpectedName ="FirstNameUnTest";
        Assert.assertEquals("FirstNameUnTestD","FirstNameUnTestD");

        quit();

    }

}
