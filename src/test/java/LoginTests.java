
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.HomePage;
import pagefactory.LoginPage;


public class LoginTests extends BaseTest {

    //Fluent interfaces example
    @Test
    public void loginValidEmailPassword () {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("demo@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmit();

        Assert.assertTrue(homePage.isAvatarDisplayed());
    }

    @Test
    public void loginInvalidEmailValidPassword(){

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("invalid@testpro.io")
                 .providePassword("te$t$tudent")
                 .clickSubmit();

        Assert.assertEquals(getDriver().getCurrentUrl(), url); //https://qa.koel.app/
    }

    @Test
    public void loginValidEmailEmptyPassword() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("demo@testpro.io")
                 .providePassword("")
                 .clickSubmit();

        Assert.assertEquals(getDriver().getCurrentUrl(), url); //https://qa.koel.app/
    }

    //    OR
    @Test
    public void loginEmptyEmailPassword() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("").providePassword("te$t$tudent").clickSubmit();

        Assert.assertEquals(getDriver().getCurrentUrl(), url);
    }
}