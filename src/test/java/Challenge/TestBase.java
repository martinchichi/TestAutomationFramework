package Challenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;

    public void setUpBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void openBrowser(String url){
        driver.get(url);
        driver.manage().window().maximize();
     }

     public void quit(){
        driver.quit();
     }


}
