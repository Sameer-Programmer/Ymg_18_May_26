package SeleniumPhase1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test9_Alert_interface {
    static void main(String[] args) throws InterruptedException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement sampleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        sampleAlert.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


        //Confirmation Alert
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        confirmationAlert.click();
        System.out.println(alert.getText());
         alert.dismiss();
        Thread.sleep(5000);

        //Prompt Alert
        WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        promptAlert.click();
        //Alert alert3 = driver.switchTo().alert();
        alert.sendKeys("Sameer");

        alert.accept();

        // declaration of Explicitwait
        sampleAlert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert4 = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert4.getText());
        alert.accept();



        driver.quit();



    }
}

/*
Alert is an Interface
 */