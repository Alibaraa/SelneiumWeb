package Homepage.HeaderMenuNavigation;

import Homepage.EliteSpecialistsSection.EliteSpecialistsSection;
import Homepage.Functions.UtilizesFunctions;
import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static Homepage.Setup.jse;

public class HeaderMenuNavigationTest {

    UtilizesFunctions utilize = new UtilizesFunctions();



    /////////Specialists//////////
    @Test(priority = 1)
    public void verifySpecialistsPage(){
        utilize.clickTheElement(HeaderMenuNavigation.xpathOfSpecialists);
    }

    @Test(dependsOnMethods = "verifySpecialistsPage")
    public void verifySpecialistsDataDisplay(){
        utilize.isElementDispalyed(HeaderMenuNavigation.xpathOfSpecialistsData);
    }

    @Test(dependsOnMethods = "verifySpecialistsDataDisplay")
    public void verifySpecialistsDataValue(){
        utilize.isElementValueEqual(HeaderMenuNavigation.xpathOfSpecialistsData,HeaderMenuNavigation.expectedSpecialPageData);
    }
    @Test(dependsOnMethods = "verifySpecialistsDataValue")
    public void verifySearchInput(){
        Setup.driver.findElement(By.xpath(HeaderMenuNavigation.xpathOfSearchInput)).sendKeys(HeaderMenuNavigation.searchedData, Keys.ENTER);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test(dependsOnMethods = "verifySearchInput")
    public void verifySearchInputResults(){


        String xpathExpression = "//*[@class='col-sm-6 col-md-4 col-lg-3 specialist-container']/div/h2/a";
        List<WebElement> elements = Setup.driver.findElements(By.xpath(xpathExpression));

        // Iterate through the list of elements and extract text from each
        for (WebElement element : elements) {
            String scrapedData = element.getText();
            if(!scrapedData.contains(HeaderMenuNavigation.searchedData)){
                Assert.fail("Title  does not contain the search term.");
            }

           // System.out.println("Scraped Data: " + scrapedData);
        }


        /*
        ArrayList<String> titleStrings = new ArrayList<>();

        for (WebElement title : HeaderMenuNavigation.titlesOfSearchResult) {
            titleStrings.add(title.getText());
        }*/

      /*  for (String titleString : titleStrings) {
            if (!titleString.contains("d,st")) {
                Assert.fail("Title " + titleString + " does not contain the search term.");
            }
        }*/
/*
        for (String title : titleStrings) {
            // Implement your verification logic here
            if (!title.contains(HeaderMenuNavigation.searchedData)) {
                Assert.fail("Title " + title + " does not contain the search term.");
            }
        }

*/

    }






    /////////Blog//////////

    @Test(priority = 2)
    public void verifyBlogPage(){
        utilize.clickTheElement(HeaderMenuNavigation.xpathOfBlog);

    }



    @Test(dependsOnMethods = "verifyBlogPage")
    public void verifyBlogDataDisplay(){
        utilize.isElementDispalyed(HeaderMenuNavigation.xpathOfBlogData);
    }

    @Test(dependsOnMethods = "verifyBlogDataDisplay")
    public void verifyBlogDataValue(){
        utilize.isSpecifcAttributeValueEqual(HeaderMenuNavigation.xpathOfBlogData,HeaderMenuNavigation.myAttribute,HeaderMenuNavigation.expectedBlogPageData);
    }





    /////////Academy//////////

    @Test(priority = 3)
    public void verifyAcademyPage(){
        utilize.clickTheElement(HeaderMenuNavigation.xpathOfAcademy);

    }



    @Test(dependsOnMethods = "verifyAcademyPage")
    public void verifyAcademyDataDisplay(){
        utilize.isElementDispalyed(HeaderMenuNavigation.xpathOfAcademyData);
    }

    @Test(dependsOnMethods = "verifyAcademyDataDisplay")
    public void verifyAcademyDataValue(){
        utilize.isSpecifcAttributeValueEqual(HeaderMenuNavigation.xpathOfAcademyData,HeaderMenuNavigation.AcademyDataAttribute,HeaderMenuNavigation.expectedAcademyData);
    }
    @Test(dependsOnMethods = "verifyAcademyDataValue")
    public void returnBack(){
        utilize.clickBackButton();
    }

    /////////Organizations//////////

    @Test(priority = 4)
    public void verifyOrganizationsPage(){
        utilize.clickTheElement(HeaderMenuNavigation.xpathOfOrganizations);

    }



    @Test(dependsOnMethods = "verifyOrganizationsPage")
    public void verifyOrganizationsDataDisplay(){
        utilize.isElementDispalyed(HeaderMenuNavigation.xpathOfOrganizationsData);
    }

    @Test(dependsOnMethods = "verifyOrganizationsDataDisplay")
    public void verifyOrganizationsDataValue(){
        utilize.isSpecifcAttributeValueEqual(HeaderMenuNavigation.xpathOfOrganizationsData,HeaderMenuNavigation.OrgainzationsDataAttribute,HeaderMenuNavigation.expectedOrganizationsData);
    }


    /////////Specialists//////////
    @Test(priority = 5)
    public void verifyWhoAreWePage(){

        utilize.clickTheElement(HeaderMenuNavigation.xpathOfWhoAreWe);
    }

    @Test(dependsOnMethods = "verifyWhoAreWePage")
     public void verifyWhoAreWeDataDisplay(){

        utilize.isElementDispalyed(HeaderMenuNavigation.xpathOfWhoAreWeData);

    }

    @Test(dependsOnMethods = "verifyWhoAreWeDataDisplay")
    public void verifyWhoAreWeDataValue(){
        utilize.isElementValueEqual(HeaderMenuNavigation.xpathOfWhoAreWeData,HeaderMenuNavigation.expctedWhoAreWeData);
    }


    /*
    /////////Famcare//////////
    @Test(priority = 6)
    public void verifyFamCarePage(){

        utilize.clickTheElement(HeaderMenuNavigation.xpathOfFamcare);


    }

    @Test(dependsOnMethods = "verifyFamCarePage")
    public void scrollPage(){
        jse.executeScript("window.scrollBy(0, 1100)");

        // Wait for the page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Scroll the page up 50 pixels
        jse.executeScript("window.scrollBy(0, -20)");

    }

    @Test
    public void verifyCorrectData(){
        Setup.driver.findElement(By.xpath(EliteSpecialistsSection.xpathOfSpecialistPerson1Image)).click();


    }

*/



}
