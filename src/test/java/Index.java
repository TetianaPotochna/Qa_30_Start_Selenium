import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/21.index.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }


    @Test
    public void cssLocators() {
        //by tag name
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement el1 = wd.findElement(By.xpath("//button"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input2 = wd.findElement(By.cssSelector("input"));
        WebElement input3 = wd.findElement(By.xpath("//input"));

        List<WebElement> list = wd.findElements(By.tagName("input"));

        //by class
        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));
        WebElement div2 = wd.findElement((By.xpath("//*[@class = 'container']")));

        List<WebElement> List = wd.findElements(By.className("nav-item"));
        List<WebElement> List1 = wd.findElements(By.cssSelector(".nav-item"));
        List<WebElement> list2 = wd.findElements(By.xpath("//*[@class = 'nav-item']"));

        //by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));
        WebElement nav2 = wd.findElement(By.xpath("//*[@id = 'nav']"));

        //By attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement inputEmail4 = wd.findElement(By.xpath("//*[@placeholder='Type your name']"));

        //start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));

        //end
        WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder$='name']"));
        //contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder*='your']"));


        //by name
        WebElement inputS = wd.findElement(By.name("surename"));
        WebElement inputS1 = wd.findElement(By.cssSelector("[name='surename']"));

        //By.linkText / By.partialLinkText
        WebElement a = wd.findElement(By.linkText("Item 3"));
        WebElement a2 = wd.findElement(By.partialLinkText("m 2"));

    }
}
