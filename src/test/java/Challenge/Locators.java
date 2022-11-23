package Challenge;

import org.openqa.selenium.By;

public class Locators {
    By locatorFirstName = By.id("firstname");
    By locatorLastName = By.id("lastname");
    By locatorEmail = By.id("email_address");
    By locatorPassword= By.id("password");
    By locatorPswdConfirmation= By.id("password-confirmation");
    By locatorCreateAccountButton = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    //By locatorCreateAccountButton = By.cssSelector("body.customer-account-create.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.columns:nth-child(4) div.column.main form.form.create.account.form-create-account:nth-child(3) div.actions-toolbar:nth-child(4) div.primary button.action.submit.primary > span:nth-child(1)");
    By locatorCreateAccount = By.linkText("Create an Account");
}
