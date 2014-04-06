package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdoptionPage extends AbstractPage {

    public AdoptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public AdoptionResultPage selectAnimalByName(String name) {
        List<WebElement> records = driver.findElements(By.className("record"));
        for (WebElement record : records) {
            if (record.getText().contains(name)) {
                record.findElement(By.tagName("input")).click();
                break;
            }
        }
        return new AdoptionResultPage(driver);
    }
}
