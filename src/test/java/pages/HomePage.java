package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

import static utils.DriverProvider.getCurrentDriver;

public class HomePage {

    String loginFieldXpath = "//input[@id='formLoginEmail']";
    String passwordFieldXpath = "//input[@id='formLoginPassword']";
    String loginButtonHref = "//a[@class='btn accent'][1]";

    String ProfileIcon = "//a[@href='#login-popup']";

    String LoggedProfileIcon = "//li[@class='hidden-xs'][1]";


    String login = "ikki12342@inbox.lv";
    String password = "Ikki1234!";



    public void clickProfileIcon() {

        WebElement userProfileIcon = getCurrentDriver().findElement(By.xpath(ProfileIcon));
        userProfileIcon.click();
    }

    public void clickLoggedProfileIcon() {

        WebElement userProfileIcon = getCurrentDriver().findElement(By.xpath(LoggedProfileIcon));
        userProfileIcon.click();
    }

    public void login() {
        WebElement loginField = getCurrentDriver().findElement(By.xpath(loginFieldXpath));
        ((JavascriptExecutor) getCurrentDriver()).executeScript("arguments[0].scrollIntoView(true);", loginField);

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginField));

        loginField.sendKeys(login);

        WebElement passwordField = getCurrentDriver().findElement(By.xpath(passwordFieldXpath));
        WebElement loginButton = getCurrentDriver().findElement(By.xpath(loginButtonHref));

        passwordField.sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        loginButton.click();

    }


    public void openCareerPage() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getCurrentDriver();
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));
        WebElement copyrightElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='copyright']")));
        js.executeScript("arguments[0].scrollIntoView();", getCurrentDriver().findElement(By.xpath("//div[@class='copyright']")));

        WebElement careerButton = getCurrentDriver().findElement(By.xpath("//a[@href='https://www.littlewonderland.nl/en/service/vacatures/']"));
        careerButton.click();

    }

}
