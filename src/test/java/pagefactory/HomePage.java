package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    @FindBy(css = "img[class='avatar']")
    WebElement avatarIcon;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public boolean isAvatarDisplayed() {
        return findElement(avatarIcon).isDisplayed();
    }


}