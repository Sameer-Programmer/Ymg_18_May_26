package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_Cond__WebElement_BooleanMethods {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        boolean status1 =driver.findElement(By.cssSelector("input[placeholder='Enter Name']")).isDisplayed();
        System.out.println(status1);
        WebElement name = driver.findElement(By.cssSelector("input[placeholder='Enter Name']"));
        System.out.println(name.getText());
        boolean status2 = name.isEnabled();
        System.out.println(status2);

        WebElement radiobuttonMale =  driver.findElement(By.cssSelector("input[value='male']"));
        System.out.println(radiobuttonMale.isSelected());
        radiobuttonMale.click();
        System.out.println(radiobuttonMale.isSelected());

        driver.quit();




    }
}
