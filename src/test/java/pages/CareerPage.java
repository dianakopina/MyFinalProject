package pages;

import org.openqa.selenium.JavascriptExecutor;

import static utils.DriverProvider.getCurrentDriver;

public class CareerPage {

    public boolean isTextPresent(String text) {

        String script = "return document.body.innerText.includes(arguments[0]);";
        return (Boolean) ((JavascriptExecutor) getCurrentDriver()).executeScript(script, text);
    }
}
