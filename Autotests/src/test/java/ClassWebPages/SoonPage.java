package ClassWebPages;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SoonPage {

    public void checkSoonPage() {
        webdriver().shouldHave(url("https://multiplex.ua/soon"));
    }
}
