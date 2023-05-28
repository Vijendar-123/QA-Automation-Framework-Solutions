package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver givenDriver) {
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
        // The constructor initializes the driver, wait, actions, and page elements using the given WebDriver.
    }

    public void doubleClick(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        actions.doubleClick(locator).perform();
        // This method performs a double click action on the provided WebElement.
    }

    public void contextClickSong(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        actions.contextClick(locator).perform();
        // This method performs a context click (right-click) action on the provided WebElement.
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        // This method waits for the element located by the provided By locator to be clickable and then performs a click action.
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        // This method waits for the element located by the provided By locator to be visible and returns the WebElement.
    }
}
