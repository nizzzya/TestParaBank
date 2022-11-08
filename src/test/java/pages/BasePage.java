package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tests.BaseTest;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = BaseTest.getDriver();
    }

    @BeforeClass
    public void setUp(){
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @AfterClass
    public void ternDown(){
        driver.quit();
    }
}
