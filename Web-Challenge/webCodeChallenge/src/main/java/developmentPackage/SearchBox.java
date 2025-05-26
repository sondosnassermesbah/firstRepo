package developmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchBox {
    private WebDriver driver;
    private By searchBox = By.id("twotabsearchtextbox");
    private By productImage = By.xpath("//img[@class='s-image']");


    public SearchBox (WebDriver driver){
        this.driver = driver;

    }
    public  void SearchBox(String product){
        driver.findElement(searchBox).sendKeys(product, Keys.ENTER);

    }
    public boolean WaitForElement() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            WebElement element = wait.until(
                    ExpectedConditions.visibilityOf(driver.findElement(productImage)));
            System.out.println("true");
            return true;

        }
        catch (Exception e){
           System.out.println("false");
            return false;
        }
    }

}
