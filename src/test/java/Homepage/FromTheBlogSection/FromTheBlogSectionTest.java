package Homepage.FromTheBlogSection;

import Homepage.Functions.UtilizesFunctions;
import org.testng.annotations.Test;

import static Homepage.Setup.jse;

public class FromTheBlogSectionTest {

    UtilizesFunctions utilize = new UtilizesFunctions();

    @Test
    public void verifyDatoOfItem1Display(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1Date);
    }

    @Test
    public void verifyTypeOfItem1Display(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1Type);
    }

    @Test
    public void verifyMainTitleOfItem1Article(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1Title);

    }

    @Test
    public void verifyDetailsOfItem1Article(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1Details);
    }

    @Test
    public void verifyMainImageOfItem1Display(){
    utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1MainImage);
    }
    @Test
    public void verifyTitleOfItem1PersonDisplay(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1PersonTitle);
    }
    @Test
    public void verifySubTitleOfItem1PersonDisplay(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1PersonImage);

    }

    @Test
    public void verifyImageOfItem1PersonDisplay(){
        utilize.isElementDispalyed(FromTheBlogSection.xpathOfArticle1PersonImage);
    }


    @Test(priority = 5)
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 1500)");

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
