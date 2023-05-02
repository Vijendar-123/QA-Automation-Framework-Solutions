import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework15 extends BaseTest {

    static ChromeOptions options = new ChromeOptions();
    @Test
    public static void LoginEmptyEmailPasswordTest () throws InterruptedException {
        // Simple comment

//      Added ChromeOptions argument below to fix websocket error
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://testpro.io/";
        Thread.sleep(2000);
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Thread.sleep(2000);
        driver.quit();

    }
}