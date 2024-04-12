import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        //connectiong with the webdriver
        System.setProperty("webdriver.chrome.driver", "bdd-implementation/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //defining timeouts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //navigating to a page
        driver.get("https://google.com");        

        driver.navigate().to("https://automationstepbystep.com");
        
        System.out.println("url: " + driver.getCurrentUrl());
        System.out.println("title: " + driver.getTitle());

        driver.navigate().back();
        Thread.sleep(2000);        
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();                

        Thread.sleep(2000);
        
        driver.close();
    }
}
