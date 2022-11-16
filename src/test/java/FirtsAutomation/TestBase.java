package FirtsAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    WebDriver driver;

    public void browse(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
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
