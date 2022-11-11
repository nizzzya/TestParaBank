package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseTest {
    private static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp(){
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        PageFactory.initElements(driver, this);
    }

    @AfterClass
    public void ternDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
