package Homepage.BookSessionSection;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import Homepage.Setup;


public class BookSessionSection {

//******************************************************Attributes***************************************************************************

    //aba:MainTitle
    static private String  xpathOfMainTitle= "//*[@class=\"kc-elm kc-css-964511 kc-title-wrap kc-pc-loaded\"]/h2";
    static private String  expectedMainTitleText= "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%";

    //**********



    //aba:SubTittle

    static private String  xpathOfSubTitle= "//*[@class=\"kc-elm kc-css-912794 kc_text_block kc-pc-loaded\"]/p";
    static private String  expectedSubTitleText= "لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ";

    //************

    //aba:BookSessionButton
    static private String  xpathOfButton= "//*[@class=\"kc-elm kc-css-780143\"]/a";
    static private String  expectedButtonText= "احجز جلستك الأولى";

    //**************



    //aba:Image
    static private String  xpathOfImage= "//*[@class=\"kc-elm kc-css-107922 kc_shortcode kc_single_image d-md-block\"]/img";
    static private String expectedImageValue= "https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png";

    static WebElement  imageData;


//******************************************************Methods***************************************************************************

    //***********aba:MainTitle
    public static WebElement getMainTitleTextPath(){

        return Setup.driver.findElement(By.xpath(xpathOfMainTitle));
    }

    public static String getExpectedStringofTitle(){
        return expectedMainTitleText;
    }
    public static String getAcutaldStringofTitle(){
        return Setup.driver.findElement(By.xpath(xpathOfMainTitle)).getText();
    }


    //******************

    //aba:SubTitle
    public static WebElement getSubTitleTextPath(){

        return Setup.driver.findElement(By.xpath(xpathOfSubTitle));
    }
    public static String getActualStringofSubTitle(){
        return Setup.driver.findElement(By.xpath(xpathOfSubTitle)).getText();
    }

    public static String getExpectedSubTitleText(){
        return expectedSubTitleText;
    }

    //****************

    //aba:BookSessionButton
    public static WebElement getButtonPath(){

        return Setup.driver.findElement(By.xpath(xpathOfButton));
    }
    public static String getActualStringofButton(){
        return Setup.driver.findElement(By.xpath(xpathOfButton)).getText();
    }
    public static String getExpectedStringofButton(){
        return expectedButtonText;
    }
    //***************

    //aba:Image

    public static WebElement getImagePath(){

        return imageData = Setup.driver.findElement(By.xpath(xpathOfImage));

    }


    public static String getAcutalImageValue(){

        return Setup.driver.findElement(By.xpath(xpathOfImage)).getAttribute("src");
    }

    public static String getExpectedImageValue(){
        return expectedImageValue;
    }

    //***************

}
