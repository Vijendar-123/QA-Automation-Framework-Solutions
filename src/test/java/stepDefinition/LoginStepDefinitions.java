package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pom.HomePage;
import pom.LoginPage;


public class LoginStepDefinitions extends DriverManager{
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    @Given("I open Login page")
    public void openLoginPage() {
        driver.get("https://bbb.testpro.io");
    }
    @When("I enter email {string}")
    public void i_enter_email(String email) {
      loginPage.provideEmail(email);
    }
    @And("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.providePassword(password);
    }
    @And("I submit")
    public void clickSubmit() {
        loginPage.clickSubmit();
    }

    @Then("I am logged in")
    public void userIsLoggedIn() {
       Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }
}
