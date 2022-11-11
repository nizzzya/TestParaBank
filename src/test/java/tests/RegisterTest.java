package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterPage;

import java.io.FileNotFoundException;

public class RegisterTest extends BaseTest {

    @Test
    public void registration() throws FileNotFoundException {
        RegisterPage registerPage = new RegisterPage();

        registerPage.enterFirstName("Mark");
        registerPage.enterLastName("Leboski");
        registerPage.enterAddress("Beach");
        registerPage.enterCity("LA");
        registerPage.enterState("USA");
        registerPage.enterZipCode("12345678");
        registerPage.enterPhone("12345678");
        registerPage.enterSNN("12345678");

        registerPage.enterUserName("Mark");
        registerPage.enterPassword("12345678");
        registerPage.enterConfirm("12345678");

        registerPage.sendFormRequest();
    }

}
