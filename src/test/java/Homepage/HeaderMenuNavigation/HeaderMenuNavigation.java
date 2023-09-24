package Homepage.HeaderMenuNavigation;

import Homepage.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderMenuNavigation {




    //aba:Specialists
    public static String xpathOfSpecialists = "//*[@id=\"menu-item-1026\"]/a";
    public static String xpathOfSpecialistsData = "//*[@class=\"container specialists-list\"]/div/div/h1";
    public static String expectedSpecialPageData = "أخصائيين فامكير";
    public static String xpathOfSearchInput="//*[@class=\"d-block mr-auto ml-auto mb-5 specialists-search\"]/label/input";
    public static String searchedData = "خالد";
    public static List<WebElement> titlesOfSearchResult = Setup.driver.findElements(By.xpath("//*[@class='col-sm-6 col-md-4 col-lg-3 specialist-container']/div/h2/a"));




    //aba:Blog
    public static String xpathOfBlog="//*[@id=\"menu-item-2633\"]/a";
    public static String xpathOfBlogData = "//*[@class=\"blog-posts__search-input\"]/input";
    public static String expectedBlogPageData = "ابحث داخل المدونة";
    public static String myAttribute = "placeholder";







    public static String xpathOfAcademy="//*[@id=\"menu-item-1227\"]/a";
    public static String xpathOfAcademyData="//*[@class=\"elementor-element elementor-element-83e3859 elementor-widget elementor-widget-rt-header-logo\"][1]/div/div/a/img";
    public static String expectedAcademyData = "https://academy.famcare.app/media/2022/05/Asset-3.png";

    public static String AcademyDataAttribute = "src";


    public static String xpathOfOrganizations="//*[@id=\"menu-item-187\"]/a";
    public static String xpathOfOrganizationsData = "//*[@class=\"kc-elm kc-css-410964 kc_shortcode kc_single_image\"]/img";
    public static String expectedOrganizationsData = "https://famcare.app/wp-content/uploads/2021/03/img22.svg";
    public static String OrgainzationsDataAttribute = "src";







    public static String xpathOfWhoAreWe="//*[@id=\"menu-item-188\"]/a";
    public static String xpathOfWhoAreWeData = "//*[@class=\"kc-elm kc-css-226303 kc-title-wrap \"]/h2";
    public static String expctedWhoAreWeData = "منصة فامكير";


    //aba:FamCare

    public static String xpathOfFamcare= "//*[@id=\"menu-item-6\"]/a";


}
