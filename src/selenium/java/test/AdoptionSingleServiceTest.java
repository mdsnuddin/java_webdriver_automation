package test;

import org.junit.After;
import org.junit.Test;
import page.AdoptionPage;
import page.AdoptionResultPage;
import page.LandingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdoptionSingleServiceTest extends AbstractWebDriver {

    @Test
    public void shouldBeAbleToAdoptAnAnimal() {
        // Given
        LandingPage landingPage = navigateToHome();

        // When
        // I select an available animal to adopt
        AdoptionPage adoptionPage = landingPage.navigateToAdoption();
        AdoptionResultPage adoptionResultPage = adoptionPage.selectAnimalByName("George");

        // Then
        // I am able to adopt the animal
        assertThat("Failure on adoption result page", adoptionResultPage.isSuccess(), is(true));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
