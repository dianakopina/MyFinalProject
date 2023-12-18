package tests;

import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;
import utils.AssertProvider;


public class CareerPageOpeningTest extends BaseTest{

    @Test
    public void careerPage() {
        HomePage homePage = new HomePage();

        homePage.openCareerPage();

        CareerPage careerPage = new CareerPage();
        AssertProvider.assertTrue(careerPage.isTextPresent("Working at Little Wonderland"), "Text not found on Career Page");

    }
}
