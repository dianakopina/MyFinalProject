package utils;

import org.testng.Assert;

public class AssertProvider {

    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

}
