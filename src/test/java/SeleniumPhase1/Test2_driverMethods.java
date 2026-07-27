package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test2_driverMethods {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url); // open the URL
       // Thread.sleep(5000);
        driver.getTitle(); // retuen the title
        driver.getCurrentUrl(); // return the current URL
        String sourceCode =driver.getPageSource();//return source code of page menus HTML
        //System.out.println(sourceCode);
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);
        String CurrentUrl =driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowIds= driver.getWindowHandles();
        System.out.println(windowIds);

        ArrayList<String> arrayList = new ArrayList<>(windowIds);
        System.out.println(arrayList.get(0));

        driver.close();
        driver.quit();


    }
}


/*
Thread.sleep()-Pause Execution
implicitlywait -- global - wait untill presence of element
 */