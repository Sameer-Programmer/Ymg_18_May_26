package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test8_ChekboxHandling {
  public   static void main(String[] args) throws InterruptedException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
      List<WebElement> checkboxes=
              driver.findElements(By.xpath(" //div[@class='form-group']//input[@type='checkbox']"));
      for(WebElement checkbox:checkboxes){
          checkbox.click();
          Assert.assertTrue(checkbox.isSelected(),"Checkbox is not selected");
      }

        Thread.sleep(5000);

      // Now to unselect first 3 Checkboxes go with normal forloop with index
        for(int i =0; i<3;i++){
            checkboxes.get(i).click();
        }

      Thread.sleep(5000);
      driver.quit();
    }
}
