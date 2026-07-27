package SeleniumPhase1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
TakeScrenshot is an Interface
so we have to do Upcasting when we refer webdriver reference to TakeScreenshot
 */


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Test28_TakeScreenshorts {
    static void main(String[] args) throws IOException {
        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        String projectPath = System.getProperty("user.dir");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotfile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(projectPath+"\\Screenshots\\full1Page.png"); // storagePath
        screenshotfile.renameTo(targetfile);

        //webElement

        WebElement element1 = driver.findElement(By.cssSelector("#taskTable"));
        File sourceTableFile = element1.getScreenshotAs(OutputType.FILE);
        File targetfile2 = new File(projectPath+"\\Screenshots\\TablePage.png");
        sourceTableFile.renameTo(targetfile2);
       // FileHandler.copy(sourceTableFile,targetfile2);

        driver.close();

    }
}
