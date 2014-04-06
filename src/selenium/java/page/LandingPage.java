package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage {

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public AdoptionPage navigateToAdoption() {
        driver.findElement(By.id("adoption")).click();
        return new AdoptionPage(driver);
    }
}
