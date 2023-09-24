package Homepage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class BookSessionSection {
    public static WebElement getLoginButton(){
        return Setup.driver.findElement(By.xpath(""));
    }
}
