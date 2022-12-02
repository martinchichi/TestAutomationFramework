package challengePom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public void setUpBrowser(WebDriver driver){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void openBrowser(String url){
        driver.get(url);
        driver.manage().window().maximize();
     }

     public WebElement getElement(By element){
        return driver.findElement(element);
     }

     public void quit(){
        driver.quit();
     }

     public void setWait(By el){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         wait.until(ExpectedConditions.visibilityOfElementLocated(el));
     }




}
