package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
-Click Action with javaScript
-Send Keys with JavaScript
- Scroll

Note - Slider which we see is not developed by the developer
Scroll -
we can scroll up to few Pixcels
we can scroll up to certain element visibility
we can scroll up to end

 */

public class  Test15_1_JsExecuterConcept_1 {
    static void main(String[] args) throws InterruptedException {
        String url =  "https://in.trip.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement checkin = driver.findElement(By.xpath("//label[@for='checkInInput']"));
        checkin.click();
        WebElement nextButton = driver.findElement(By.cssSelector(".c-calendar-icon-next"));
        //nextButton.click();
        WebElement contactus =driver.findElement(By.xpath("//h3[text()='Contact us']"));


       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,1500)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        js.executeScript("arguments[0].scrollIntoView()",contactus);
        //Thread.sleep(10000);
       js.executeScript("arguments[0].scrollIntoView()",nextButton);
        js.executeScript("arguments[0].click()",nextButton);
        js.executeScript("arguments[0].click()",nextButton);
        js.executeScript("arguments[0].click()",nextButton);

      WebElement destination = driver.findElement(By.cssSelector("#destinationInput"));
      js.executeScript("arguments[0].setAttribute('value','Mumbai')",destination);

      // to scromm bottom of page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset"));










    }
}
