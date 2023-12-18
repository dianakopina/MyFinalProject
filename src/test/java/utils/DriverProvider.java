package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


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
