package Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Setup {
    public static WebDriver driver;
    WebElement contactButton;
    WebElement clientsButton;
    public static JavascriptExecutor jse;
    Wait<WebDriver> wait;
    @Test
    public void SetupFamcare() {

      //  wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        FirefoxOptions options = new FirefoxOptions();
       options.setPageLoadStrategy(PageLoadStrategy.EAGER);
    // options.setPageLoadStrategy(PageLoadStrategy.EAGER);
   //   options.addArguments("start-maximized");


driver = new FirefoxDriver(options);
      //  driver = WebDriverManager.firefoxdriver().create();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
    }
}
