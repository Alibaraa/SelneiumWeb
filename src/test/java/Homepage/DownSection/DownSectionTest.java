package Homepage.DownSection;

import Homepage.Functions.UtilizesFunctions;
import Homepage.JoinACommunity.JoinACommunity;
import Homepage.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class DownSectionTest {

    UtilizesFunctions utilize = new UtilizesFunctions();

    @Test
    public void verifyEmaiInputDisplay(){
        utilize.isElementDispalyed(DownSection.xpathOfEmailInput);
    }
    @Test
    public void verifySubscribeButtonDisplay(){
        utilize.isElementDispalyed(DownSection.xpathOfSubscribeButton);
    }


    @Test(priority = 4)
   public void clickTopControl(){
        Setup.driver.findElement(By.xpath(DownSection.xpathOfTopButton)).click();
    }
}
