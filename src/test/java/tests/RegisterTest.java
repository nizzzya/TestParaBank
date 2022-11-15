package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterPage;

import java.io.FileNotFoundException;

public class RegisterTest extends BaseTest {

    @Test
    public void registration() {
        steps.registerNewUser().verifyThatRegisterSuccess("Your account was created successfully. You are now logged in.");
    }

}
