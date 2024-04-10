import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidesExamples extends BaseTest{

    @Test
    public void loginValidEmailPassword(){

        navigateToPage();
        provideEmail("demo@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        isAvatarDisplayed();
    }
    @Test
    public void loginInvalidEmailValidPassword() throws InterruptedException {

        navigateToPage();
        provideEmail("invalid@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginValidEmailEmptyPassword() throws InterruptedException {

        navigateToPage();
        provideEmail("demo@testpro.io");
        providePassword("");
        clickSubmit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}


