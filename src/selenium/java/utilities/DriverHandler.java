package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler {

    private WebDriver driver = new FirefoxDriver();

    public WebDriver getDriver() {
        return this.driver;
    }
}
