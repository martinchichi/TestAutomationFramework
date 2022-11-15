package FirtsAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FirstTest {


    @Test (priority = 1)
    public void testManual() {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("incognito");

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.infobae.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test (priority = 2)
    public void testAutomatic(){

        //apertura con WebdriverManager
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.lanacion.com.ar/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.quit();
    }



}
