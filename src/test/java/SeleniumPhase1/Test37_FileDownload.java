package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test37_FileDownload {
    public static void main (String [] args) throws InterruptedException {
        String downloadPath = System.getProperty("user.dir")+File.separator+"Downloads";

        Map<String, Object> prefs = new HashMap<>();
        //prefs.put("profile.default_content_settings.popoups",0);
      //  prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.default_directory", downloadPath);
//        prefs.put("download.prompt_for_download", false);
//        prefs.put("download.directory_upgrade", true);
//        prefs.put("safebrowsing.enabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",prefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/upload-download");
        WebElement download = driver.findElement(By.cssSelector("#downloadButton"));
        download.click();

        Thread.sleep(5000);

        File file = new File(downloadPath+File.separator+"sampleFile.jpeg");
        if(file.exists()){
            System.out.println("File Exist Pass");
        }else {
            System.out.println("Test Fail");
        }


    }
}
