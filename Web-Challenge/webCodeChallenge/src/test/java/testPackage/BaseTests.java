package testPackage;

import developmentPackage.SearchBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    private WebDriver driver;
    protected SearchBox searchBox;

    @BeforeClass
    public void setUp(){
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
        searchBox = new SearchBox(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
