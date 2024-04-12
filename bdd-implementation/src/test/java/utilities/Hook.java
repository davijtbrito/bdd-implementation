package utilities;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class Hook {

    public static WebDriver driver;
    @Before(order = 1)
    public static void setup() {
        WebDriverManager.chromedriver().setup();

        //connectiong with the webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        Hook.driver = new ChromeDriver();

        //defining timeouts
        Hook.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Hook.driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
        Hook.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @After(order = 1)
    public static void teardown() {
        Hook.driver.close();        
    }
}
