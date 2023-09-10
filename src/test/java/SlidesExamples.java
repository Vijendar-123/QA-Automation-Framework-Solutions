import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidesExamples extends BaseTest{

//    @Test(dataProvider = "IncorrectLoginData", dataProviderClass = BaseTest.class)
//    public void loginEmptyEmailPassword(String username, String password) throws InterruptedException {
//
//        provideEmail(username);
//        providePassword(password);
//        clickSubmit();
//
//        Thread.sleep(2000);
//        Assert.assertEquals(driver.getCurrentUrl(), url);
//    }

    @Test(dataProvider = "IncorrectLoginData")
    public void loginEmptyEmailPassword(String username, String password) throws InterruptedException {

        provideEmail(username);
        providePassword(password);
        clickSubmit();

        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
