package ClassWebPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.savePageSource;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;
import static com.codeborne.selenide.WebDriverRunner.source;

public class LogInPage {

    SelenideElement multiPlexButton = $("#app > div > main > div > div.wd.login__wd > div.login__left > div > div.login__left__header > a > img");
    SelenideElement phoneInput = $("#tel");
    SelenideElement inputedPhone = $("#app > div > main > div > div.wd.login__wd > div.login__left > div > div.login__step2 > div.login__submitted__phone > p");
    SelenideElement continueButton = $("#app > div > main > div > div.wd.login__wd > div.login__left > div > div.login__step1 > div > div > div");

    public LogInPage clickMultiPlexButton() {
        multiPlexButton.shouldBe(Condition.visible).click();
        return this;
    }

    public LogInPage checkMainPage() {
        webdriver().shouldHave(urlStartingWith("https://multiplex.ua"));
        return this;
    }

    public LogInPage checkLogInButton() {
        webdriver().shouldHave(url("https://friends.multiplex.ua/login"));
        return this;
    }

    public LogInPage clickInputForm() {
        phoneInput.shouldBe(Condition.visible).click();
        return this;
    }

    public LogInPage sendCorrectInputForm() {
        phoneInput.sendKeys("932928910");
        return this;
    }

    public LogInPage clickContinueButton() {
        continueButton.shouldBe(Condition.visible).click();
        return this;
    }

    public LogInPage checkInputForm() {
        inputedPhone.shouldHave(Condition.text("+380 (93) 292 8910"));
        return this;
    }
}
