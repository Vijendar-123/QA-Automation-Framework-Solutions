package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;


public class BaseStepDefinitions extends  DriverManager {

    @Before
    public void openBrowser() {
		WebDriver driver = getDriver();
		driver.manage().window().maximize();

    }
    @After
    public void closeBrowser(){
        driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
    }



}
