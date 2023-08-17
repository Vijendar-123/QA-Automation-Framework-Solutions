import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    void setupClass() {
        WebDriverManager.chromedriver().setup();

    }
}