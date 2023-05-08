import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AllSongsPage;
import pom.HomePage;
import pom.LoginPage;

import java.util.List;

public class ActionsTests extends BaseTest {

    //  Tests using WebElements and Action class

//  Test #1 - POM Recap Example
    @Test
    public void playSong()  {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongs = new AllSongsPage(driver);

        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickSubmit();
        homePage.chooseAllSongsList();
        allSongs.contextClickFirstSong();
        allSongs.choosePlayOption();
        Assert.assertTrue(allSongs.isSongPlaying());

    }

    //  Test #2 - WebElements
    @Test
    public void countSongsInPlaylist() {
        //Prerequisite - user created playlist named "Playlist Demo" with at least 1 song

        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        choosePlaylistByName("Playlist Demo");
        displayAllSongs();
        Assert.assertTrue(getPlaylistDetails().contains(String.valueOf(countSongs())));
        //verifies if the playlist details song count is equal to the retrieved number of songs
    }

    public void choosePlaylistByName(String playlistName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'" + playlistName + "')]"))).click();
    }
    public int countSongs() {//counts songs inside playlist
        return driver.findElements(By.cssSelector("section#playlistWrapper td.title")).size();
    }
    public String getPlaylistDetails() { //retrieves playlist details from playlist header (displays number of songs in playlist)
        return driver.findElement(By.cssSelector("span.meta.text-secondary span.meta")).getText();
    }
    public void displayAllSongs() { //prints all songs inside the playlist - for demo purposes
        List<WebElement> songList = driver.findElements(By.cssSelector("section#playlistWrapper td.title"));
        System.out.println("Number of songs found: " + countSongs());
        for (WebElement e : songList) {
            System.out.println(e.getText());
        }
    }
}
