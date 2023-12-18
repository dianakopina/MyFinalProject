package pages;

import static utils.DriverProvider.getCurrentDriver;

public class UserProfilePage{

    String userProfilePageUrlContains = "account";

    public boolean isUserProfilePageOpened() {
        return getCurrentDriver().getCurrentUrl().contains(userProfilePageUrlContains);
    }

}
