package pagefactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "a.view-profile")
    WebElement profileIcon;
    @FindBy(css = "img[class='avatar']")
    WebElement avatarIcon;
    @FindBy(css = ".playlist:nth-child(3)")
    WebElement firstPlaylist;
    @FindBy(css = "[name='name']")
    WebElement playlistNameField;
    @FindBy(css = "div.success.show")
    WebElement popUpNotification;
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    public HomePage clickProfileIcon(){
        click(profileIcon);
        return this;
    }
    public boolean isAvatarDisplayed() {
        return findElement(avatarIcon).isDisplayed();
    }


}


