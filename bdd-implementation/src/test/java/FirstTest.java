import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args){

        //connectiong with the webdriver
        System.setProperty("webdriver.chrome.driver", "bdd-implementation/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //defining timeouts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //navigating to a page
        driver.get("http://goodle.com");

        //ending browser
        driver.close();
    }
}
