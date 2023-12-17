package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverProvider;

import static java.lang.Thread.sleep;
import static utils.DriverProvider.closeDriver;
import static utils.DriverProvider.getCurrentDriver;

import java.time.Duration;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        getCurrentDriver().get("https://www.littlewonderland.nl/en/");
    }

    @AfterMethod
    public void tearDown(){
        closeDriver();
    }
}