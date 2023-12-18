package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserProfilePage;
import utils.AssertProvider;



public class SuccessfulLoginTest extends BaseTest {

    @Test
    public void openLogin() {

        HomePage homePage = new HomePage();

        homePage.clickProfileIcon();
        homePage.login();
        homePage.clickLoggedProfileIcon();

        UserProfilePage userProfilePage = new UserProfilePage();

        AssertProvider.assertTrue(userProfilePage.isUserProfilePageOpened(), "Login was unsuccessful");
    }
}
