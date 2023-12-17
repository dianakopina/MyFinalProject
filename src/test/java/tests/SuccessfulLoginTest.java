package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.HomePage;
import pages.UserProfilePage;
import utils.AssertProvider;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static utils.DriverProvider.getCurrentDriver;

public class SuccessfulLoginTest extends BaseTest {

    @Test
    public void openLogin() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));

        HomePage homePage = new HomePage();

        homePage.clickProfileIcon();
        homePage.login();
        homePage.clickLoggedProfileIcon();

        UserProfilePage userProfilePage = new UserProfilePage();

        AssertProvider.assertTrue(userProfilePage.isUserProfilePageOpened(), "Login was unsuccessful");

    }
}
