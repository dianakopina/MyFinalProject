package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import static utils.DriverProvider.getCurrentDriver;

public class UserProfilePage{

    String userProfilePageUrlContains = "account";

    public boolean isUserProfilePageOpened() {
        return getCurrentDriver().getCurrentUrl().contains(userProfilePageUrlContains);
    }

}
