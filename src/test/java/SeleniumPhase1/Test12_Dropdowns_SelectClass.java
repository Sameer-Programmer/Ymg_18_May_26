package SeleniumPhase1;

/*
Dropdowns Types
1- Select Dropdwn
2- Bootstrap Dropdown
3-hidden Dropdown


Select Dropdown
Use Select class
it has Following Methods
selectByVisibleText(); -- VisibleTextWhich we are seeing in the dropdowns
SelectByValue();
SelectByIndex();
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test12_Dropdowns_SelectClass {
    static void main(String[] args) throws InterruptedException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        WebElement dropdown = driver.findElement(By.cssSelector("select[id='country']"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);

        select.selectByValue("germany");
        select.selectByVisibleText("Canada");


        List<WebElement> options = select.getOptions();
        System.out.println(options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }


        // MultiSelectDropdowns

        WebElement coloursdropdown =
                driver.findElement(By.xpath("//select[@id='colors']"));
        Select selectcolours = new Select(coloursdropdown);
        selectcolours.selectByValue("red");
        selectcolours.selectByValue("blue");

        List<WebElement> list =selectcolours.getAllSelectedOptions();
        Assert.assertEquals(list.get(0).getText(),"Red");
        Assert.assertEquals(list.get(1).getText(),"Blue");
        System.out.println("Script ran Success");

        Thread.sleep(3000);
        driver.quit();


    }
}
