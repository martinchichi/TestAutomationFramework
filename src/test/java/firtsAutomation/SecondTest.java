package firtsAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SecondTest {

    @BeforeTest
    public void getDriver(){
        WebDriverManager.firefoxdriver().setup();
    }

    @Test (priority = 1)
    public void testManual() {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.infobae.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test (priority = 2)
    public void testAutomatic(){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.lanacion.com.ar/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.quit();
    }



}
