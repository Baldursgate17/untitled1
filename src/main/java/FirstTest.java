import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FirstTest {
    @Test
    public void testSearchGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.crazygames.com/");
        WebElement searchBox = driver.findElements(By.className("prime-carousel")).get(0);
        WebElement searchBox1 = driver.findElement(By.cssSelector("#layoutMainWrapper > div > div:nth-child(2) > div.prime-carousel.css-1nehx92 > ul > li:nth-child(1) > a > img"));
//        searchBox.click();
        searchBox1.click();
        sleep(3000);
        driver.get("https://www.crazygames.com/");
        //searchBox.sendKeys("cr");
       //searchBox.submit();

    }
}
