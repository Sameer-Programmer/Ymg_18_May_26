package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test15_2_WebtableAssignment {
    static void main(String[] args){
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        List<WebElement> coloumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println(coloumns.size());

        //Find the BookNames with Author as Mukesh
        // I rows
        for(int i =2; i<=rows.size(); i++){
            String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
            if(value.equals("Mukesh")){
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
                System.out.println(bookName+"   "+value);
            }
        }


        // caliculate the Price

        int total = 0;
        for(int r =2; r<=rows.size(); r++){
            String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            int price = Integer.parseInt(value);
            total = total+price;


        }
        System.out.println(total);

        int minPrice = Integer.MAX_VALUE;
        int minRow = 0;
        for(int r =2; r<=rows.size(); r++){
            String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            int price = Integer.parseInt(value);
           if(price<minPrice){
               minPrice = price;
                minRow = r;// which price id Lowest we have pick the Book Name i 1 coloumn  and click that
           }

        }
        System.out.println(minPrice);

        WebElement booknameWithLowpriceElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+minRow+"]//td[1]"));
        booknameWithLowpriceElement.click();
        System.out.println(booknameWithLowpriceElement.getText());


        driver.quit();





        // Find the Lowest price
      //  We can store all values in a  ArrayList thne we can sort and pick the first Index
    }
}
