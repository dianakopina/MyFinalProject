package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class DriverProvider {
    static WebDriver driver;

    public static WebDriver getCurrentDriver(){
        if (driver == null) {
            init();
        } return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }

    private static void init(){
        WebDriverManager.chromedriver().setup();
        driver= new FirefoxDriver();
    }


}
