package FirtsAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    WebDriver driver;

    public void browse(){
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.lanacion.com.ar/");
        driver.manage().window().maximize();
    }

    public void browse(String url){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void quit(){
        driver.quit();
    }

}
