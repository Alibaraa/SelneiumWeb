package Homepage.ApprovedByOfficialsSection;

import Homepage.BookSessionSection.BookSessionSection;
import Homepage.Functions.UtilizesFunctions;
import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Homepage.Setup;

import java.time.Duration;

import static Homepage.Setup.driver;
import static Homepage.Setup.jse;
import static java.lang.Thread.sleep;

public class ApprovedByOfficialsSectionTest{
   UtilizesFunctions utilize = new UtilizesFunctions();
   WebDriver myDriver = Setup.driver;
   JavascriptExecutor jsex;


    /////////////////MainTitle///////////////
    @Test
    public void verifyMainTitleDisplay(){

        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfMainTitle);
    }

    @Test

    public void verifyMainTitleValue(){
        utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfMainTitle,ApprovedByOfficialsSection.expectedMainTitleText);

    }




   /////////////////Item1///////////////
    @Test
    public void verifyItem1TitleDisplay(){
      /*  WebElement elem = myDriver.findElement(By.xpath(ApprovedByOfficialsSection.xpathOfItem1Title));
        jsex.executeScript("arguments[0].scrollIntoView(true);", elem);
        try {
            sleep(
                    Duration.ofSeconds(5)
            );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
      /* WebElement myPath=  myDriver.findElement(By.xpath(ApprovedByOfficialsSection.xpathOfItem1Title));
       myPath.isDisplayed();
       */ //ApprovedByOfficialsSection.getxpathOfItem1Title().isDisplayed();

        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem1Title);
    }

    @Test

     public void verifyItem1TitileValue(){
         utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem1Title,ApprovedByOfficialsSection.expectedItem1Title);

     }

     @Test
     public void verifyItem1ImageDisplay(){
        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem1Image);

     }

     @Test
    public void verifyItem1ImageValue(){
        utilize.isImageValueEqual(ApprovedByOfficialsSection.xpathOfItem1Image,ApprovedByOfficialsSection.expectedImage1Src);
     }




    /////////////////Item2///////////////

    @Test
    public void verifyItem2TitleDisplay(){

        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem2Title);
    }

    @Test

    public void verifyItem2TitileValue(){
        utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem2Title,ApprovedByOfficialsSection.expectedItem2Title);

    }

    @Test
    public void verifyItem2ImageDisplay(){
        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem2Image);

    }

    @Test
    public void verifyItem2ImageValue(){
        utilize.isImageValueEqual(ApprovedByOfficialsSection.xpathOfItem2Image,ApprovedByOfficialsSection.expectedImage2Src);
    }



    /////////////////Item3///////////////

    @Test
    public void verifyItem3TitleDisplay(){

        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem3Title);
    }

    @Test

    public void verifyItem3TitileValue(){
        utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem3Title,ApprovedByOfficialsSection.expectedItem3Title);

    }

    @Test
    public void verifyItem3ImageDisplay(){
        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem3Image);

    }

    @Test
    public void verifyItem3ImageValue(){
        utilize.isImageValueEqual(ApprovedByOfficialsSection.xpathOfItem3Image,ApprovedByOfficialsSection.expectedImage3Src);
    }


    /////////////////Item4///////////////

    @Test
    public void verifyItem4TitleDisplay(){

        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem4Title);
    }

    @Test

    public void verifyItem4TitileValue(){
        utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem4Title,ApprovedByOfficialsSection.expectedItem4Title);

    }

    @Test
    public void verifyItem4ImageDisplay(){
        utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem4Image);

    }

    @Test
    public void verifyItem4ImageValue(){
        utilize.isImageValueEqual(ApprovedByOfficialsSection.xpathOfItem4Image,ApprovedByOfficialsSection.expectedImage4Src);
    }













    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 450)");

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
























///////////Old way
/*

 // Setup.jse.executeScript("scroll(0, 250);");

    JavascriptExecutor jses = (JavascriptExecutor) Setup.driver;


    UtilizesFunctions utilize = new UtilizesFunctions();
    UtilizesFunctions utilize2 = new UtilizesFunctions();



    //*********Main Title
     @Test
     public void mainTitleDisplay(){
        /* Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(d-> jses.executeScript("window.scrollBy(0,700)"));
        */
//   utilize.isElementDispalyed(ApprovedByOfficialsSection.xpathOfMainTitle);

    /* }/*
     @Test
    public void mainTitleEqual(){
         utilize.isElementValueEqual(ApprovedByOfficialsSection.xpathOfMainTitle,ApprovedByOfficialsSection.expectedMainTitleText);
    }

    //*********Item1
    @Test
    public void Item1TitleDisplay(){
  //       Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//       wait.until(d-> jses.executeScript("window.scrollBy(0,700)"));

        utilize2.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem1Title);

    }
    public void Item1ImageDisplay(){

        utilize2.isElementDispalyed(ApprovedByOfficialsSection.xpathOfItem1Image);

    }

    @Test
    public void Item1TitleEqual(){
        utilize2.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem1Title,ApprovedByOfficialsSection.expectedItem1Title);
    }
    @Test
    public void Item1ImageEqual(){
        try {
            sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        utilize2.isElementValueEqual(ApprovedByOfficialsSection.xpathOfItem1Image,ApprovedByOfficialsSection.expectedImage1Src)

       ;
    }
*/

