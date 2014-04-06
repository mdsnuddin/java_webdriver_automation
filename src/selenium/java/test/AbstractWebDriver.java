package test;

import org.openqa.selenium.WebDriver;
import page.LandingPage;
import utilities.DriverHandler;

public abstract class AbstractWebDriver extends DriverHandler {

    WebDriver driver = this.getDriver();

    public LandingPage navigateToHome() {
        driver.navigate().to("http://freelancer.geekngamer.com/webapp/");
        return new LandingPage(driver);
    }
}
