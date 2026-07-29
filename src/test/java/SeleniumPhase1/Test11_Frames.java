package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


/*
//        driver.switchTo().frame(name);
//        driver.switchTo().frame(id);
//        driver.switchTo().frame(WebElement);
//        driver.switchTo().frame(index)
 */

public class Test11_Frames {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.automationtesting.in/Frames.html";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement frame1WebElement = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
        driver.switchTo().frame(frame1WebElement);
        WebElement Field1 = driver.findElement(By.cssSelector("input[type='text']"));
        Field1.sendKeys("Sameer Bhai");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();


        WebElement outerframe = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
        driver.switchTo().frame(outerframe);
        WebElement frame2 = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html'] "));
        driver.switchTo().frame(frame2);
        WebElement field2Element = driver.findElement(By.cssSelector("input[type='text']"));
        field2Element.sendKeys("Bhai");

        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();



        Thread.sleep(5000);
        driver.quit();


    }
}
