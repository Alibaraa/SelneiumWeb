package Homepage.BookSessionSection;
import Homepage.ApprovedByOfficialsSection.ApprovedByOfficialsSection;
import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Homepage.Setup.driver;
import static Homepage.Setup.jse;
import static java.lang.Thread.sleep;

public class BookSessionSectionTest {


    //********MainTitle
@Test
    public void verifyMainTitleExist (){
//    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//wait.until(d->BookSessionSection.getMainTitleTextPath().isDisplayed());
    BookSessionSection.getMainTitleTextPath().isDisplayed();
  }


    @Test(dependsOnMethods = {"verifyMainTitleExist"})
    public void verifyMainTitleValue (){
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        wait.until(d->BookSessionSection.getMainTitleTextPath().getText());
 //       BookSessionSection.getMainTitleTextPath().getText();
        Assert.assertEquals(BookSessionSection.getAcutaldStringofTitle(),BookSessionSection.getExpectedStringofTitle());
    }


//*********SubTitle
    @Test
    public void verifySubTitleExist (){
       Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d->BookSessionSection.getSubTitleTextPath().isDisplayed());
       // BookSessionSection.getSubTitleTextPath().isDisplayed();
    }

    @Test
    public void verifySubTitleValue (){
    Assert.assertEquals(BookSessionSection.getActualStringofSubTitle(),BookSessionSection.getExpectedSubTitleText());
    }

 //***********Button
    @Test
    public void verifyButtonExist(){
    BookSessionSection.getButtonPath().isDisplayed();
    }

    @Test
    public void verifyButtonValue(){
        Assert.assertEquals(BookSessionSection.getActualStringofButton(),BookSessionSection.getExpectedStringofButton());
    }


    //******Image
    @Test
    public void verifyImageExist(){
    BookSessionSection.getImagePath().isDisplayed();
    }
    @Test
    public void verifyImageValue(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d->BookSessionSection.getSubTitleTextPath().isDisplayed());
    Assert.assertEquals(BookSessionSection.getAcutalImageValue(),BookSessionSection.getExpectedImageValue());
    }

    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 570)");

        // Wait for the page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Scroll the page up 50 pixels
        jse.executeScript("window.scrollBy(0, -50)");

    }

/*
    @Test(priority = 4)
    public void scrollPage() throws InterruptedException {
       /* jse.executeScript("window.scrollBy(0,580)");



        try {
            sleep(
                    Duration.ofSeconds(2)
            );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
     //   jse.executeScript("window.scrollBy(0,590)");

*/

/*
        WebElement elem = driver.findElement(By.xpath(ApprovedByOfficialsSection.xpathOfItem1Title));
        jse.executeScript("arguments[0].scrollIntoView(true);", elem);
        try {
            sleep(
                    Duration.ofSeconds(5)
            );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
*/



}



