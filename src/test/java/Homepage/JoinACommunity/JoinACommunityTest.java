package Homepage.JoinACommunity;

import Homepage.Functions.UtilizesFunctions;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class JoinACommunityTest {

    UtilizesFunctions utilize = new UtilizesFunctions();

    @Test
    public void verifyEmaiInputDisplay(){
        utilize.isElementDispalyed(JoinACommunity.xpathOfEmailInput);
    }
    @Test
    public void verifySubscribeButtonDisplay(){
        utilize.isElementDispalyed(JoinACommunity.xpathOfSubscribeButton);
    }
    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 2000)");

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
