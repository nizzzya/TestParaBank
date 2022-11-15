package steps;

import pages.RegisterPage;

public class RegistrationSteps {
    private RegisterPage registerPage = new RegisterPage();

    public CheckResultRegistration registerNewUser() {

        registerPage.enterFirstName("Marks");
        registerPage.enterLastName("Leboski");
        registerPage.enterAddress("Beach");
        registerPage.enterCity("LA");
        registerPage.enterState("USA");
        registerPage.enterZipCode("12345678");
        registerPage.enterPhone("12345678");
        registerPage.enterSNN("12345678");

        registerPage.enterUserName("Marks");
        registerPage.enterPassword("12345678");
        registerPage.enterConfirm("12345678");
        registerPage.sendFormRequest();

        return new CheckResultRegistration();
    }
}
