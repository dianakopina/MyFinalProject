package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import static utils.DriverProvider.getCurrentDriver;

public class HomePage {

    String loginFieldXpath = "//input[@id='formLoginEmail']";
    String passwordFieldXpath = "//input[@id='formLoginPassword']";
    String loginButtonHref = "//a[@class='btn accent'][1]";
    String profileIconXpath = "//a[@href='#login-popup']";
    String loggedProfileIconXpath = "//li[@class='hidden-xs'][1]";
    String careerFooterButtonXpath = "//a[@href='https://www.littlewonderland.nl/en/service/vacatures/']";
    String copyrightTextXpath = "//div[@class='copyright']";


    String login = "ikki12342@inbox.lv";
    String password = "Ikki1234!";



    public void clickProfileIcon() {

        WebElement userProfileIcon = getCurrentDriver().findElement(By.xpath(profileIconXpath));
        userProfileIcon.click();
    }

    public void clickLoggedProfileIcon() {

        WebElement userProfileIcon = getCurrentDriver().findElement(By.xpath(loggedProfileIconXpath));
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


    public void openCareerPage() {

        JavascriptExecutor js = (JavascriptExecutor) getCurrentDriver();
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));
        WebElement copyrightElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copyrightTextXpath)));
        js.executeScript("arguments[0].scrollIntoView();", getCurrentDriver().findElement(By.xpath(copyrightTextXpath)));

        WebElement careerButton = getCurrentDriver().findElement(By.xpath(careerFooterButtonXpath));
        careerButton.click();

    }

}
