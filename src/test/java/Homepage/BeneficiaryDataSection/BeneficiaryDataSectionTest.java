package Homepage.BeneficiaryDataSection;

import Homepage.Functions.UtilizesFunctions;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class BeneficiaryDataSectionTest {


    UtilizesFunctions utilize = new UtilizesFunctions();


    ////////////Item1/////////////

    @Test
    public void verifyItem1ImageDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem1Image);
    }

    @Test
    public void verifyItem1TitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem1Title);
    }

    @Test
    public void verifyItem1SubTitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem1Title);
    }


    ////////////Item2/////////////

    @Test
    public void verifyItem2ImageDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem2Image);
    }

    @Test
    public void verifyItem2TitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem2Title);
    }

    @Test
    public void verifyItem2SubTitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem2Title);
    }


    ////////////Item3/////////////

    @Test
    public void verifyItem3ImageDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem3Image);
    }

    @Test
    public void verifyItem3TitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem3Title);
    }

    @Test
    public void verifyItem3SubTitleDisplay(){
        utilize.isElementDispalyed(BeneficiaryDataSection.xpathOfItem3Title);
    }
    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 900)");

        // Wait for the page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Scroll the page up 50 pixels
        jse.executeScript("window.scrollBy(0, -50)");

    }









}
