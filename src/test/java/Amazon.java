import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Amazon {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();   // Selenium Manager downloads the driver
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.amazon.in");
    }

    @Test
    public void verifySearchResults() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
                .sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("div[data-component-type='s-search-result']")));

        int resultCount = driver.findElements(
                By.cssSelector("div[data-component-type='s-search-result']")).size();

        Assert.assertTrue(resultCount > 0, "No search results found");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("laptop"),
                "Title does not contain search term");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}