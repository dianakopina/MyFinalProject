package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;
import utils.AssertProvider;


import static java.lang.Thread.sleep;

public class CareerPageOpeningTest extends BaseTest{

    @Test
    public void careerPage() throws InterruptedException {
        HomePage homePage = new HomePage();

        homePage.openCareerPage();

        CareerPage careerPage = new CareerPage();
        AssertProvider.assertTrue(careerPage.isTextPresent("Working at Little Wonderland"), "Text not found on Career Page");

    }
}
