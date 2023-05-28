package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "button[type='submit']")
    private WebElement submitButtonLocator;
    // This annotation is used to locate the submit button on the login page using CSS selector.

    @FindBy(css = "[type='email']")
    private WebElement emailField;
    // This annotation is used to locate the email input field on the login page using CSS selector.

    @FindBy(css = "[type='password']")
    private WebElement passwordField;
    // This annotation is used to locate the password input field on the login page using CSS selector.

    @FindBy(css = "a#hel")
    private WebElement registrationLink;
    // This annotation is used to locate the registration link on the login page using CSS selector.

    @FindBy(css = ".fa-sign-out")
    private WebElement logOutLocator;
    // This annotation is used to locate the logout element on the login page using CSS selector.

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
        // The constructor calls the constructor of the base class (BasePage) using the given WebDriver.
    }

    public LoginPage clickSubmitBtn() {
        submitButtonLocator.click();
        return this;
        // This method clicks the submit button on the login page and returns the LoginPage object itself.
    }

    public LoginPage provideEmail(String email) {
        emailField.sendKeys(email);
        return this;
        // This method enters the provided email into the email input field on the login page and returns the LoginPage object itself.
    }

    public LoginPage providePassword(String password) {
        passwordField.sendKeys(password);
        return this;
        // This method enters the provided password into the password input field on the login page and returns the LoginPage object itself.
    }

    public WebElement getRegistrationLink() {
        return registrationLink;
        // This method returns the registrationLink WebElement, representing the registration link on the login page.
    }
}
