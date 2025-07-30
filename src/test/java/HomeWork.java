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
    public void SetUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test
    public void cssSelectors() {
        //by tagName
        WebElement html = wd.findElement(By.tagName("html"));
        WebElement html1 = wd.findElement(By.cssSelector("html"));
        WebElement html2 = wd.findElement(By.xpath("html"));

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body2 = wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1a = wd.findElement(By.cssSelector("h1"));
        WebElement h1b = wd.findElement(By.xpath("//h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));

        List<WebElement> listDiv = wd.findElements(By.tagName("div"));
        List<WebElement> listDiv1 = wd.findElements(By.cssSelector("div"));
        List<WebElement> listDiv2 = wd.findElements(By.xpath("//div"));

        List<WebElement> listA = wd.findElements(By.tagName("a"));
        List<WebElement> listA1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> listA2 = wd.findElements(By.xpath("//a"));

        //by class
        WebElement byClass = wd.findElement(By.className("container"));
        WebElement byClass1 = wd.findElement(By.cssSelector(".container"));
        WebElement byClass2 = wd.findElement(By.xpath("//*[@class = 'container']"));

        WebElement divByClass = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divByClass1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement divByClass2 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        WebElement a_ByClass = wd.findElement(By.className("active"));
        WebElement a_ByClass1 = wd.findElement(By.cssSelector(".active"));
        WebElement a_ByClass2 = wd.findElement(By.xpath("//*[@class = 'active']"));

        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement root2 = wd.findElement(By.xpath("//*[@id = 'root']"));

        //By attribute
        WebElement home = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement home1 = wd.findElement(By.xpath("//*[@href = '/home']"));

        WebElement page = wd.findElement(By.cssSelector("[aria-current = 'page']"));
        WebElement page1 = wd.findElement(By.xpath("//*[@aria-current = 'page']"));

        //WebElement registration = wd.findElement(By.name("registration"));
        //WebElement registration1 = wd.findElement(By.cssSelector("[name = 'registration']"));
    }

    @AfterClass
    public void SetDown() {
        wd.quit();
    }
}
