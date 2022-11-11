package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    By userNamePath = By.xpath("//input[@id=\"customer.username\"]");

    @FindBy(xpath = "//*[@class=\"form2\"]//tr[1]//input")
    private WebElement inputFirstName;
    @FindBy(xpath = "//*[@class=\"form2\"]//tr[2]//input")
    private WebElement inputLastName;
    @FindBy(xpath = "//td[./b[contains(text(),\"Address:\")]]/following-sibling::td/input")
    private WebElement inputAddress;
    @FindBy(xpath = "//input[@id=\"customer.address.city\"]")
    private WebElement inputCity;
    @FindBy(xpath = "//input[@name=\"customer.address.state\"]")
    private WebElement inputState;
    @FindBy(id = "customer.address.zipCode")
    private WebElement inputZipCode;
    @FindBy(name = "customer.phoneNumber")
    private WebElement inputPhone;
    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    private WebElement inputSSN;

    WebElement inputUsername = driver.findElement(userNamePath),
            inputPassword = driver.findElement(By.id("customer.password")),
            inputConfirm = driver.findElement(By.name("repeatedPassword"));

    @FindBy(xpath = "//*[@class=\"form2\"]//tr[last()]//input")
    private WebElement button;

    public void enterFirstName(String val) {
        inputFirstName.sendKeys(val);
    }

    public void enterLastName(String val) {
        inputLastName.sendKeys(val);
    }

    public void enterAddress(String val) {
        inputAddress.sendKeys(val);
    }

    public void enterCity(String val) {
        inputCity.sendKeys(val);
    }

    public void enterState(String val) {
        inputState.sendKeys(val);
    }

    public void enterZipCode(String val) {
        inputZipCode.sendKeys(val);
    }

    public void enterPhone(String val) {
        inputPhone.sendKeys(val);
    }

    public void enterSNN(String val) {
        inputSSN.sendKeys(val);
    }

    public void enterUserName(String val) {
        inputUsername.sendKeys(val);
    }

    public void enterPassword(String val) {
        inputPassword.sendKeys(val);
    }

    public void enterConfirm(String val) {
        inputConfirm.sendKeys(val);

    }

    public void sendFormRequest() {
        button.click();
    }

}
