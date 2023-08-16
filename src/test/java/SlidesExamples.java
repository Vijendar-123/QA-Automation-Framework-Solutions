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
    public void loginInvalidEmailValidPassword(){

        navigateToPage();
        provideEmail("invalid@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginValidEmailEmptyPassword() {

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("");
        clickSubmit();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}


