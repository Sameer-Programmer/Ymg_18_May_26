package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test4_Waits {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        //<input data-v-1f99f73c="" class="oxd-input oxd-input--active" name="username"
        // placeholder="Username" autofocus="">
        WebElement userName =driver.findElement(By.xpath("//input[@name='username']"));
        wait.until(ExpectedConditions.elementToBeClickable(userName)); // this is Woring only when I have Implicit wait
        userName.sendKeys("Sameer");
        WebElement linkOrangeHRM = driver.findElement(By.linkText("OrangeHRM, Inc"));
        wait.until(ExpectedConditions.visibilityOf(linkOrangeHRM));
        Thread.sleep(10000);
        // if it is not visible under 10 seconds What will Happen
        linkOrangeHRM.click();
        driver.close();
        driver.quit();




    }
}
