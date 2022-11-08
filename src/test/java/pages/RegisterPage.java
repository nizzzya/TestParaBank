package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

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

    WebElement inputUsername = driver.findElement(By.xpath("//input[@id=\"customer.username\"]")),
            inputPassword = driver.findElement(By.id("customer.password")),
            inputConfirm = driver.findElement(By.name("repeatedPassword"));

    @FindBy(xpath = "//*[@class=\"form2\"]//tr[last()]//input")
    private WebElement button;

}
