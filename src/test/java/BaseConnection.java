import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseConnection {
    protected WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    public void initialize() {
        WebElement button = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
        button.click();
    }
}
