package steps;

import pages.CheckRegisterPage;

public class CheckResultRegistration {

    private CheckRegisterPage checkRegister = new CheckRegisterPage();

    public CheckResultRegistration verifyThatRegisterSuccess(String expectedValue) {
        checkRegister.assertThatResultContains(expectedValue);
        return this;
    }
}
