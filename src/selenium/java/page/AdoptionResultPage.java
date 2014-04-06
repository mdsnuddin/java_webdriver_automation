package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdoptionResultPage extends AbstractPage {

    public AdoptionResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSuccess() {
        return driver.findElement(By.id("result")).getText().contains("CONGRATULATIONS");
    }
}
