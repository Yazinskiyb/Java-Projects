import ClassWebPages.LogInPage;
import ClassWebPages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTests extends SuitTest {
    MainPage mainPage;
    
    @BeforeClass
    public void beforeClass() {mainPage = new MainPage();}
    // Проверка что можно перейти на сайта авторизации, с главной страницы
    @Test
    public void checkLogInButton() {
        mainPage.openMainPage()
                .clickLogInButton()
                .checkLogInButton();
    }
    // Проверка что можно вернутся на главную с страницы авторизации
    @Test
    public void backToMainPage() {
        mainPage.openMainPage()
                .clickLogInButton()
                .clickMultiPlexButton()
                .checkMainPage();
    }
    // Проверка что есть валидация при вводе корректного номера в поле "Номер телефона"
    @Test
    public void checkingPhoneNumberForCorrectInput() {
        mainPage.openMainPage()
                .clickLogInButton()
                .clickInputForm()
                .sendCorrectInputForm()
                .clickContinueButton()
                .checkInputForm();
    }
}
