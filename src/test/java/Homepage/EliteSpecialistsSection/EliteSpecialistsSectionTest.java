package Homepage.EliteSpecialistsSection;

import Homepage.Functions.UtilizesFunctions;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class EliteSpecialistsSectionTest {

    UtilizesFunctions utilizesFunctions = new UtilizesFunctions();
    @Test
    public void verifyMainTitle(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfMainTitle);
    }
    @Test
    public void verifyPerson1Title(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1Title);
    }
    @Test
    public void verifyPerson1SubTitle(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1SubTitle);
    }
    @Test
    public void verifyPerson1Rating(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1Rating);
    }
    @Test
    public void verifyPerson1DetailsText(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1DetailsText);
    }
    @Test
    public void verifyPerson1PersonalProfileButoon(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1PersonalProfileButton);
    }

    @Test
    public void verifyPerson1BookSessionButton(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfSpecialistPerson1BookSessionButton);
    }

    @Test
    public void verifyPerson1ConnectButton(){
        utilizesFunctions.isElementDispalyed(EliteSpecialistsSection.xpathOfConnectNowButton);
    }


    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 550)");

        // Wait for the page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Scroll the page up 50 pixels
        jse.executeScript("window.scrollBy(0, -20)");

    }





}
