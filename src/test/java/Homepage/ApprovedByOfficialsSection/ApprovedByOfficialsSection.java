package Homepage.ApprovedByOfficialsSection;

import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApprovedByOfficialsSection {
//******************************************************Attributes***************************************************************************

    //aba:MainTitle
     static String xpathOfMainTitle = "//*[@class=\"kc-elm kc-css-480965 kc-title-wrap kc-pc-loaded\"]/h2";
     static String expectedMainTitleText = "تطبيق معتمد من الجهات الرسمية";

    //aba:Item1
    public static String xpathOfItem1Title="//*[@class=\"kc-elm kc-css-493653 kc-title-wrap kc-pc-loaded\"]/h3";
    static String expectedItem1Title = "لوائح حماية البيانات";
    static String xpathOfItem1Image = "//*[@class=\"kc-elm kc-css-373193 kc_shortcode kc_single_image\"]/img";
    static String expectedImage1Src = "https://famcare.app/wp-content/uploads/2023/06/aa.png";

    //aba:Item2
    static String xpathOfItem2Title="//*[@class=\"kc-elm kc-css-374927 kc-title-wrap kc-pc-loaded\"]/h3";
    static String expectedItem2Title="شركة مجتمعية";
    static String xpathOfItem2Image = "//*[@class=\"kc-elm kc-css-268709 kc_shortcode kc_single_image\"]/img";
    static String expectedImage2Src = "https://famcare.app/wp-content/uploads/2022/05/%D8%B4%D8%B1%D9%83%D8%A9-%D9%85%D8%AC%D8%AA%D9%85%D8%B9%D9%8A%D8%A9.png";

    //aba:Item3
    static String xpathOfItem3Title="//*[@class=\"kc-elm kc-css-167776 kc-title-wrap kc-pc-loaded\"]/h3";
    static String expectedItem3Title="مركز ارشاد اسري";
    static String xpathOfItem3Image = "//*[@class=\"kc-elm kc-css-833582 kc_shortcode kc_single_image\"]/img";
    static String expectedImage3Src = "https://famcare.app/wp-content/uploads/2022/05/back.png";

    //aba:Item4
    static String xpathOfItem4Title="//*[@class=\"kc-elm kc-css-485816 kc-title-wrap kc-pc-loaded\"]/h3";
    static String expectedItem4Title="مركز طب اتصالي";
    static String xpathOfItem4Image = "//*[@class=\"kc-elm kc-css-744171 kc_shortcode kc_single_image\"]/img";
    static String expectedImage4Src = "https://famcare.app/wp-content/uploads/2022/05/%D9%85%D8%B1%D9%83%D8%B2-%D8%B7%D8%A8-%D8%A7%D8%AA%D8%B5%D8%A7%D9%84%D9%8A.png";



  /*  public static WebElement getxpathOfItem1Title(){
       return Setup.driver.findElement(By.xpath(xpathOfItem1Title));
    }*/







}
