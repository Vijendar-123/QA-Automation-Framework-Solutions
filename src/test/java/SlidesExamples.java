import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidesExamples extends BaseTest{

    @Test
    public void loginValidEmailPassword(){

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        isAvatarDisplayed();
    }
    @Test
    public void loginInvalidEmailValidPassword() throws InterruptedException {

        navigateToPage();
        provideEmail("invalid@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginValidEmailEmptyPassword() throws InterruptedException {

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("");
        clickSubmit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}


