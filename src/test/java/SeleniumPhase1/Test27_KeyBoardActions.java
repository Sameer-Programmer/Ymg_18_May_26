package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test27_KeyBoardActions {
    static void main(String[] args){
        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.name("input1")).sendKeys("Sameer");
        Actions actions = new Actions(driver);
        //control.A
        actions.keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .perform();
        //control.C
        actions.keyDown(Keys.CONTROL)
                .sendKeys("C")
                .keyUp(Keys.CONTROL)
                .perform();

        // Tab
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();


        // Control v
        actions.keyDown(Keys.CONTROL)
                .sendKeys("V")
                .keyUp(Keys.CONTROL)
                .perform();

        Actions actions1 = new Actions(driver);
        actions1.keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .perform();


    }
}
