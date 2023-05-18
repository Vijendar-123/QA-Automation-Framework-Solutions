package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagefactory.HomePage;

public class PlaylistStepDefinitions extends DriverManager {


    String newPlaylistName = "Shikul";
    HomePage homePage = new HomePage(driver);


    @When("I double click the first user playlist")
    public void i_double_click_the_first_user_playlist() {
        homePage.doubleClickPlaylist();


    }
    @When("I enter the new playlist name")
    public void i_enter_the_new_playlist_name() {
        homePage.enterNewPlaylistName(newPlaylistName);
    }
    @Then("the playlist name is edited")
    public void the_playlist_name_is_edited() {
        Assert.assertEquals(homePage.getPlaylistName(), newPlaylistName);
    }









}