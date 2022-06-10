package ClassWebPages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.devtools.v85.log.Log;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainPage {
    String pageUrl = "/";
    String pageUrlRu = "/ru/";

    SelenideElement sideBarButton = $("body > div.header.header-index > div > img");
    SelenideElement sideBarCheck = $("body > div.left_menu.js-left-menu.on > div");
    SelenideElement sideBarButtonClosed = $("body > div.left_menu.js-left-menu.on > div > div.menu_close");
    SelenideElement uaLangButton = $("body > div.left_menu.js-left-menu.on > div > ul > li:nth-child(2) > a");
    SelenideElement ruLangButton = $("body > div.left_menu.js-left-menu.on > div > ul > li:nth-child(1) > a");
    SelenideElement logInButtonMain = $("body > div.header.header-index > div > a.lk_link");
    SelenideElement comingSoonButton = $("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu_list > a:nth-child(2)");
    public MainPage openMainPage() {
        Selenide.open(baseUrl + pageUrl);
        return this;
    }

    public MainPage openRuMainPage() {
        Selenide.open(baseUrl + pageUrlRu);
        return this;
    }

    public MainPage clickSideBarMenu(){
        sideBarButton.shouldBe(visible).click();
        return this;
    }

    public MainPage checkSideBarOpened() {
        sideBarCheck.shouldBe(visible);
        return this;
    }

    public MainPage clickCloseSideBar() {
        sideBarButtonClosed.shouldBe(visible).click();
        return this;
    }
    public MainPage checkSideBarClosed() {
        sideBarCheck.shouldBe(hidden);
        return this;
    }

    public MainPage clickLangToUa() {
        uaLangButton.shouldBe(visible).click();
        return this;
    }

    public MainPage clickLangToRu() {
        ruLangButton.shouldBe(visible).click();
        return this;
    }

    public MainPage checkLangUa() {
        logInButtonMain.shouldHave(text("Увійти"));
        return this;
    }
    public MainPage checkLangRu() {
        logInButtonMain.shouldHave(text("Войти"));
        return this;
    }
    public SoonPage clickSoonPageButton() {
        comingSoonButton.shouldBe(visible).click();
        return new SoonPage();
    }

    public LogInPage clickLogInButton() {
        logInButtonMain.shouldBe(visible).click();
        return new LogInPage();
    }
}
