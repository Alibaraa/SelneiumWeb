package Homepage.Functions;

import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class UtilizesFunctions {
    Wait<WebDriver> wait;

    public void isElementDispalyed(String xpathOfElement){

        Setup.driver.findElement(By.xpath(xpathOfElement)).isDisplayed();
    }

    public void isElementValueEqual(String xpathOfElement, String expectedValue) {
     //WebElement   elm = Setup.driver.findElement(By.xpath(xpathOfElement));
      //  Setup.jse.executeScript("arguments[0].scrollIntoView(true);", elm);


//        WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(10)); // Increase the wait time if needed.
//
//       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathOfElement)));
        String actualValue = Setup.driver.findElement(By.xpath(xpathOfElement)).getText();


        Assert.assertEquals(actualValue, expectedValue);
       // System.out.println("Expected value is: " + actualValue);
    }


    public void isImageValueEqual(String xpathOfElement, String expectedValue){

        String actualValue = Setup.driver.findElement(By.xpath(xpathOfElement)).getAttribute("src");
        Assert.assertEquals(actualValue, expectedValue);


    }


    public void clickTheElement(String xpathOfElement){
        Setup.driver.findElement(By.xpath(xpathOfElement)).click();
    }


    public void isSpecifcAttributeValueEqual(String xpathOfElement,String attribute, String expectedValue){
        String acutalValue = Setup.driver.findElement(By.xpath(xpathOfElement)).getAttribute(attribute);
        Assert.assertEquals(acutalValue,expectedValue);


    }

    public void clickBackButton(){
        Setup.driver.navigate().back();
    }

}
