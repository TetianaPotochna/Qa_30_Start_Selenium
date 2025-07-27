import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test
    public void ccsSelectors() {
        //by tagName
        WebElement html = wd.findElement(By.tagName("html"));
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement div = wd.findElement(By.tagName("div"));
        List<WebElement> listDiv = wd.findElements(By.tagName("div"));
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement a = wd.findElement(By.tagName("a"));
        List<WebElement> list_a = wd.findElements(By.tagName("a"));
        // WebElement elClass = wd.findElement(By.tagName("class")); - test failed. Why?
        List<WebElement> list_class = wd.findElements(By.tagName("class"));
        List<WebElement> form = wd.findElements(By.tagName("form"));
    }

    @AfterClass
    public void postCondition() {
        wd.quit();
    }
}
