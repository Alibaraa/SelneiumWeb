package Homepage.FromProblemToSolution;

import Homepage.Functions.UtilizesFunctions;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class FromProblemToSolutionTest {
    UtilizesFunctions utilize = new UtilizesFunctions();


    @Test
    public void verifyGooglePlayButoonDisplay(){
    utilize.isElementDispalyed(FromProblemToSolution.xpathOfGooglePlayIcon);
    }
    @Test
    public void verifyAppStoreButtonDisplay(){
     utilize.isElementDispalyed(FromProblemToSolution.xpathOfAppStoreIcon);

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
