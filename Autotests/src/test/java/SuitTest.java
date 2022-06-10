import ClassWebPages.MainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import static com.codeborne.selenide.Configuration.baseUrl;
public class SuitTest {
    @BeforeSuite
    public void beforeSuite() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        baseUrl = "https://multiplex.ua";
    }
}
