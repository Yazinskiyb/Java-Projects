import ClassWebPages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;

public class MainPageTests extends SuitTest {

    MainPage mainPage;

    @BeforeClass
    public void beforeClass() {
        mainPage = new MainPage();
    }
    // Проверка что боковое меню открывается
    @Test
    public void checkIfTheSideMenuOpensCorrectly() {
        mainPage.openMainPage()
                .clickSideBarMenu()
                .checkSideBarOpened();
    }
    // Проверка что боковое меню закрывается
    @Test
    public void checkIfTheSideMenuClosed() {
        mainPage.openMainPage()
                .clickSideBarMenu()
                .clickCloseSideBar()
                .checkSideBarClosed();
    }
    // Проверка что сайт переводится на Украинский
    @Test
    public void checkTranslationIntoUkranian() {
        mainPage.openRuMainPage()
                .clickSideBarMenu()
                .clickLangToUa()
                .checkLangUa();
    }
    // Проверка что сайт переводится на Русский
    @Test
    public void checkTranslationIntoRussian() {
        mainPage.openMainPage()
                .clickSideBarMenu()
                .clickLangToRu()
                .checkLangRu();
    }
    // Проверка что кнопка "Скоро в прокате" работает
    @Test
    public void checkIfComingSoonButtonWorks() {
        mainPage.openMainPage()
                .clickSideBarMenu()
                .clickSoonPageButton()
                .checkSoonPage();
    }
}
