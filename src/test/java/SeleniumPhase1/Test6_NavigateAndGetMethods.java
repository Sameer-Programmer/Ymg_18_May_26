package SeleniumPhase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
// Yes, in your code all navigation actions happen in the same browser tab.
public class Test6_NavigateAndGetMethods {
    static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//        String url1= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        //driver.navigate().to(url1); this is also Correct
    URL url= new URL("https://www.naukri.com/mnjuser/recommendedjobs");
       driver.navigate().to(url);
        System.out.println(driver.getCurrentUrl());

       String orangeHRMURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

       driver.navigate().to(orangeHRMURL);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(5000);
        driver.close();
        driver.quit();


    }
}
/*
driver.get() is used mainly to load a webpage,
whereas driver.navigate().to() is part of Selenium's Navigation interface
and allows additional browser navigation actions such as back, forward, and refresh.

driver.get() is mainly used to open a URL in the browser.
driver.navigate() provides additional browser navigation capabilities
 such as to(), back(), forward(), and refresh().
 */