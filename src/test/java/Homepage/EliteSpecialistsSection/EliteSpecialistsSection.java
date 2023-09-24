package Homepage.EliteSpecialistsSection;

public class EliteSpecialistsSection {

    //aba:MainTitle
    static String xpathOfMainTitle = "//*[@class=\"kc-elm kc-css-554197 kc-title-wrap kc-pc-loaded\"]/h2";
    static String expectedMainTitleText = "نخبة من الأخصائيين والمرشدين";


    //aba:SpecialistPerson

    public static String xpathOfSpecialistPerson1Image ="//*[@class=\"swiper-slide swiper-slide-duplicate swiper-slide-active\"]/div/div/a/img";
    static String expectedSpecialistPerson1Image = "https://famcare-production.s3.eu-central-1.amazonaws.com/5939/image_cropper_0E1533CA-2A53-46DA-B101-4B108AC14902-550-0000001549CBB2C6.jpg";
    static String xpathOfSpecialistPerson1Title = "//*[@class=\"swiper-slide swiper-slide-active\"]/div/h2/a";
    static String expectedSpecialistPerson1Title = " طلال عياش الحربي ";

    static String xpathOfSpecialistPerson1SubTitle = "//*[@class=\"swiper-slide swiper-slide-active\"]/div/p/a";
    //static String expectedSpecialistPerson1SubTitle = " طلال عياش الحربي ";

    static String xpathOfSpecialistPerson1Rating= "//*[@class=\"swiper-slide swiper-slide-active\"]/div/span";
   // static String xpathOfSpecialistPerson1RatingIcon = "//*[@class=\"swiper-slide swiper-slide-active\"]/div/span/svg";

    static String xpathOfSpecialistPerson1DetailsText= "//*[@class=\"swiper-slide swiper-slide-active\"]/div//*[@class=\"mb-3 bio\"]/a";

    static String xpathOfSpecialistPerson1PersonalProfileButton = "//*[@class=\"swiper-slide swiper-slide-active\"]/div//*[@class=\"d-flex justify-content-between buttons\"]/a[1]";

    static String xpathOfSpecialistPerson1BookSessionButton = "//*[@class=\"swiper-slide swiper-slide-active\"]/div//*[@class=\"d-flex justify-content-between buttons\"]/a[3]";

    static String xpathOfConnectNowButton = "//*[@class=\"kc-elm kc-css-674884\"]/a";



}
