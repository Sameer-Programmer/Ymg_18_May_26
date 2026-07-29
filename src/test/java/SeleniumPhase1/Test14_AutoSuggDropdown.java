package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test14_AutoSuggDropdown {
    public static void main(String[] args){
        String url ="https://www.amazon.in/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']"));
        searchBox.sendKeys("Mobiles");

        List<WebElement> list=driver.findElements(By.xpath("//div[@id='sac-autocomplete-results-container']//div[@role='row']"));
       boolean status = false;
        System.out.println(list.size());
        for(WebElement element :list){
            System.out.println(element.getText());
            if (element.getText().contains("mobiles 5g")) {
                status = true;
                //break;
            }

        }
        System.out.println(status);
        Assert.assertTrue( status,"Not contains Mobiles");


        driver.quit();

    }
}
