package FirtsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FirstTest {

    @Test
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





}
