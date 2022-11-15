package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;


public class CheckRegisterPage extends BasePage {

    @FindBy(xpath = "//div[@id=\"rightPanel\"]/p")
    WebElement successRegister;


    public void assertThatResultContains(String expectedValue) {

        assertTrue(successRegister.getText().equals(expectedValue));

    }
}
