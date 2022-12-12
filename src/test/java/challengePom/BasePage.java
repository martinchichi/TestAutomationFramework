package challengePom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait;

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/chromedriver_win32/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }
    public void openBrowser(String url){
        driver.get(url);
        driver.manage().window().maximize();
     }

     public WebElement getElement(By element){
        return driver.findElement(element);
     }

     public void waitElement(By loc){
         this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
     }


     public void quit(){
        driver.quit();
     }

     public void setWait(By el){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         wait.until(ExpectedConditions.visibilityOfElementLocated(el));
     }




}
